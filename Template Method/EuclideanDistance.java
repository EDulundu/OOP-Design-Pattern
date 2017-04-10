import java.util.ArrayList;

/**
 * Created by dulun on 27.11.2016.
 */
public class EuclideanDistance implements DistanceMetric {

    /**
     * Distance hesaplar.
     * @param p point 1
     * @param p2 point 2
     * @return ||p - p2||^2
     */
    @Override
    public double calculateDistance(Point p, Point p2){

        double result = 0;

        double xDistance =  Math.pow( Math.abs( p.getX() - p2.getX()), 2);
        double yDistance =  Math.pow( Math.abs( p.getY() - p2.getY()), 2);
        double zDistance =  Math.pow( Math.abs( p.getZ() - p2.getZ()), 2);

        result = Math.sqrt(xDistance + yDistance + zDistance);

        return result;
    }
}
