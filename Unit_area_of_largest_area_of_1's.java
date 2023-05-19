class Solution
{
    public int dfs(int row,int col, int delrow[], int delcol[], int grid[][], int vis[][], int cnt){
        vis[row][col] = 1;
        cnt++;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0; i<8; i++){
                int nrow = row+delrow[i];
                int ncol = col+delcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                  cnt=  dfs(nrow,ncol,delrow,delcol,grid,vis,cnt);
                }
            }
        
        return cnt;
    }
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int delrow[] = {0,+1,0,-1,-1,1,1,-1};
        int delcol[] = {+1,0,-1,0,1,1,-1,-1};
        int count =0;
        for(int i=0;i<n; i++){
            for(int j=0; j<m; j++){
                if(vis[i][j]==0 && grid[i][j]==1){
                    
                    int cnt =0;
                  cnt =  dfs(i,j,delrow,delcol,grid,vis,cnt);
                    if(cnt>count){
                        
                    
                    count = cnt;}
                }
            }
        }
        
        return count;
        
    }
}
