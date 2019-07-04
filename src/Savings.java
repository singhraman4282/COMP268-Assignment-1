public class Savings {

    private double monthlyCommitment;
    private Quarter q1, q2, q3, q4;

    public Savings(double monthlyCommitment, double quarter1Savings, double quarter2Savings, double quarter3Savings, double quarter4Savings) {
        this.monthlyCommitment = monthlyCommitment;
        q1 = new Quarter(monthlyCommitment, quarter1Savings);
        q2 = new Quarter(monthlyCommitment, quarter2Savings);
        q3 = new Quarter(monthlyCommitment, quarter3Savings);
        q4 = new Quarter(monthlyCommitment, quarter4Savings);
    }

    private double quarterlyBonuses() {
        return (q1.getBonus() + q2.getBonus() + q3.getBonus() + q4.getBonus());
    }

    private double yearlyBonus() {
        double yearlySaving = q1.getSavings() + q2.getSavings() + q3.getSavings() + q4.getSavings();
        double minimumYearlySavings = monthlyCommitment * 12;
        double yearlyBonus = 0;
        if (yearlySaving > minimumYearlySavings) {
            yearlyBonus += yearlySaving * 0.05;

            if (yearlySaving >= (minimumYearlySavings * 1.25)) {
                yearlyBonus += ((yearlySaving - minimumYearlySavings) * 0.25);
            }
        }
        return yearlyBonus;
    }

    public double getBonus() {
        return quarterlyBonuses() + yearlyBonus();
    }


}
