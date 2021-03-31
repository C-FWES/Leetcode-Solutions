public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println("ok");
    }

    public static void moveZeroes(int[] nums) {
       //Start at Index 1 and check if leftmost is 0
        //If is 0, swap and then move pointer forward and check if pointer is now on a non zero number
        // If leftmost is 0 again, swap, move pointer forward and check if pointer is now on a non zero number. If it is then still swap but move pointer back onto the non zero
        // number
        // Check if leftmost is 0, swap
        // encounter a non zero pointer, move index onto the element and check again and swap
        // if cannot swap anymore, found solution

        int index = 1;
        while (index != nums.length) {
            if (nums[index-1] == 0) {
                //First time
                if (index == 1) {
                    nums[index - 1] = nums[index];
                    nums[index] = 0;
                    index++;
                    continue;
                }

                if (nums[index] != 0) { // Pointer is not on a 0
                    nums[index - 1] = nums[index];
                    nums[index] = 0;
                    index -= 1; // Move pointer back onto the non 0 element
                } else {
                    index++;
                }
            }
            else {
                index++;
            }
        }
    }

}
