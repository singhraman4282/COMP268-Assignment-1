import java.util.ArrayList;

public class HailstoneSequence {

    public static ArrayList<Integer> getHailstoneSequence(int n) {
        ArrayList<Integer> sequence = new ArrayList<Integer>();

        boolean success = false;
        int nextNum = n;

        do {
            nextNum = nextNumberInSequence(nextNum);
            success = (nextNum == 1);
            sequence.add(nextNum);
        } while (!success);

        return sequence;
    }

    private static int nextNumberInSequence(int n) {
        int nextNumber;

        if ((n % 2) == 0) {
            nextNumber = n / 2;
            System.out.println(n + " is even, so I take half: " + nextNumber);
        } else {
            nextNumber = (n * 3) + 1;
            System.out.println(n + " is odd, so I make 3n + 1: " + nextNumber);
        }

        return nextNumber;
    }
}
