class Solution {
    public String convert(String s, int numRows) {
        String[][] grid = new String[numRows][s.length() / 2 + 1];
        int dir = -1; // -1 means going down the zig zag, +1 is going up
        int col = 0;
        int row = 0;
        
        if (numRows == 1) {
            return (s);
        }
        
        for (int i = 0; i < s.length(); i++)  {
            
            grid[row][col] = s.substring(i, i + 1);
            
            if (dir == -1) { //if going down
                if (row + 1 < numRows) {
                    row++;
                } else { // switch directions at the bottom row
                    row--;
                    col++;
                    dir = 1;
                }
            } else { //if going up
                if (row - 1 >= 0) {
                    row--;
                    col++;
                } else { //switch directions at the top row
                    row++;
                    dir = -1;
                }
            }
        }
        
        String fin = "";
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length() / 2 + 1; j++) {
                if (grid[i][j] != null) {
                    fin = fin + grid[i][j];
                }
            }
        }
        
        return (fin);
        
    }
}