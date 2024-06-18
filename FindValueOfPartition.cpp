class Solution {
public:
    int findValueOfPartition(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int n = nums.size();
        int minPartitionValue = INT_MAX;
        for (int i = 0; i < n - 1; ++i) {
            int maxNums1 = nums[i];
            int minNums2 = nums[i + 1];
            minPartitionValue = min(minPartitionValue, abs(maxNums1 - minNums2));
        }
        return minPartitionValue;
    }
};
