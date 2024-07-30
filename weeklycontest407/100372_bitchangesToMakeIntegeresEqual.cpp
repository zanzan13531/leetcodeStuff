class Solution {
public:
    int minChanges(int n, int k) {
        if (n == k) {
            return 0;
        }
        if (n < k) {
            return -1;
        }
        
        int n1 = n;
        int k1 = k;
        
        int changes = 0;
        
        while (n1 > 0) {
            if (n1 % 2 == 0 && k1 % 2 == 1) {
                return -1;
            } else if (n1 % 2 == 1 && k1 % 2 == 0) {
                changes++;
            }
            n1 = n1 / 2;
            k1 = k1 / 2;
        }
        
        return changes;
        
    }
};