public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a, double c) {
        this.a = a;
        this.b = getB();
        this.c = c;
    }

    public  double getA() {
        return getSquareRoot(getSquare(c) - getSquare(b));
    }

    public double getB() {
        return getSquareRoot(getSquare(c) - getSquare(a));
    }

    public double getC() {
        return getSquareRoot(getSquare(b) + getSquare(a));
    }

    public boolean irRightTriangle() {
        return (getSquare(c) == (getSquare(a) + getSquare(b)));
    }

    private double getSquare(double n) {
        return n*n;
    }

    private double getSquareRoot(double n) {
        return Math.sqrt(n);
    }
}
