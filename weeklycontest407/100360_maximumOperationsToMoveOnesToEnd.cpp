class Solution {
public:
    int maxOperations(string s) {
        int gaps = 0;
        
        int totalOps = 0;
        
        int continuous1s = 0;
        int continuous0s = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.at(i) == '0') {
                if (continuous0s == 0) {
                    // add in the continuous1s * gaps
                    totalOps += gaps * continuous1s;
                    gaps++;
                    continuous0s = 1;
                    continuous1s = 0;
                } else {
                    continuous0s++;
                    continuous1s = 0;
                }
            } else {
                if (continuous1s == 0) {
                    continuous0s = 0;
                    continuous1s = 1;
                } else {
                    continuous1s++;
                }
            }
        }
        totalOps += gaps * continuous1s;
        
        return totalOps;
        
    }
};