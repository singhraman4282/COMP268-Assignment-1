/*
Space Inc. will give a quarterly and annual bonus to its employees only if the savings of the quarter
and/or the year are greater than or equal to quarterly minimum (monthly commitment x 3) and/or
the annual minimum (monthly commitment x 12) amount, respectively. The quarterly bonus is 3%
of eligible quarterly savings, and the annual bonus is 5% of annual savings if eligible. If the annual
savings exceeds the committed amount by at least 25%, Space Inc. matches the additional savings
(25% or above) as part of the annual bonus.
I. An employee has committed to save $2000 per month. Her quarterly savings are as follows:
Q1 – $5000, Q2 – $7000, Q3 – $4000, and Q4 – $8000.
II. Another employee has committed to save $3000 per month. His quarterly savings are as follows:
Q1 – $6000, Q2 – $9000, Q3 – $10000, and Q4 – $17000.
Write a program to compute the total bonus amount earned by these two employees in the year.
 */

public class Question2 {

    public static void main(String[] args) {
        BonusManager bonusManager = new BonusManager();
        double bonus;
        bonus = bonusManager.computeBonus(2000, 5000, 7000, 4000, 8000);
        System.out.println("Bonus for employee 1: " + bonus);

        bonus = bonusManager.computeBonus(2000, 6000,9000,10000,17000);
        System.out.println("Bonus for employee 2: " + bonus);
    }

}
