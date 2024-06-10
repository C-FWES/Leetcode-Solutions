class Solution {
public:
    int heightChecker(vector<int>& heights) {
        int count = 0;
        // counting sort just for funs
        vector<int> expected;
        expected.reserve(heights.size());
        int max = -1;
        // get max
        for (int i = 0; i < heights.size(); ++i) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        // make count vector
        vector<int> countArray(max + 1, 0);
        // store count of each unique number in the index in the countarray
        for (int j = 0; j < heights.size(); ++j) {
            int num = heights[j];
            countArray[num] += 1;
        }
        // update countarray with prefix sums
        for (int k = 1; k < countArray.size(); ++k) {
            countArray[k] = countArray[k - 1] + countArray[k];
        }
        // update output array
        for (int l = heights.size() - 1; l >= 0; --l) {
            expected[countArray[heights[l]] - 1] = heights[l];
            countArray[heights[l]] = countArray[heights[l]] - 1;
        }

        // check differences with heights and expected
        for (int m = 0; m < heights.size(); ++m) {
            if (expected[m] != heights[m]) {
                ++count;
            }
        }

        return count;
    }
};
