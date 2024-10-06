class Solution {
    public int maxGoodNumber(int[] nums) {
        String s1 = Integer.toString(nums[0], 2);
        String s2 = Integer.toString(nums[1], 2);
        String s3 = Integer.toString(nums[2], 2);
        int n1 = Integer.parseInt(s1 + s2 + s3, 2);
        int n2 = Integer.parseInt(s1 + s3 + s2, 2);
        int n3 = Integer.parseInt(s2 + s1 + s3, 2);
        int n4 = Integer.parseInt(s2 + s3 + s1, 2);
        int n5 = Integer.parseInt(s3 + s1 + s2, 2);
        int n6 = Integer.parseInt(s3 + s2 + s1, 2);
        int max = Math.max(n1, n2);
        max = Math.max(max, n3);
        max = Math.max(max, n4);
        max = Math.max(max, n5);
        max = Math.max(max, n6);
        return max;
    }
}