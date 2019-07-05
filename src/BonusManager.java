public class BonusManager {

    private double monthlyCommitment;
    private Quarter quarter1, quarter2, quarter3, quarter4;

    private double quarterlyBonuses() {
        return (quarter1.getBonus() + quarter2.getBonus() + quarter3.getBonus() + quarter4.getBonus());
    }

    private double yearlyBonus() {
        double yearlySaving = quarter1.getSavings() + quarter2.getSavings() + quarter3.getSavings() + quarter4.getSavings();
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

    public double computeBonus(double commitment, double q1, double q2, double q3, double q4) {
        this.monthlyCommitment = commitment;
        quarter1 = new Quarter(monthlyCommitment, q1);
        quarter2 = new Quarter(monthlyCommitment, q2);
        quarter3 = new Quarter(monthlyCommitment, q3);
        quarter4 = new Quarter(monthlyCommitment, q4);
        return quarterlyBonuses() + yearlyBonus();
    }
}
