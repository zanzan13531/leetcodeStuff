class Solution {
    public char kthCharacter(long k, int[] operations) {
        k--;
        int adj = 0;
        while (k > 0) {
            int power = (int) (Math.log(k) / Math.log(2));
            long mod = (long) (Math.pow(2, power));
            adj += operations[power];
            k = k - mod;
            System.out.println(power + " " + mod + " " + adj);
        }
        adj = adj % 26;
        char c = 'a';
        c += adj;
        return (c);

    }
}