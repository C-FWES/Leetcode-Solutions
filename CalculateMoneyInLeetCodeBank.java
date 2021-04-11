public class CalculateMoneyInLeetCodeBank {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(totalMoney(n));
    }

    public static int totalMoney(int n) {
        int weeks = n/7;
        int remainderDays = n%7;
        return 28 * weeks + 7 * weeks * (weeks - 1) / 2 + remainderDays * (remainderDays + 1) / 2 + remainderDays * weeks;
    }
}
