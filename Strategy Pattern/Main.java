import algorithm.MorphoExt;
import algorithm.MorphoInt;
import algorithm.SmoothingAverage;
import algorithm.SmoothingMedian;
import filter.EdgeDetect;
import filter.Filter;
import filter.Smooth;
import vpt.algorithms.display.Display2D;
import vpt.algorithms.io.Load;
import java.util.Scanner;

/**
 * Created by safa emre dulundu on 27.10.2016.
 */
public class Main {

    public static void main(String[] args) {

        Filter filter = null;

        do{
            System.out.println("1) Edge Detection , 2) Smoothing , 3) Exit");
            Scanner in = new Scanner(System.in);
            int select = in.nextInt();

            switch (select){

                case 1:
                    EdgeDetect edge = new EdgeDetect();
                    System.out.println("1) MorphoInt , 2) MorphoExt");
                    select = in.nextInt();

                    switch (select){
                        case 1:
                            edge.setFilterAlgo(new MorphoInt());
                            break;
                        case 2:
                            edge.setFilterAlgo(new MorphoExt());
                            break;
                    }
                    filter = edge;
                    Display2D.invoke(filter.useFilter(Load.invoke("lena.png")));
                    break;

                case 2:
                    Smooth smooth = new Smooth();
                    System.out.println("1) Average , 2) Median");
                    select = in.nextInt();

                    switch (select){
                        case 1:
                            smooth.setFilterAlgo(new SmoothingAverage());
                            break;
                        case 2:
                            smooth.setFilterAlgo(new SmoothingMedian());
                            break;
                    }
                    filter = smooth;
                    Display2D.invoke(filter.useFilter(Load.invoke("lena.png")));
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Wrong Selection");
                    break;
            }
        }while(true);
    }
}
