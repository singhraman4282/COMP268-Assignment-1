public class Question2 {

    public static void main(String[] args) {
        BonusManager bonusManager = new BonusManager();
        double bonus;
        bonus = bonusManager.computeBonus(2000, 5000, 7000, 4000, 8000);
        System.out.println("Bonus for employee 1: " + bonus);

        bonus = bonusManager.computeBonus(2000, 6000,9000,10000,17000);
        System.out.println("Bonus for employee 2: " + bonus);
    }

}
