import java.util.ArrayList;

public class Number {

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
