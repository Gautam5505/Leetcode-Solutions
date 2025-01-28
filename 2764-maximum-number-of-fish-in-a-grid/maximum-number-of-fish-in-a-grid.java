class Solution {
    private static final int[] DR = {-1, 1, 0, 0};
    private static final int[] DC = {0, 0, -1, 1};

    public int findMaxFish(int[][] grid) {
        int maxFish = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] > 0) {
                    maxFish = Math.max(maxFish, collectFish(grid, r, c));
                }
            }
        }
        return maxFish;
    }

    private int collectFish(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }

        int fish = grid[r][c];
        grid[r][c] = 0; 
        for (int i = 0; i < 4; i++) {
            fish += collectFish(grid, r + DR[i], c + DC[i]);
        }
        return fish;
    }
}
