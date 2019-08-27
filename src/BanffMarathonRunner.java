public class BanffMarathonRunner extends AddressBook {

    private int time;
    private int years;


    public BanffMarathonRunner(String fn, String ln, int min, int yr) {
        super(fn, "", ln);
        this.time = min;
        this.years = yr;
    }

    public int getTime() {
        return time;
    }

    public int getYears() {
        return years;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public static BanffMarathonRunner getFastestRunner(BanffMarathonRunner[] runners) {
        BanffMarathonRunner fastestRunner = runners[0];

        for (int i=0; i<runners.length; i++) {
            if (runners[i].getTime() < fastestRunner.getTime())
                fastestRunner = runners[i];
        }

        return fastestRunner;
    }

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

    public static double getAverageTime(BanffMarathonRunner[] runners) {
        double totalTime = 0;
        for (int i=0; i<runners.length; i++) {
            totalTime += runners[i].getTime();
        }

        return totalTime/runners.length;
    }

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
