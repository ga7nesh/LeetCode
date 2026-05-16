class Solution {
    int area;
    int res = 0;

    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        area = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                dfs(grid, r, c);
                res = 0;
            }
        }
        return area;
    }

    private void dfs(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return;
        }

        if (grid[r][c] == 1) {
            res++;
            grid[r][c] = 0;
        }
        area = Math.max(area, res);

        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}