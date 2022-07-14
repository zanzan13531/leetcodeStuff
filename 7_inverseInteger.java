class Solution {
    public int reverse(int x) {
        
        if (x == 0 || x == Integer.MIN_VALUE) {
            return (0);
        }
        
        int temp = x;
        boolean isNegative = x < 0;
        if (isNegative) {
            temp = temp * -1;
        }
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while (temp > 0) {
            digits.add(temp % 10);
            temp = temp / 10;
        }
        
        while (digits.get(0) == 0) {
            digits.remove(0);
        }
        
        if (digits.size() < 10) {
            return (compileInteger(digits, isNegative));
        } else if (digits.size() > 10) {
            return (0);
        } else {
            if (digits.get(0) == 2) {
                digits.remove(0);
                int tempy = (compileInteger(digits, isNegative));
                if ((tempy > Integer.MAX_VALUE - 2000000000) || (tempy < Integer.MIN_VALUE + 2000000000)) {
                    return (0);
                } else {
                    digits.add(0, 2);
                    return (compileInteger(digits, isNegative));
                }
                //do stuff
            } else if (digits.get(0) > 2) {
                return (0);
            } else {
                return (compileInteger(digits, isNegative));
            }
        }
    }
    
    private int compileInteger(ArrayList<Integer> digit, boolean isNegative) {
        int temp = 0;
        for (int i = 0; i < digit.size(); i++) {
            temp += digit.get(digit.size() - i - 1) * Math.pow(10, i);
        }
        
        if (isNegative) {
            temp = temp * -1;
        }
        
        return (temp);
    }
}