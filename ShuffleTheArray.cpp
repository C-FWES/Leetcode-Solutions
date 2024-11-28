class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        vector<int> res;
        int windowSize = n;
        for (int i = 0; i < nums.size() - n; ++i) {
            res.push_back(nums[i]);
            res.push_back(nums[i + windowSize]);
        }
        return res;
    }
};
