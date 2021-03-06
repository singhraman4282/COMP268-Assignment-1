public class EmployeeSavings extends AddressBook {

    private double accountValue = 0;
    private double[] monthlyInterests;
    private double[] monthlySavings;
    private static final double ANNUAL_INTEREST_RATE = 0.05;
    private static final double MONTHLY_INTEREST_RATE = ANNUAL_INTEREST_RATE/12;
    private double[] accumulatedValues;

    /**
     * Initializer
     */
    public EmployeeSavings(String firstName, String middleName, String lastName, double[] monthlySavings) {
        super(firstName, middleName, lastName);
        this.monthlySavings = monthlySavings;
        this.monthlyInterests = new double[monthlySavings.length];
    }

    /**
     * Initializer
     */
    public EmployeeSavings(String fn, String ln) {
        super(fn, "", ln);

    }

    /**
     * Initializer
     */
    public EmployeeSavings(String fn, String ln, double d1, double d2) {
        super(fn, "", ln);

    }

    /**
     * returns accont value after calculating interest
     * @return double
     */
    public double getAccountValue() {
        accountValue = calculateInterest()[11];
        return accountValue;
    }

    /**
     * calculate interst from accumulated monthly savings
     * @return double
     */
    public double[] calculateInterest() {
        double[] savings = getMonthlySavings();
        accumulatedValues = new double[12];
        double previousMonthInterest = 0;
        for(int i=0;i<12;i++) {
            double generatedInterest = (savings[i] + previousMonthInterest)*(1 + MONTHLY_INTEREST_RATE);
            previousMonthInterest = generatedInterest;
            accumulatedValues[i] = generatedInterest;

        }
        return accumulatedValues;
    }

    /**
     * generates monthly savings
     * @return double[]
     */
    public double[] generateMonthlySavings() {
        monthlySavings = new double[12];
        for (int i=0; i<12; i++) {
            double randomSavings = (int)(Math.random() * 701) + 100;
            monthlySavings[i] = randomSavings;
        }
        return monthlySavings;
    }

    /**
     * return monthly interests
     * @return double[]
     */
    public double[] getMonthlyInterests() {
        accumulatedValues = calculateInterest();
        monthlyInterests = new double[12];
        double lastMonthSavings = 0;
        for (int i=0;i<12;i++) {
            monthlyInterests[i] = accumulatedValues[i] - monthlySavings[i] - lastMonthSavings;
            lastMonthSavings += monthlySavings[i];
        }
        return monthlyInterests;
    }

    /**
     * returns monthly savings
     * @return double[]
     */
    public double[] getMonthlySavings() {
        if (monthlySavings != null)
            return  monthlySavings;
        return generateMonthlySavings();
    }

    /**
     * generates report from employee savings
     * @param arr EmployeeSavings[]
     * @return String
     */
    public static String getReport(EmployeeSavings[] arr) {
        String report = "";

        for(EmployeeSavings employeeSavings: arr) {
            double[] savings = employeeSavings.getMonthlySavings();
            double[] interests = employeeSavings.calculateInterest();
            double[] interestOnly = employeeSavings.getMonthlyInterests();
            report = report + employeeSavings.getFirstName() + " " + employeeSavings.getLastName() + "\n";
            report = report + "Saving       Accumulated amount        Total Interest\n";
            report = report + "=========================================================\n";
            for (int i=0;i<12;i++) {
                report = report + savings[i] + "        " + interests[i] + "        " + interestOnly[i] + "\n";
            }
            report = report + "\n";

        }

        return report;
    }
}