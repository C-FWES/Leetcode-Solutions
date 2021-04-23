import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBallsInABox {
    public static void main(String[] args) {
        int low = 1;
        int hight = 10;
        System.out.println(countBalls(low, hight));
    }

    public static int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> boxes = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0;
            int number = i;
            while (number > 0) {
                sum+=number%10;
                number/=10;
            }
            boxes.put(sum, boxes.getOrDefault(sum, 0)+1);
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> entry: boxes.entrySet()) {
            Integer value = entry.getValue();
            if (value > max) {
                max = value;

            }
        }
        return max;
    }
}
