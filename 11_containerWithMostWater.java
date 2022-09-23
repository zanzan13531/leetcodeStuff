// time: O(n)
// space: O(1)


class Solution {
    public int maxArea(int[] height) {
        
        int maxWater = Math.min(height[0], height[height.length - 1]) * (height.length - 1);
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            if (height[l] < height[r]) {
                int tempMax = height[l];
                while (l < r && height[l] <= tempMax) {
                    l++;
                }
                if (Math.min(height[l], height[r]) * (r - l) > maxWater) {
                    maxWater = Math.min(height[l], height[r]) * (r - l);
                }
            } else {
                int tempMax = height[r];
                while (l < r && height[r] <= tempMax) {
                    r--;
                }
                if (Math.min(height[l], height[r]) * (r - l) > maxWater) {
                    maxWater = Math.min(height[l], height[r]) * (r - l);
                }
            }
        }
        return (maxWater);
    }
}