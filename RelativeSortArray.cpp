#include <algorithm>
class Solution {
public:
    vector<int> relativeSortArray(vector<int>& arr1, vector<int>& arr2) {
        unordered_map<int, int> freq;
        vector<int> notInArray;
        for (int i = 0; i < arr2.size(); ++i) {
            freq[arr2[i]] = 0;
        }
        for (int i = 0; i < arr1.size(); ++i) {
            if (freq.find(arr1[i]) != freq.end()) {
                freq[arr1[i]] += 1;
            } else {
                notInArray.push_back(arr1[i]);
            }
        }
        vector<int> output;
        for (int i = 0; i < arr2.size(); ++i) {
            if (freq[arr2[i]] >= 1) {
                int countOfNum = freq[arr2[i]];
                while (countOfNum > 0) {
                    output.push_back(arr2[i]);
                    countOfNum -= 1;
                }
            }
        }
        sort(notInArray.begin(), notInArray.end());
        output.insert(output.end(), notInArray.begin(), notInArray.end());
        return output;
    }
};
