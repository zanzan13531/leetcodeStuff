class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return (false);
        }
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while (x > 0) {
            digits.add(x % 10);
            x = x / 10;
        }
        for (int i = 0; i < digits.size() / 2; i++) {
            if (digits.get(i) != digits.get(digits.size() - 1 - i)) {
                return (false);
            }
        }
        return (true);
    }
}