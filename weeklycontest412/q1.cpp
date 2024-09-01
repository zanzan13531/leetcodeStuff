class Solution {
public:
    vector<int> getFinalState(vector<int>& nums, int k, int multiplier) {
        for (; k > 0; k--) {
            int indexmin = 0;
            int min = nums[0];
            for (int i = 0; i < nums.size(); i++) {
                if (nums[i] < min) {
                    min = nums[i];
                    indexmin = i;
                }
            }
            nums[indexmin] = nums[indexmin] * multiplier;
        }   
        return nums;
    }
};