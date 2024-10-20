class Solution {
    public int minOperations(int[] nums) {
        int max = nums[nums.length - 1];
        int operations = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            int temp = nums[i];
            if (temp > max) {
                while (temp > max) {
                    int div = divisor(temp);
                    if (div == temp || div == 1) {
                        return -1;
                    }
                    temp = temp / div;
                    operations++;
                }
            }
            max = temp;
        }

        return operations;

    }

    private int divisor(int number) {
        int i;
        for (i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return number/i;
            }
        }
        return 1;
    }
}