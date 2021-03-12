import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3};
        int target = 6;
        int[] indices = twoSum(nums, target);
        for (int index : indices) {
            System.out.println(index);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(target - nums[i])) {
                indices[1] = i;
                indices[0] = indexMap.get(target - nums[i]);
                break;
            }
            indexMap.put(nums[i], i);
        }
        return indices;
    }
}
