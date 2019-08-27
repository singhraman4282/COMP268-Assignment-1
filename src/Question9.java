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
        ArrayList<String> arrayList = Number.iterate();
        for (String s: arrayList) {
            System.out.println(s);
        }
    }



}
