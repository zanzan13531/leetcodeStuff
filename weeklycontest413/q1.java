class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char c1 = coordinate1.charAt(0); // 'a' == 97
        char c2 = coordinate2.charAt(0);
        int n1 = Integer.parseInt(coordinate1.substring(1));
        int n2 = Integer.parseInt(coordinate2.substring(1));
        boolean color1 = c1 % 2 == n1 % 2; // if evenness of both is same then black
        boolean color2 = c2 % 2 == n2 % 2;

        return color1 == color2;
        
    }
}