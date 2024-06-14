class Solution {
public:
    string modifyString(string s) {
        string output = s;
        vector<char> alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y', 'z'};
        // get beginning/ ending
        if (s.size() == 1) {
            output[0] = alpha[0];
            return output;
        }
        if (output[0] == '?') {
            char replace;
            for (int k = 0; k < alpha.size(); ++k) {
                if (alpha[k] != output[1]) {
                    replace = alpha[k];
                }
            }
            output[0] = replace;
        }
        if (output[output.size() - 1] == '?') {
            char replace;
            for (int k = 0; k < alpha.size(); ++k) {
                if (alpha[k] != output[output.size() - 2]) {
                    replace = alpha[k];
                }
            }
            output[output.size() - 1] = replace;
        }
        for (int i = 1; i < s.size() - 1; ++i) {
            if (output[i] == '?') {
                char replace;
                if (output[i-1] != output[i + 1]) {
                    for (int j = 0; j < alpha.size(); ++j) {
                        if (alpha[j] != output[i-1] && alpha[j] != output[i+1]) {
                            replace = alpha[j];
                            break;
                        }
                    }
                } else if (output[i-1] == output[i+1]) {
                    for (int j = 0; j < alpha.size(); ++j) {
                         if (alpha[j] != output[i-1]) {
                            replace = alpha[j];
                            break;
                        }
                    }
                }
                output[i] = replace;
            }
        }
        return output;
    }
};
