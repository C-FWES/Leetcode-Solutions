class Solution {
public:
    long long countSubstrings(string s, char c) {
        long countOfChar = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s[i] == c) {
                ++countOfChar;
            }
        }
        return countOfChar * (countOfChar + 1) / 2;
    }
};
