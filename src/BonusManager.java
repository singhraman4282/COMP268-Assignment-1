public class BonusManager {

    private double monthlyCommitment;
    private Quarter quarter1, quarter2, quarter3, quarter4;

    /**
     * returns a sum of all quartely bonuses
     * @return Double
     */
    private double quarterlyBonuses() {
        return (quarter1.getBonus() + quarter2.getBonus() + quarter3.getBonus() + quarter4.getBonus());
    }

    /**
     * returns yearly bonus based on yearly savings
     * @return Double
     */
    private double yearlyBonus() {
        double yearlySaving = quarter1.getSavings() + quarter2.getSavings() + quarter3.getSavings() + quarter4.getSavings();
        double minimumYearlySavings = monthlyCommitment * 12;
        double yearlyBonus = 0;

            //annual bonus is 5% of annual savings if eligible
            if (yearlySaving > minimumYearlySavings) {
            yearlyBonus += yearlySaving * 0.05;

            /*
            If the annual savings exceeds the committed amount by at least 25%, Space Inc. matches the additional
            savings (25% or above) as part of the annual bonus
             */
            if (yearlySaving >= (minimumYearlySavings * 1.25)) {
                yearlyBonus += ((yearlySaving - minimumYearlySavings) * 0.25);
            }
        }
        return yearlyBonus;
    }

    /**
     * computes bonus based on commitment and quarterly savings
     * @param commitment double
     * @param q1 double
     * @param q2 double
     * @param q3 double
     * @param q4 double
     * @return double
     */
    public double computeBonus(double commitment, double q1, double q2, double q3, double q4) {
        this.monthlyCommitment = commitment;
        quarter1 = new Quarter(monthlyCommitment, q1);
        quarter2 = new Quarter(monthlyCommitment, q2);
        quarter3 = new Quarter(monthlyCommitment, q3);
        quarter4 = new Quarter(monthlyCommitment, q4);
        return quarterlyBonuses() + yearlyBonus();
    }
}
