class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
      for (int windowSize = 2; windowSize <= nums.size(); ++windowSize) {
            for (int i = 0; i <= nums.size() - windowSize; ++i) {
                int currentWindowSum = 0;
                for (int j = i; j < i + windowSize; ++j) {
                    currentWindowSum += nums[j];
                }
                if (currentWindowSum == 0 || (k != 0 && currentWindowSum % k == 0)) {
                    return true;
                }
            }
        }
        return false;
    }
};
