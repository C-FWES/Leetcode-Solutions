class Solution {
public:
    int minIncrementForUnique(vector<int>& nums) {
        int max = *max_element(nums.begin(), nums.end());
        int count = 0;

        vector<int> freq(max + 1 + nums.size(), 0);
        for (int i = 0; i < nums.size(); ++i) {
            freq[nums[i]]+=1;
        }
        // 0 2 2 1 0 0 1
        for (int i = 0; i < freq.size(); ++i) {
            if (freq[i] <= 1) {
                continue; // we dont need to change this one
            }
            int currentFreq = freq[i] - 1;
            freq[i + 1] += currentFreq;
            freq[i] = 1;
            count += currentFreq;
        }
        return count;
    }
};
