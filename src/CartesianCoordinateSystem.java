public class CartesianCoordinateSystem {

    /**
     * calculates distance between two coordinates
     * @param x1 double
     * @param y1 double
     * @param x2 double
     * @param y2 double
     * @return
     */
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return  squareRootOfNumber(squareOfNumber(x2 - x1) + squareOfNumber(y2 - y1));
    }

    /**
     * returns square of a given number
     */
    private static double squareOfNumber(double n) {
        return n * n;
    }

    /**
     * returns square root of a given number
     */
    private static double squareRootOfNumber(double n) {
        return Math.sqrt(n);
    }


}
