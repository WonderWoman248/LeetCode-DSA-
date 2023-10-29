class Solution {
    int[][]dp = new int[201][201];
    public int minPathSum(int[][] grid) {
        for(int[]x:dp){
            Arrays.fill(x,-1);
        }
        int m = grid.length;
        int n= grid[0].length;
        return minSum(grid,0,0,m-1,n-1);
    }

    private int minSum(int [][]grid, int i,int j,int m,int n){
        if(i>m && j >n)
            return 0;
        if(i==m && j==n)
            return grid[i][j];
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(i==m && j<n)
            return dp[i][j]=grid[i][j]+minSum(grid,i,j+1,m,n);
        if(j==n && i<m)
            return dp[i][j]=grid[i][j]+ minSum(grid,i+1,j,m,n);


        int right = grid[i][j]+minSum(grid,i,j+1,m,n);
        int down = grid[i][j]+ minSum(grid,i+1,j,m,n);

        return dp[i][j]=Math.min(right,down);
    }

    
}