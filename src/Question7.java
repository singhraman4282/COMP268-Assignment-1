/*
Douglas Hofstadter’s Pulitzer-prize-winning book Gödel, Escher, Bach contains many interesting
mathematical puzzles. In Chapter XII, Hofstadter mentions a wonderful problem that is well within
the scope of the control statements in Java. The problem can be expressed as follows: Pick some
positive integer and call it n. If n is even, divide it by two. If n is odd, multiply it by three and add
one. Continue this process until n is equal to 1. Hofstadter illustrates this process with the following
example, starting with the number n = 15:
15 is odd, so I make 3n+1: 46
46 is even, so I take half: 23
23 is odd, so I make 3n+1: 70
70 is even, so I take half: 35
35 is odd, so I make 3n+1: 106
106 is even, so I take half: 53
53 is odd, so I make 3n+1: 160
160 is even, so I take half: 80
80 is even, so I take half: 40
40 is even, so I take half: 20
20 is even, so I take half: 10
10 is even, so I take half: 5
5 is odd, so I make 3n+1: 16
16 is even, so I take half: 8
8 is even, so I take half: 4
4 is even, so I take half: 2
2 is even, so I take half: 1
As you can see from this example, the numbers go up and down, but eventually—at least for all
numbers that have ever been tried—come down to end in 1. In some respects, this process is
reminiscent of the formation of hailstones, which get carried upward by the winds over and over again before they finally descend to the ground. Because of this analogy, this sequence of numbers
is usually called the Hailstone sequence, although it goes by many other names as well.
Write a program that reads in a number from the user and then displays the Hailstone sequence for
that number, followed by a line showing the number of steps taken to reach 1.
 */

import java.util.ArrayList;

public class Question7 {

    public static void main(String[] args) {
        ArrayList<Integer> sequence = getHailstoneSequence(15);
    }

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
