class Solution {
public:
    int getLucky(string s, int k) {
        string use = s;
        int result = 0;
                    vector<char> alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                                  'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                                  's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        while (k > 0) {
            string builder = "";
            int sum = 0;
            for (char c : use) {
                if (find(alpha.begin(), alpha.end(), c) != alpha.end()) {
                    int indexOfChar =
                        (find(alpha.begin(), alpha.end(), c) - alpha.begin()) +
                        1;
                    builder += to_string(indexOfChar);
                } else {
                    builder += c;
                }
            }
               for (char c1 : builder) {
                    sum += c1 - '0';
                }
                --k;
                use = to_string(sum);
                result = sum;
                builder = "";
        }
        return result;
    }
};
