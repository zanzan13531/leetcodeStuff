class Solution {
    public boolean isValidSudoku(char[][] board) {
        //rows and columns
        for (int i = 0; i < 9; i++) {
            Set<Character> existingRow = new HashSet<Character>();
            Set<Character> existingCol = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                char tempRow = board[i][j];
                char tempCol = board[j][i];
                if (tempRow != '.' && existingRow.contains(tempRow)) {
                    return (false);
                } else {
                    existingRow.add(tempRow);
                }
                if (tempCol != '.' && existingCol.contains(tempCol)) {
                    return (false);
                } else {
                    existingCol.add(tempCol);
                }
            }
            
        }
        //boxes
        for (int i = 1; i < 9; i+=3) {
            for (int j = 1; j < 9; j+=3) {
                Set<Character> existing = new HashSet<Character>();
                for (int k = -1; k < 2; k++) {
                    for (int l = -1; l < 2; l++) {
                        char temp = board[i+k][j+l];
                        if (temp != '.' && existing.contains(temp)) {
                            return (false);
                        } else {
                            existing.add(temp);
                        }
                    }
                }
            }
        }
        return (true);
    }
}