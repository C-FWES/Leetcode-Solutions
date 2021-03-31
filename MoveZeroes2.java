import java.util.ArrayList;
import java.util.List;

public class MoveZeroes2 {
    public static void main(String[] args) {
//            int[] nums = new int[]{0,1,0,3,12};
        int[] nums = new int[]{0, 1};
        moveZeroes(nums);
        System.out.println("ok");
    }

    public static void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>(10000);
        int z = 0;
        int n = 0;
        while (z < nums.length && nums[z] != 0) {
            z++;
        }
        n = z + 1;
        while (true) {
            while (n < nums.length && nums[n] == 0) {
                n++;
            }

            if (n >= nums.length) {
                break;
            }
            nums[z] = nums[n];
            nums[n] = 0;
            z++;
        }

    }
}
