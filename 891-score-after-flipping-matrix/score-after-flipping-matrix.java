class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        // Step 1: Ensure the first column has all 1s by flipping necessary rows
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) { // Flip the row
                for (int j = 0; j < n; j++) {
                    grid[i][j] = 1 - grid[i][j]; // Toggle 0 -> 1, 1 -> 0
                }
            }
        }

        // Step 2: Flip columns where number of 0s is greater than number of 1s
        for (int j = 1; j < n; j++) {
            int noOfZeroes = 0, noOfOnes = 0;
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == 0) noOfZeroes++;
                else noOfOnes++;
            }
            if (noOfZeroes > noOfOnes) { // Flip column
                for (int i = 0; i < m; i++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }

        // Step 3: Compute final score
        int Score = 0;
        int x = 1;
        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < m; i++) {
                Score += (grid[i][j] * x);
            }
            x *= 2;
        }
        return Score;
    }
}
