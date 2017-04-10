import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dulun on 25.11.2016.
 */
public class ClusteringDemo {

    public static void main(String[] args) throws IOException {

        try {

            int numberOfCluster = 0;
            int bandwidth = 0;

            do {
                System.out.println("1) K-Means , 2) MeanShift , 3) Exit");
                System.out.print("> ");
                Scanner in = new Scanner(System.in);
                int select = in.nextInt();

                switch (select) {
                    case 1:
                        System.out.print("Please Enter number of cluster > ");
                        numberOfCluster = in.nextInt();
                        Clustering c = new Kmeans();
                        c.applyClustering(numberOfCluster);
                        break;

                    case 2:
                        System.out.print("Please Enter bandwidth > ");
                        bandwidth = in.nextInt();
                        Clustering c2 = new MeanShift();
                        c2.applyClustering(bandwidth);
                        break;

                    case 3:
                        System.exit(0);

                    default:
                        System.out.println("Wrong Selection");
                        break;
                }
            } while (true);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
