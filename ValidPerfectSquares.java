public class ValidPerfectSquares {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(isPerfectSquare(n));
    }

    public static boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;
        while (start <= end) {
            long mid = (start+end)/2;
            if (mid*mid == num) {
                return true;
            }
            else if (mid * mid < num){
                start = mid+1;
            }
            else if (mid*mid > num) {
                end = mid-1;
            }
        }
        return false;
    }
}
