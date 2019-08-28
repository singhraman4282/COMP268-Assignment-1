public class Quarter {

    private double monthlyCommitment;
    private double quarterlySavings;

    /**
     * returns quarterly minimum based on monthly commitment
     * @return
     */
    private double quarterlyMinimum() {
        return monthlyCommitment * 3;
    }

    /**
     * Initializer
     * @param monthlyCommitment double
     * @param quarterlySavings double
     */
    public Quarter(double monthlyCommitment, double quarterlySavings) {
        this.monthlyCommitment = monthlyCommitment;
        this.quarterlySavings = quarterlySavings;
    }

    /**
     * generates bones based on whether the person qualifies for a bonus
     * @return
     */
    public double getBonus() {
        if (shouldGetQuarterlyBonus()) {
            return quarterlySavings * 0.03;
        }
        return 0;
    }

    /**
     * retunrs savings for the given quarter
     * @return double
     */
    public double getSavings() {
        return quarterlySavings;
    }

    /**
     * returns whether a person deserves quarterly bonus based on quarterly minumym and their savings for that quarter
     * @return
     */
    private boolean shouldGetQuarterlyBonus() {
        return (quarterlySavings >= quarterlyMinimum());
    }
}
