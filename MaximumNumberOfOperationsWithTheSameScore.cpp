class Solution {
public:
    int maxOperations(vector<int>& nums) {
        if (nums.size() < 2) {
            return 0;
        }
        int count = 0;
        int score = nums[0] + nums[1];
        for (int i = 0; i < nums.size() - 1; i += 2) {
            int firstIndex = i;
            int secondIndex = i+1;
            if (nums[firstIndex] + nums[secondIndex] != score) {
                return count;
            }
            count += 1;
        }
        return count;
    }
};
