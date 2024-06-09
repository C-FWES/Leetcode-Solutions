class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        // initialize an empty map to use as a prefix map
        map<int, int> prefixMap;
        // loop through nums vector
        int currentSubarraySum = 0;
        int count = 0;
        prefixMap[0] = 1; // zero is always a multiple of k
        for (int i = 0; i < nums.size(); ++i) {
            currentSubarraySum += nums[i];
            int currentRemainder = ((currentSubarraySum % k) + k) %k; // make remainder always positive
            count += prefixMap[currentRemainder]; // increment result every time remainder is seen
            prefixMap[currentRemainder] += 1;
        }
        return count;
    }
};
