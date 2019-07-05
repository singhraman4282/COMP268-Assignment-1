public class Pythgorous {

    public static double getA(double b, double c) {
        return getSquareRoot(getSquare(c) - getSquare(b));
    }

    public static double getB(double a, double c) {
        return getSquareRoot(getSquare(c) - getSquare(a));
    }

    public static double getC(double a, double b) {
        return getSquareRoot(getSquare(b) + getSquare(a));
    }

    public static boolean irRightAngled(double a, double b, double c) {
        return (getSquare(c) == (getSquare(a) + getSquare(b)));
    }

    private static double getSquare(double n) {
        return n*n;
    }

    private static double getSquareRoot(double n) {
        return Math.sqrt(n);
    }
}
