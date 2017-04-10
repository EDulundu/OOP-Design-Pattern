import java.util.ArrayList;
import java.util.Random;

public class Kmeans extends Clustering {

    // default istenen cluster sayisi
    private static final int DEFAULT_NUMBER_OF_CLUSTER = 2;

    // cluster sayisi
    private int numberOfCluster = DEFAULT_NUMBER_OF_CLUSTER;

    /**
     * K-Means methodu icin gerekli parametreler initial edilir.
     * @param param number of clusters
     */
    @Override
    public void initializeClusteringParameters(int param) {
        distanceMetric = new EuclideanDistance();
        numberOfCluster = param;
        centers = new Point[numberOfCluster];
        for (int i = 0; i < numberOfCluster; i++)
            cluster.add(new ArrayList<Point>());
    }

    /**
     * K-Means yontemini implement eder.
     */
    @Override
    public void implementClustering() {

        // Rastgele k kadar merkez belirlenir.
        // Ayrica cluster array list'leri initial edilir.
        Random r = new Random();
        for (int i = 0; i < numberOfCluster; i++)
            centers[i] = points.get(r.nextInt(points.size()));

        boolean centroidsChanged = true;
        while(centroidsChanged){

            for (int i = 0; i < numberOfCluster; i++)
                cluster.get(i).clear();

            // noktalarin hangi center'a yakin oldugu bulunur.
            // daha sonra yakın olan nokta o center'in listesine eklenir.
            for (int i = 0; i < points.size(); i++) {

                int close = 0;
                double dist2 = distanceMetric.calculateDistance(centers[0], points.get(i));
                for (int j = 1; j < cluster.size(); j++) {
                    double dist = distanceMetric.calculateDistance(centers[j], points.get(i));
                    if (dist < dist2) {
                        dist2 = dist;
                        close = j;
                    }
                }
                cluster.get(close).add(points.get(i));
            }

            centroidsChanged = false;
            for (int i = 0; i < numberOfCluster; i++) {

                int xSum = 0, ySum = 0, zSum = 0;
                int size = cluster.get(i).size();

                if(size != 0){
                    for (int j = 0; j < cluster.get(i).size(); j++) {
                        Point p = cluster.get(i).get(j);
                        xSum += p.getX();
                        ySum += p.getY();
                        zSum += p.getZ();
                    }

                    xSum /= size;
                    ySum /= size;
                    zSum /= size;

                    Point p = new Point(xSum, ySum, zSum);
                    if(centers[i].getX() != p.getX() || centers[i].getY() != p.getY() || centers[i].getZ() != p.getZ())
                        centroidsChanged = true;
                    centers[i] = p;
                }
            }
        }
    }

    /**
     * Hesaplanan kumelerin merkezleri ekrana basilir.
     */
    @Override
    public void showClustering() {
        if(centers.length != 0){
            System.out.println("For kmeans the clusters are : ");
            for (int i = 0; i < centers.length; i++)
                System.out.println(centers[i].toString());

            int sum = 0;
            for (int i = 0; i < centers.length; i++)
                sum += cluster.get(i).size();
            System.out.println("\ndata size : " + points.size());
            System.out.println("data size in clusters : " + sum);
        }
        else
        {
            System.out.println("No K-Means Clustering!!!");
        }
    }
}
