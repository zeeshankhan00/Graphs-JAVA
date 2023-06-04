class Solution
{
    
    public boolean dfs(int node, int col, int color[], ArrayList<ArrayList<Integer>> adj){
        color[node] = col;
        
        for(int it: adj.get(node)){
            if(color[it]==-1){
                if(dfs(it,1-col,color,adj)==false)
                return false;
            }
                else if(color[it]==col)
                return false;
            
            
            
        }return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int color[] = new int[V];
        for(int i=0; i<V;  i++){
            color[i] = -1;
        }
        
        for(int i=0; i<V; i++){
            if(color[i]==-1){
                if(dfs(i,0,color, adj)==false)
                return false;
            }
        }
        return true;
        
    }
}
