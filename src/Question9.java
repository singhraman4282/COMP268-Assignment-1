import org.jetbrains.annotations.Contract;

import java.util.ArrayList;

/*
Write a program that iterates through numbers from 0 to 113 using a loop. Print the numbers, one
number per line. As you print each number, say x, also print the following when appropriate,
separated by commas:
I. If the number is odd, print “x is odd”
II. If the number is divisible by 5, print “hi five”
III. If the total of a number (x) and its subsequent number (x+1) is a value divisible by 7, print “wow”
IV. If the number is prime, print “prime”.
 */
public class Question9 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = iterate();
        for (String s: arrayList) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> iterate() {
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i <= 113; i++) {
            String s = "" + i;
            if (isOdd(i)) {
                s = s + " is odd,";
            }

            if (isDivisibleBy5(i)) {
                s = s + " hi five,";
            }

            if (isDivisibleBy7(i + i + 1)) {
                s = s + " wow,";
            }

            if (isPrime(i)) {
                s = s + " prime.";
            }

            arrayList.add(s);
        }


        return arrayList;
    }

    public static boolean isDivisibleBy5(int n) {
        return ((n != 0) && (n % 5 == 0));
    }

    public static boolean isDivisibleBy7(int n) {
        return ((n != 0) && (n % 7 == 0));
    }

    public static boolean isOdd(int n) {
        return (n % 2 != 0);
    }

    public static boolean isPrime(int n) {
        int divisors = 0;
        for (int i = 0; i < n; i++) {
            if (i % n == 0)
                divisors++;
        }

        return (divisors > 0);
    }

}
