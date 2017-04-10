import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by dulun on 25.11.2016.
 */
public abstract class Clustering {

    // centeroids
    protected Point[] centers = null;

    // uzaklik olcegi
    protected DistanceMetric distanceMetric = null;

    // dosyadan okunan veriler
    protected ArrayList<Point> points = new ArrayList<Point>();

    // kumelere ayrilmis verilen tutulmasi
    protected ArrayList<ArrayList<Point>> cluster = new ArrayList<ArrayList<Point>>();

    public Clustering(){}

    public void applyClustering(int param) throws IOException {
        loadDataFromFile();
        initializeClusteringParameters(param);
        implementClustering();
        showClustering();
    }

    /**
     * Verileri dosyadan okur ve points array listine atar.
     * @throws IOException
     */
    private void loadDataFromFile() throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("data.txt"));

        String str = input.readLine();
        while(str != null) {
            StringTokenizer token = new StringTokenizer(str, ", ");
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());
            int z = Integer.parseInt(token.nextToken());
            points.add(new Point(x, y, z));
            str = input.readLine();
        }

        input.close();
    }

    /**
     * Template Method geregi her iki yontem icinde farkli oldugundan
     * abstract tanimlanmistir.
     * Kumelerim merkezlerinin kordinatlarini gosterir.
     */
    public abstract void showClustering();

    /**
     * Yontemlerin parametrelerini alir.
     * Her iki method icinde farklidir.
     * @param param
     */
    public abstract void initializeClusteringParameters(int param);

    /**
     * Yontemlerin her ikisi icinde farklidir.
     * ikiside farkli sekilde implemenet edilir.
     * yontemi implement eder.
     */
    public abstract void implementClustering();
}
