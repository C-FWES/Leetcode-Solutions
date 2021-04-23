public class ArithmeticSlices {
    public static void main(String[] args) {
        int[] n = {1,2,3,4};
        System.out.println(numberOfArithmeticSlices(n));
    }

    public static int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        int arithmeticCount = 0;
        int i = 2;
        int incrementCount = 1;
        while (i < nums.length) {
            if (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) {
                arithmeticCount+=incrementCount;
                incrementCount+=1;
            }
            else {
                incrementCount = 1;
            }
            i++;
        }
        return arithmeticCount;
    }
}
