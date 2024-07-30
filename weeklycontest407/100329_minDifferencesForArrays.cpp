// This does not work


class Solution {
public:
    long long minimumOperations(vector<int>& nums, vector<int>& target) {
        vector<int> differences;
        for (int i = 0; i < nums.size(); i++) {
            differences.push_back(target[i] - nums[i]);
        }
        
        int minDif = differences[0];
        for (int i = 0; i < nums.size(); i++) {
            if (differences[i] < minDif) {
                minDif = differences[i];
            }
        }
        
        vector<int> differencesDerivative;
        for (int i = 1; i < nums.size(); i++) {
            differencesDerivative.push_back(differences[i - 1] - differences[i]);
        }
        
        int minDiff = differencesDerivative[0];
        int maxDiff = differencesDerivative[0];
        for (int i = 0; i < differencesDerivative.size(); i++) {
            if (differencesDerivative[i] < minDiff) {
                minDiff = differencesDerivative[i];
            }
            if (differencesDerivative[i] > maxDiff) {
                maxDiff = differencesDerivative[i];
            }
        }
        /*
        int change = 0;
        if (abs(minDiff) > abs(maxDiff)) {
            change = minDiff
        }
        for (int i = 0; i < )
        */
        
        long fin = 0;
        for (int i = 0; i < differencesDerivative.size(); i++) {
            fin += abs(differencesDerivative[i]);
        }
        fin += minDif;
        
        return fin;
        
    }
};