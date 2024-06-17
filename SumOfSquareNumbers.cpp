class Solution {
public:
    bool judgeSquareSum(int c) {
        if (c < 2) {
            return true;
        }
        for (long i = 0; i*i <= c; ++i) {
           double b = sqrt(c - (i*i));
           long bLong = (long) b;
           if (i*i + bLong*bLong == c) {
                return true;
           }
        }
        return false;
    }
};
