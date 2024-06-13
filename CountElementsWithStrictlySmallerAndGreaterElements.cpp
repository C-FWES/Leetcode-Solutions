class Solution {
public:
    int countElements(vector<int>& nums) {
        int count = 0;
        // get max and min
        int min = INT_MAX;
        int max = INT_MIN;

        for (int i = 0; i < nums.size(); ++i) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        for (int i = 0; i < nums.size(); ++i) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // compare
        for (int i = 0; i < nums.size(); ++i) {
            if (nums[i] != min && nums[i] != max) {
                if (nums[i] > min) {
                    ++count;
                } else if (nums[i] < max) {
                    ++count;
                }
            }
        }

        return count;
    }
};
