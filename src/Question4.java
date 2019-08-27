/*
A group of AU friends decide to run the Banff, Alberta, Marathon. Their names, times (marathon
completion time in minutes), and number of years participated are given below:
1 Elena Brandon 341 1
2 Thomas Molson 273 2
3 Hamilton Winn 278 5
4 Suzie Sarandin 329 7
5 Philip Winne 445 9
6 Alex Trebok 275 3
7 Emma Pivoto 275 4
8 John Lenthen 243 1
9 James Lean 334 1
10 Jane Ostin 412 1
11 Emily Car 393 4
12 Daniel Hamshire 299 4
13 Neda Bazdar 343 3
14 Aaron Smith 317 6
15 Kate Hen 265 8

Extend the AddressBook class from Problem 1 to store the additional data. Now, write a method
to find the fastest runner. Print the name, address, and his/her time (in minutes) on three separate
lines.
Find the second fastest runner. Print the name, address, his/her time (in minutes), and the
difference in time with the fastest runner.
Compute the average time of completion taken by these runners.
Finally, print the name and number of years participated for each runner if the runner’s time of
completion is equal to or better than the average time of completion.
 */

public class Question4 {

    public static void main(String[] args) {
        BanffMarathonRunner[] runners = new BanffMarathonRunner[] {
                new BanffMarathonRunner("Elena", "Brandon", 341, 1),
                new BanffMarathonRunner("Thomas", "Molson", 273, 2),
                new BanffMarathonRunner("Hamilton", "Winn", 278, 5),
                new BanffMarathonRunner("Suzie", "Sarandin", 329, 7),
                new BanffMarathonRunner("Philip", "Winne", 445, 9),
                new BanffMarathonRunner("Alex", "Trebok", 275, 3),
                new BanffMarathonRunner("Emma", "Pivoto", 275, 4),
                new BanffMarathonRunner("John", "Lenthen", 243, 1),
                new BanffMarathonRunner("James", "Lean", 334, 1),
                new BanffMarathonRunner("Jane", "Ostin", 412, 1),
                new BanffMarathonRunner("Emily", "Car", 393, 4),
                new BanffMarathonRunner("Daniel", "Hamshire", 299, 4),
                new BanffMarathonRunner("Neda", "Bazdar", 343, 3),
                new BanffMarathonRunner("Aaron", "Smith", 317, 6),
                new BanffMarathonRunner("Kate", "Hen", 265, 8) };

        // Set a default home address for all runners
        for (int i=0; i<runners.length; i++) {
            runners[i].setHomeAddress("345 6 Ave SE 6th Floor, Calgary, AB T2G 4V1");
        }

        // get fastest runner
        System.out.println("Fastest Runner:");
        BanffMarathonRunner fastestRunner = BanffMarathonRunner.getFastestRunner(runners);
        System.out.println("Name: " + fastestRunner.getFirstName() + " " + fastestRunner.getLastName());
        System.out.println("Address: " + fastestRunner.getHomeAddress());
        System.out.println("Time: "  + fastestRunner.getTime());
        System.out.println();


        // next fastest runner
        System.out.println("Second Fastest Runner:");
        BanffMarathonRunner secondRunner = BanffMarathonRunner.getSecondFastestRunner(runners);
        System.out.println("Name: " + secondRunner.getFirstName() + " " + secondRunner.getLastName());
        System.out.println("Address: " + secondRunner.getHomeAddress());
        System.out.println("Time: " + secondRunner.getTime());
        System.out.println("Time diffference: " + (secondRunner.getTime() - fastestRunner.getTime()));
        System.out.println();

        // average completion time for all runners
        double averageTime = BanffMarathonRunner.getAverageTime(runners);
        System.out.println("Average time: " + averageTime);
        System.out.println();

        // above average runners
        System.out.println("Above average runners:");
        String aboveAveragePlayers = BanffMarathonRunner.getAboveAverageRunners(runners);
        System.out.println(aboveAveragePlayers);
    }
}
