/*
 * There are n teams numbered from 0 to n - 1 in a tournament.Given a 0-indexed 2D boolean matrix 
 * grid of size n * n. For all i, j that 0 <= i, j <= n - 1 and i != j team i is stronger than team 
 * j if grid[i][j] == 1, otherwise, team j is stronger than team i.Team a will be the champion of 
 * the tournament if there is no team b that is stronger than team a.
 */
public class champion {
    public int findChampion(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            boolean ok = true;  
            for (int j = 0; j < grid.length; j++) {
                if (i != j && grid[i][j] == 0) {
                    ok = false;
                }
            }

            if (ok) {
                return i;  
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        champion solution = new champion();

        int[][] grid1 = {{0, 1}, {0, 0}};
        int result1 = solution.findChampion(grid1);
        System.out.println("Champion for grid1: " + result1);

        int[][] grid2 = {{0, 0, 1}, {1, 0, 1}, {0, 0, 0}};
        int result2 = solution.findChampion(grid2);
        System.out.println("Champion for grid2: " + result2);
    }
}
