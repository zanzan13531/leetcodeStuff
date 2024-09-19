// time: O(m * n) where the grid is m by n
// space: O(m * n)

// the runtime follows those rules but I wrote it inefficiently so its pretty slow


class Solution {
    
    private class Pos {
        int x;
        int y;
        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public int numIslands(char[][] grid) {
        int c = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    removeNeighbors(grid, i, j);
                    c++;
                }
            }
        }
        return (c);
    }
    
    private void removeNeighbors(char[][] grid, int x, int y) {
        Stack<Pos> moves = new Stack<Pos>();
        moves.push(new Pos(x, y));
        while (!moves.isEmpty()) {
            Pos p = moves.pop();
            grid[p.x][p.y] = 0;
            getValidNeighbors(moves, grid, p.x, p.y);
        }
    }
    
    private void getValidNeighbors(Stack<Pos> moves, char[][] grid, int x, int y) {
        if (x > 0 && grid[x-1][y] == '1') {
            moves.push(new Pos(x-1, y));
        }
        if (y > 0 && grid[x][y-1] == '1') {
            moves.push(new Pos(x, y-1));
        }
        if (x < grid.length - 1 && grid[x+1][y] == '1') {
            moves.push(new Pos(x+1, y));
        }
        if (y < grid[0].length - 1 && grid[x][y+1] == '1') {
            moves.push(new Pos(x, y+1));
        }
    }
}