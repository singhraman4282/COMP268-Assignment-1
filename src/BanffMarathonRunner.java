public class BanffMarathonRunner extends AddressBook {

    private int time;
    private int years;

    /**
     * Initializer
     */
    public BanffMarathonRunner(String fn, String ln, int min, int yr) {
        super(fn, "", ln);
        this.time = min;
        this.years = yr;
    }

    /**
     * returns time in seconds it took to complete marathon
     * @return int
     */
    public int getTime() {
        return time;
    }

    /**
     * retunrs number of years since the person has been participating
     * @return int
     */
    public int getYears() {
        return years;
    }

    /**
     * set the number of seconds it took the person to complete the marathon
     * @param time int
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * set the number of years the person has participated
     * @param years int
     */
    public void setYears(int years) {
        this.years = years;
    }

    /**
     * returns the fastest runner
     * @param runners BanffMarathonRunner[]
     * @return BanffMarathonRunner
     */
    public static BanffMarathonRunner getFastestRunner(BanffMarathonRunner[] runners) {
        BanffMarathonRunner fastestRunner = runners[0];

        for (int i=0; i<runners.length; i++) {
            if (runners[i].getTime() < fastestRunner.getTime())
                fastestRunner = runners[i];
        }

        return fastestRunner;
    }

    /**
     * returns the second fastest runner
     *@param runners BanffMarathonRunner[]
     * @return BanffMarathonRunner
     */
    public static BanffMarathonRunner getSecondFastestRunner(BanffMarathonRunner[] runners) {
        BanffMarathonRunner fastestRunner = getFastestRunner(runners);
        BanffMarathonRunner secondFastestRunner = runners[0];
        if (secondFastestRunner.getTime() == fastestRunner.getTime()) {
            secondFastestRunner = runners[1];
        }

        for (int i=0; i<runners.length; i++) {
            if (runners[i].getTime() > fastestRunner.getTime()) {
                if (runners[i].getTime() < secondFastestRunner.getTime()) {
                    secondFastestRunner = runners[i];
                }
            }
        }

        return secondFastestRunner;
    }

    /**
     * returns average time of all runners
     * @param runners BanffMarathonRunner[]
     * @return double
     */
    public static double getAverageTime(BanffMarathonRunner[] runners) {
        double totalTime = 0;
        for (int i=0; i<runners.length; i++) {
            totalTime += runners[i].getTime();
        }

        return totalTime/runners.length;
    }

    /**
     * returns all above average runners
     * @param runners BanffMarathonRunner[]
     * @return String
     */
    public static String getAboveAverageRunners(BanffMarathonRunner[] runners) {
        double averageTime = getAverageTime(runners);
        String details = "";
        for (int i=0; i<runners.length; i++) {
            if (runners[i].getTime() <= averageTime) {
                String runnerDetails = runners[i].getFirstName() + " " + runners[i].getMiddleName() + " " + runners[i].getLastName() + ", " + runners[i].getYears() + " years";
                if (details.length() == 0) {
                    details = runnerDetails;
                } else {
                    details = details + "\n" + runnerDetails;
                }
            }
        }

        return details;
    }


}
