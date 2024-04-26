public class MinimumFallingPathSum2 {
    public int minFallingPathSum(int[][] grid) {
        for(int i=1;i<grid.length;i++){
            int p=0,min=grid[i-1][0],nmin=Integer.MAX_VALUE,q=0;
            for(int j=0;j<grid.length;j++){
                if(grid[i-1][j]<min){
                    min=grid[i-1][j];
                    p=j;
                }
            }
            for(int j=0;j<grid.length;j++){
                if(j!=p&&grid[i-1][j]>=min&& grid[i-1][j]<nmin){
                    nmin=grid[i-1][j];
                }
            }
            for(int j=0;j<grid.length;j++){
                if(j!=p)
                    grid[i][j]+=min;
                else
                    grid[i][j]+=nmin;
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            ans=Math.min(ans,grid[grid.length-1][i]);
        }
        return ans;
    }
}
