class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public void dfs(int node, int vis[], ArrayList<Integer> result, ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        result.add(node);
        
        for(int it: adj.get(node))
        {
            
        if(vis[it]==0)
        dfs(it,vis,result,adj);
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        int vis[] = new int[V];
        vis[0] = 1;
        result.add(0);
        for(int i=0; i<V; i++){
            for(int it: adj.get(i)){
                if(vis[it]==0){
                    dfs(it,vis,result,adj);
                }
            }
        }
        
        return result;
    }
}
