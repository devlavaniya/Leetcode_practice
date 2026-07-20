class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        while (k-- > 0) {
            int last = grid[m - 1][n - 1];

            // Store the last element of each row
            int[] lastCol = new int[m];
            for (int i = 0; i < m; i++) {
                lastCol[i] = grid[i][n - 1];
            }

            // Shift each row to the right
            for (int i = 0; i < m; i++) {
                for (int j = n - 1; j > 0; j--) {
                    grid[i][j] = grid[i][j - 1];
                }
            }

            // Move the last element of the previous row
            for (int i = m - 1; i > 0; i--) {
                grid[i][0] = lastCol[i - 1];
            }

            // Put the original last element at grid[0][0]
            grid[0][0] = last;
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }
            ans.add(row);
        }

        return ans;
    }
}