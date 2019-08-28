public class Triangle {

    private double a;
    private double b;
    private double c;

    /**
     * intiialzer
     */
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * intiialzer
     */
    public Triangle(double a, double c) {
        this.a = a;
        this.b = getB();
        this.c = c;
    }

    /**
     * returns the value of a using pythagorous theorem
     * @return double
     */
    public  double getA() {
        return getSquareRoot(getSquare(c) - getSquare(b));
    }

    /**
     * returns the value of b using pythagorous theorem
     * @return double
     */
    public double getB() {
        return getSquareRoot(getSquare(c) - getSquare(a));
    }

    /**
     * returns the value of c using pythagorous theorem
     * @return double
     */
    public double getC() {
        return getSquareRoot(getSquare(b) + getSquare(a));
    }

    /**
     * returns whether the triange is a right triangle by checking if the pythagrous theorem applies to it
     * @return boolean
     */
    public boolean irRightTriangle() {
        return (getSquare(c) == (getSquare(a) + getSquare(b)));
    }

    /**
     * returns square of given double
     * @param n double
     * @return double
     */
    private double getSquare(double n) {
        return n*n;
    }

    /**
     * returns squareroot of given double
     * @param n double
     * @return double
     */
    private double getSquareRoot(double n) {
        return Math.sqrt(n);
    }
}
