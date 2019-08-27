/*
Write a program that prompts the user to enter two points (x1, y1) and (x2, y2). Calculate and
display the distance between the two points using the formula below. Round the answer up to 2
decimal points. You can use Math.pow(a,0.5) to compute the square root of an expression.
Math.pow() returns a double.
For example, the distance between the points (−2, −3) and (−4, 4) is approximately 7.28, as shown
below.
 */

public class Question3 {

    public static void main(String[] args) {
        double answer = CartesianCoordinateSystem.calculateDistance(-4,4,-2,-3);
        System.out.println(answer);
    }

}
