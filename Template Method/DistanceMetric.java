

/**
 * Sadece oklid ile degil baska metric ekleyebilmek icin interface yapildi.
 */
public interface DistanceMetric {

    /**
     * uzakligi hesaplar.
     * @param p point 1
     * @param p2 point 2
     * @return ||p - p2||^2
     */
    double calculateDistance(Point p, Point p2);
}
