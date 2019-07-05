public class HypotenuseManager {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return  squareRootOfNumber(squareOfNumber(x2 - x1) + squareOfNumber(y2 - y1));
    }

    private static double squareOfNumber(double n) {
        return n * n;
    }

    private static double squareRootOfNumber(double n) {
        return Math.sqrt(n);
    }


}
