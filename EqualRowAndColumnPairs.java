import java.util.Arrays;
    class Solution {
    public int equalPairs(int[][] grid) {
        int trans[][] = new int[grid.length][grid.length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                trans[i][j] = grid[j][i];
            }
        }
        int count = 0;

        for(int i = 0; i < grid.length; i ++){
            for(int j = 0; j < trans.length; j++){
                boolean ans = Arrays.equals(grid[i], trans[j]);

                if(ans){
                    count++;
                }
            }
        }
        return count;
    }
}
