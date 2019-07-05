public class Triangle {

    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public  double getA(double b, double c) {
        return getSquareRoot(getSquare(c) - getSquare(b));
    }

    public double getB(double a, double c) {
        return getSquareRoot(getSquare(c) - getSquare(a));
    }

    public double getC(double a, double b) {
        return getSquareRoot(getSquare(b) + getSquare(a));
    }

    public boolean irRightTriangle(double a, double b, double c) {
        return (getSquare(c) == (getSquare(a) + getSquare(b)));
    }

    private double getSquare(double n) {
        return n*n;
    }

    private double getSquareRoot(double n) {
        return Math.sqrt(n);
    }
}
