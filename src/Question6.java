/*
“The Pythagorean Theorem relates the lengths of the three sides of any right triangle. The legs of a
right triangle (the two sides of the triangle that meet at the right angle) are customarily labelled as
having lengths “a” and “b”, and the hypotenuse (the long side of the triangle, opposite the right
angle) is labelled as having length “c”. The lengths are related by the following equation: a ^2 + b^2
= c ^2.” – refer to http://www.purplemath.com/modules/pythagthm.htm for details.
This equation allows you to find the length of a side of a right triangle when they’ve given you the
lengths for the other two sides, and, going in the other direction, allows you to determine if a
triangle is a right triangle when they’ve given you the lengths for all three sides.
This equation can alternatively be written as c = sqrt of (a^2+b^2). You can find the square root of a
number by calling the standard function Math.sqrt. For example, the statement double y =
Math.sqrt(x) sets y to the square root of x.
 */

public class Question6 {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /*
    I. Given the right triangles described below, write a program to compute the lengths of the
remaining sides using a program.
a. a = 48 and c = 80
b. a = 84 and c = 91
     */
    private static void exercise1() {
        exercise1Part1();
        exercise1Part2();
    }

    private static void exercise1Part1() {
        double a;
        double b;
        double c;

        a = 48;
        c = 75;

        Triangle t = new Triangle(a,c);
        b = t.getB();

        System.out.println(b);
    }

    private static void exercise1Part2() {
        double a;
        double b;
        double c;

        a = 84;
        c = 91;

        Triangle t = new Triangle(a,c);
        b = t.getB();

        System.out.println(b);
    }

    /*
    II. Determine if the following triangles are right-angled triangles:
a. a = 45, b = 55, and c = 75
b. a = 28, b = 45, and c = 53
     */
    private static void exercise2() {
        exercise2Part1();
        exercise2Part2();
    }

    private static void exercise2Part1() {
        double a;
        double b;
        double c;

        a = 45;
        b = 55;
        c = 75;

        Triangle t = new Triangle(a,b,c);

        boolean isRightAngled = t.irRightTriangle();
        System.out.println(isRightAngled);
    }

    private static void exercise2Part2() {
        double a;
        double b;
        double c;

        a = 28;
        b = 45;
        c = 53;

        Triangle t = new Triangle(a,b,c);

        boolean isRightAngled = t.irRightTriangle();
        System.out.println(isRightAngled);
    }


}
