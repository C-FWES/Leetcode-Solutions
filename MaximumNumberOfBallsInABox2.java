import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBallsInABox2 {
    public static void main(String[] args) {
        int low = 5;
        int hight = 15;
        System.out.println(countBalls(low, hight));
    }

    public static int countBalls(int lowLimit, int highLimit) {
        int max = -1;
        int[] ballCounts = new int[46];
        int boxIndex = sum(lowLimit);
        ballCounts[boxIndex]+=1;
        for (int i = lowLimit+1; i <= highLimit; i++) {
            int number = i;
            while (number % 10 == 0) {
                boxIndex-=9;
                number/=10;
            }
            boxIndex++;
            ballCounts[boxIndex]++;
        }
        for (int ballCount : ballCounts) {
            if (ballCount > max) {
                max = ballCount;
            }
        }
        return max;
    }

    public static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
