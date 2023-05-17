class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here 
        int inicolor = image[sr][sc];
        int ans[][] = image;
        
        int delrow[] = {-1,0,+1,0};
        int delcol[] = {0,+1,0,-1};
        
        dfs(sr,sc,delrow,delcol,inicolor,image,ans,newColor);
        return ans;
        
    }
    
    public void dfs(int row, int col, int delrow[],int delcol[], int iniColor, int image[][], int ans[][], int newColor){
        ans[row][col] = newColor;
        
        for(int i=0; i<4; i++){
            int nrow = row+delrow[i];
            int ncol = col+delcol[i];
            if(nrow>=0 && nrow<image.length && ncol>=0 && ncol<image[0].length && image[nrow][ncol]== iniColor && ans[nrow][ncol]!=newColor)
            dfs(nrow,ncol,delrow,delcol,iniColor,image,ans,newColor);
        }
    }
}
