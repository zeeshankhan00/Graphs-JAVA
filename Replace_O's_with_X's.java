class Solution{
    
    static void dfs(int row,int col, int delrow[], int delcol[], char a[][], int n, int m){
        a[row][col] = 'O';
        for(int i =0; i<4; i++){
          int  nrow = row+delrow[i];
           int ncol = col+ delcol[i];
            
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && a[nrow][ncol]=='-'){
                
                    a[nrow][ncol] = 'O';
                
                dfs(nrow,ncol, delrow,delcol,a,n,m);
            }
        }
    }
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                if(a[i][j]=='O')
                a[i][j] = '-';
            }
        }
        int delrow[] = {-1,0,+1,0};
        int delcol[] = {0,+1,0,-1};
        
        // int i[] = {0,n-1};
        // int j[] = {0,m-1};
        
        // for(int k=0; k<2; k++){
        //     for(int l=0; l<m; l++){
                
        //     }
        // }
        
        //Top view
        for(int i=0, j=0; j<m; j++){
            if(a[i][j]=='-'){
                
                dfs(i,j,delrow,delcol,a,n,m);
            }
        }
         
        //Right view
         for(int i=0, j=m-1; i<n; i++){
            if(a[i][j]=='-'){
                
                dfs(i,j,delrow,delcol,a,n,m);
            }
        }
        
        //Bottom view
         for(int i=n-1, j=0; j<m; j++){
            if(a[i][j]=='-'){
                
                dfs(i,j,delrow,delcol,a,n,m);
            }
        }
        
        //Left view
         for(int i=0, j=0; i<n; i++){
            if(a[i][j]=='-'){
                
                dfs(i,j,delrow,delcol,a,n,m);
            }
        }
        
         for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                if(a[i][j]=='-')
                a[i][j] = 'X';
            }
        }
        
    return a;
      
    }
}
