class Pair{
    int first;
    int second;
    int third;
    Pair(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        
        int vis[][] = new int[n][m];
        int dis[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                if(grid[i][j]==1){
                    vis[i][j] = 1;
                    q.add(new Pair(i,j,0));
                }
                
                else
                vis[i][j] = 0;
            }
        }

        int delrow[] = {-1,0,+1,0};
        int delcol[] = {0,+1, 0, -1};
        
         while(!q.isEmpty()){
             int r = q.peek().first;
             int c = q.peek().second;
             int steps = q.peek().third;
             dis[r][c] = steps;
            q.remove();
            for(int i =0; i<4; i++){
                int nrow = r+delrow[i];
                int ncol = c+delcol[i];
                if(nrow>=0 && nrow<n && ncol>=0&& ncol<m && vis[nrow][ncol]==0)
                {
                    vis[nrow][ncol] = 1;
                    q.add(new Pair(nrow,ncol,steps+1));
                }
            }
         }
        
        return dis;
    }
}
