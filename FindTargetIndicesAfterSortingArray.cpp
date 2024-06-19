class Solution {
public:
    vector<int> targetIndices(vector<int>& nums, int target) {
        // funny sort
        vector<int> sorted(nums.size());
        int max = *max_element(nums.begin(), nums.end());
        vector<int> countArray(max+1, 0);
        for (int i = 0; i < nums.size(); ++i) {
            countArray[nums[i]] += 1;
        }
        // update countarray with prefix sum
        for (int i = 1; i < countArray.size(); ++i) {
            countArray[i] = countArray[i - 1] + countArray[i];
        }
        // update sorted array
        for (int i = nums.size() - 1; i >= 0; --i) {
            sorted[countArray[nums[i]] - 1] = nums[i];
            countArray[nums[i]] = countArray[nums[i]] - 1;
        }
        // get instances of  matching index
        vector<int> matched;
        for (int i = 0; i < sorted.size(); ++i) {
            if (sorted[i] == target) {
                matched.push_back(i);
            }
        }
        return matched;
    }
};
