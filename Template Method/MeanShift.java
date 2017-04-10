import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dulun on 25.11.2016.
 */
public class MeanShift extends Clustering {

    // default EPSILON VALUE
    private static final double EPSILON = 0.000001;

    // default bandwidth value
    private static final int DEFAULT_BANDWIDTH = 3;

    // parametre bandwidth
    private int bandwidth = DEFAULT_BANDWIDTH;

    public MeanShift(){}

    /**
     * Mean Shift methodu icin gerekli parametreler initial edilir.
     * @param param bandwidth
     */
    @Override
    public void initializeClusteringParameters(int param) {
        distanceMetric = new EuclideanDistance();
        this.bandwidth = param;
    }

    /**
     * MeanShift yontemini implement eder.
     */
    @Override
    public void implementClustering() {

        // shift edilen noktalari ayirt edebilmek icin boolean arrayi olusturulur.
        // shift edilene tekrar ugramamayi saglar.
        ArrayList<Point> shiftedPoints = points;
        boolean[] isShift = new boolean[points.size()];

        // ilk olarak hepsini false koyulur.
        for (int i = 0; i < isShift.length; i++)
            isShift[i] = false;


        double max_distance;
        do{
            max_distance = 0;
            // her bir nokta icin etrafinda cemberler cizilir.
            // shift edilen miktar bulunur.
            // max_shift bulunur sonra.
            // maxshift belirli bir epsilondan kucukse kumeleme biter.
            for (int i = 0; i < shiftedPoints.size(); i++) {
                if(!isShift[i]){

                    // shift edilir.
                    Point newPoint = shift(shiftedPoints.get(i), points);

                    // shift edilme miktarı bulunur.
                    double shiftDistance = distanceMetric.calculateDistance(newPoint, shiftedPoints.get(i));

                    if(shiftDistance > max_distance)
                        max_distance = shiftDistance;

                    if(shiftDistance <= EPSILON)
                        isShift[i] = true;

                    shiftedPoints.set(i, newPoint);
                }
            }
        }while(max_distance > EPSILON);

        extractClusters(shiftedPoints);
    }

    /**
     * Kumelenme sonuclarini ekrana basar.
     */
    @Override
    public void showClustering() {
        if(centers != null && centers.length != 0){
            System.out.print("For meanshift we have found " + centers.length + " clusters:");
            for (int i = 0; i < centers.length; i++)
                System.out.print(centers[i].toString() + ", ");

            int sum = 0;
            for (int i = 0; i < centers.length; i++)
                sum += cluster.get(i).size();
            System.out.println("\ndata size : " + points.size());
            System.out.println("data size in clusters : " + sum);
        }
        else
        {
            System.out.println("No Mean Shift Clustering!!!");
        }
    }

    /**
     * Kumeleri farkli arraylere cikartir.
     * Merkezleri belirler.
     * @param shiftedPoints shift edilen noktalar kumesi.
     */
    private void extractClusters(ArrayList<Point> shiftedPoints){

        // hocam burasi biraz hayali oldu implement kismi cok uzun suruyor yani yakınsamasını bekledim
        // uzun surunce burayi yukarisini beklemeden yazdim.
        for (int i = 0; i < shiftedPoints.size(); i++) {

            int j = 0;
            while(j < points.size() &&
                    EPSILON >= distanceMetric.calculateDistance(shiftedPoints.get(i), points.get(j)))
                ++j;

            cluster.get(j).add(points.get(i));
        }

        if(cluster.size() != 0){
            centers = new Point[cluster.size()];
            for (int i = 0; i < centers.length; i++) {
                centers[i] = cluster.get(i).get(0);
            }
        }
    }

    /**
     * Verilen bir noktayi her bir nokta icin cember cizerek shift eder.
     * @param estimate Verilen bir nokta.
     * @param p tum noktalar pointi
     * @return shift edilmis yeni posizyondaki nokta.
     */
    private Point shift(Point estimate, ArrayList<Point> p){

        double shiftX = 0;
        double shiftY = 0;
        double shiftZ = 0;
        double totalWeight = 0;

        for (int i = 0; i < p.size(); i++) {
            Point temp = p.get(i);

            double dist = distanceMetric.calculateDistance(estimate, temp);
            // gaussian uygulanir.
            double weight = kernel(dist, bandwidth);

            shiftX += temp.getX() * weight;
            shiftY += temp.getY() * weight;
            shiftZ += temp.getZ() * weight;
            totalWeight += weight;
        }

        shiftX = shiftX / totalWeight;
        shiftY = shiftY / totalWeight;
        shiftZ = shiftZ / totalWeight;

        return new Point((int)shiftX, (int)shiftY, (int)shiftZ);
    }

    /**
     * Gaussian yontemi ile hesaplanir.
     * @param distance shift miktari
     * @param bandwidth yaricap
     * @return gaussian hesabi
     */
    private double kernel(double distance, int bandwidth){

        double result = Math.exp(-1.0/2.0 * (distance * distance) / (bandwidth * bandwidth));

        return result;
    }
}
