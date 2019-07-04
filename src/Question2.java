public class Question2 {

    public static void main(String[] args) {
        Savings s1 = new Savings(2000, 5000, 7000, 4000, 8000);
        double bonus = s1.getBonus();
        System.out.println(bonus);
        Savings s2 = new Savings(2000, 6000,9000,10000,17000);
        bonus = s2.getBonus();
        System.out.println(bonus);
    }

}
