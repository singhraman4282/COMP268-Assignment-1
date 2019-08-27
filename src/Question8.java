/*
Google Inc. is looking to recruit three of the Boston runners. The criteria for selection are as follows:
I. Average final marks in bachelor’s degree (store up to 2 decimal places). The fifteen candidates
have the following grades: 82.30%, 85.10%, 77.77%, 69.93%, 93.03%, 88.61%, 55.99%, 87.49%,
88.00%, 91.20%, 66.79%, 76.65%, 55.89%, 90.01%, and 87.9%.
II. Ability to communicate as one of the three values – “excellent”, “average”, and “poor”. The
fifteen candidates have the following ability to communicate, respectively: poor, poor, average,
average, average, poor, excellent, excellent, excellent, average, excellent, average, excellent,
excellent, poor.
III. Innovation as one of the two values – “brilliant” and “average” (store as a Boolean; brilliant =
true and average = false). The fifteen candidates have the following innovative abilities:
brilliant, average, average, average, brilliant, brilliant, average, brilliant, average, brilliant,
average, brilliant, brilliant, average, average.
IV. Ability to regulate one’s own skill as a probability value between 0 and 1.0 – 1.0 implies
excellent regulatory capabilities and 0.0 implies no skills to regulate (store as a double). The
fifteen candidates have the following regulatory abilities: 0.5, 1.0, 0.8, 0.0, 1.0, 0.7, 0.8, 0,9, 0.5,
0.6, 0.3, 0.2, 0.5, 0.3, 0.8.
Store these values for the fifteen candidates in an extended AddressBook class. In general, Google
will not consider a candidate with average marks of less than 85%. Google will consider a candidate
with average marks of less than 85% only if the candidate at least has 0.5 regulatory abilities and at
least ‘average’ ability to communicate. Google will only consider a candidate with poor
communication ability if the candidate has a ‘brilliant’ innovation capability. Write a program that
will help Google to programmatically determine eligibility of the fifteen candidates for these
positions, and print the output on the console.
 */

import java.util.ArrayList;

public class Question8 {

    public static void main(String[] args) {

        Candidate[] candidates = new Candidate[] {
                new Candidate("Elena", "Brandon", true, 82.30, 0.5, "poor"),
                new Candidate("Thomas", "Molson", false, 85.10, 1.0, "poor"),
                new Candidate("Hamilton", "Winn", false, 77.77, 0.8, "average"),
                new Candidate("Suzie", "Sarandin", false, 69.93, 0.0, "average"),
                new Candidate("Philip", "Winne", true, 93.03, 1.0, "average"),
                new Candidate("Alex", "Trebok", true, 88.61, 0.7, "poor"),
                new Candidate("Emma", "Pivoto", false, 55.99, 0.8, "excellent"),
                new Candidate("John", "Lenthen", true, 87.49, 0.9, "excellent"),
                new Candidate("James", "Lean", false, 88.00, 0.5, "excellent"),
                new Candidate("Jane", "Ostin", true, 91.20, 0.6, "average"),
                new Candidate("Emily", "Car", false, 66.79, 0.3, "excellent"),
                new Candidate("Daniel", "Hamshire", true, 76.65, 0.2, "average"),
                new Candidate("Neda", "Bazdar", true, 55.89, 0.5, "excellent"),
                new Candidate("Aaron", "Smith", false, 90.01, 0.3, "excellent"),
                new Candidate("Kate", "Hen", false, 87.9, 0.8, "poor") };

        ArrayList<Candidate> eligibleCandidates = Candidate.getEligibleCandidates(candidates);

        System.out.println("Eligible Candidates:");
        System.out.println("Total: " + eligibleCandidates.size());

        for (Candidate c: eligibleCandidates) {
            System.out.println(c.getFirstName() + " " + c.getLastName() + ", innovation: " + c.isInnovative() + ", grade: " + c.getGrade() + ", regulation: " + c.getRegulation() + ", comunication: " + c.getCommunication());
        }

    }
}
