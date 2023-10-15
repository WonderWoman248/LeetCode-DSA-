class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if(noOranges(grid,m,n)){
            return 0;
        }
        int []x = {1,-1,0,0};
        int []y = {0,0,1,-1};

        int [][]visited = new int[m][n];
        Queue<Pair> bfs = new LinkedList<>();
        for(int i = 0 ;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    bfs.add(new Pair(i,j));
                    visited[i][j] = 1;
                }
            }
        }
        
        int count = -1;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            while(size-- >0){
                    Pair current = bfs.peek();
                    bfs.poll();

                    for(int i = 0;i<4;i++){
                    int nextX = current.x + x[i];
                    int nextY = current.y + y[i];

                    if(nextX<0 || nextX >=m || nextY<0 || nextY>=n)
                        continue;
                    else{
                        if(visited[nextX][nextY]==0 && grid[nextX][nextY]!=0){
                            bfs.add(new Pair(nextX, nextY));
                            visited[nextX][nextY] = 1;
                        }
                    }
                }
            }
            count++;          
        }
    
        return allDone(visited,grid,m,n)?count:-1;
    }

    boolean allDone(int[][]visited, int [][]grid,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && visited[i][j]==0)
                    return false;
            }
        }
        return true;
    }
    boolean noOranges(int[][]grid,int m, int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0)
                    return false;
            }
        }
        return true;
    }
        
    }
    class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
       
    }