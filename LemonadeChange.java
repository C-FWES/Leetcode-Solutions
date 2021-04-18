public class LemonadeChange {
    public static void main(String[] args) {

    }

    public static boolean lemonadeChange(int[] bills) {
        int nOfFive = 0;
        int nOfTen = 0;
        int nOfTwenty = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                nOfFive+=1;
            }
            if (bills[i] == 10) {
                if (nOfFive==0) {
                    return false;
                }
                nOfFive-=1;
                nOfTen+=1;
            }
            if (bills[i] == 20) {
                if (nOfFive > 0 && nOfTen > 0) {
                    nOfFive-=1;
                    nOfTen-=1;
                }
                else if (nOfFive >= 3) {
                    nOfFive-=3;
                }
                else {
                    return false;
                }
                nOfTwenty+=1;
            }
        }
        return true;
    }
}
