public class EmployeeSavings extends AddressBook {

    private double accountValue = 0;
    private double[] monthlyInterests;
    private double[] monthlySavings;
    private static final double ANNUAL_INTEREST_RATE = 0.05;
    private static final double MONTHLY_INTEREST_RATE = ANNUAL_INTEREST_RATE/12;

    public EmployeeSavings(String firstName, String middleName, String lastName, double[] monthlySavings) {
        super(firstName, middleName, lastName);
        this.monthlySavings = monthlySavings;
        this.monthlyInterests = new double[monthlySavings.length];
    }

    public EmployeeSavings(String fn, String ln) {
        super(fn, "", ln);

    }

    public EmployeeSavings(String fn, String ln, double d1, double d2) {
        super(fn, "", ln);

    }

    public double getAccountValue() {
        return accountValue;
    }

    public double[] calculateInterest() {
        double[] savings = generateMonthlySavings();
        monthlyInterests = new double[12];
        double previousMonthInterest = 0;
        for(int i=0;i<12;i++) {
            double generatedInterest = (savings[i] + previousMonthInterest)*(1 + MONTHLY_INTEREST_RATE);
            previousMonthInterest = generatedInterest;

            monthlyInterests[i] = generatedInterest;
        }
        return monthlyInterests;
    }

    public double[] generateMonthlySavings() {
        monthlySavings = new double[12];
        for (int i=0; i<12; i++) {
            double randomSavings = 100;//(int)(Math.random() * 601) + 200;
            monthlySavings[i] = randomSavings;
        }
        return monthlySavings;
    }

    public double[] getMonthlyInterests() {
        return monthlyInterests;
    }

    public double[] getMonthlySavings() {
        return monthlySavings;
    }

    public static String getReport(EmployeeSavings[] arr) {
        return "";
    }
}
