public class Quarter {

    private double monthlyCommitment;
    private double quarterlySavings;


    private double quarterlyMinimum() {
        return monthlyCommitment * 3;
    }

    public Quarter(double monthlyCommitment, double quarterlySavings) {
        this.monthlyCommitment = monthlyCommitment;
        this.quarterlySavings = quarterlySavings;
    }

    public double getBonus() {
        if (shouldGetQuarterlyBonus()) {
            return quarterlySavings * 0.03;
        }
        return 0;
    }

    public double getSavings() {
        return quarterlySavings;
    }

    private boolean shouldGetQuarterlyBonus() {
        return (quarterlySavings >= quarterlyMinimum());
    }
}
