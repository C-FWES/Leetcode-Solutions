public class BinarySearchI {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (true) {
            if (target >= nums[start] && target <= nums[end]) {
                if (end - start == 0) {
                    return end;
                }
                else if (end - start == 1) {
                    if (target == nums[start]) {
                        return start;
                    }
                    else if (target == nums[end]) {
                        return end;
                    }
                    else {
                        return -1;
                    }
                }
                else {
                    int mid = (end - start)/2 + start;
                    if (target >= nums[start] && target <= nums[mid]) {
                        end = mid;
                    }
                    else if (target >= nums[mid + 1] && target <= nums[end]) {
                        start = mid+1;
                    }
                    else {
                        return -1;
                    }
                }
            }
            else {
                return -1;
            }
        }
    }
}
