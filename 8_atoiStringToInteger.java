class Solution {
    public int myAtoi(String s) {
        
        try {
        
            String temp = s;
            String number = "";
            boolean isNegative = false;
            while (temp.charAt(0) == ' ') {
                temp = temp.substring(1);
            }
        
            if (temp.length() > 0) {
                if (temp.charAt(0) == '-') {
                    isNegative = true;
                    temp = temp.substring(1);
                } else if (temp.charAt(0) == '+'){
                    temp = temp.substring(1);
                }
            }
        
            while ((temp.length() > 0) && (Character.isDigit(temp.charAt(0)))) {
                number = number + temp.charAt(0);
                temp = temp.substring(1);
            }
            
            if (number.equals("")) {
                return (0);
            }
        
            try {
                int result = Integer.parseInt(number);
                if (isNegative) {
                    return (-1 * result);
                } else {
                    return (result);
                }
            } catch (NumberFormatException e) {
                if (isNegative) {
                    return (Integer.MIN_VALUE);
                } else {
                    return (Integer.MAX_VALUE);
                }
            }
        } catch (Exception e) {
            return (0);
        }
    }
}