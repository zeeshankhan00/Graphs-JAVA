class Solution
{
    
    private void dfs(int node, int vis[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> st){
        
        vis[node] = 1;
        for(Integer it : adj.get(node)){
            if(vis[it]==0)
            dfs(it, vis,adj,st);
            
        }
        
        st.push(node);
        
    }
    
    private void dfs2(int node, int vis[], ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        for(Integer it: adj.get(node))
        if(vis[it] == 0)
        dfs2(it, vis, adj);
    }
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
        int vis[] = new int[V];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<V; i++){
            if(vis[i] == 0)
            dfs(i,vis,adj,st);
        }
        
        ArrayList<ArrayList<Integer>> adjT = new ArrayList<>();
        
        for(int i=0; i<V; i++){
            adjT.add(new ArrayList<>());
        }
        
        for(int i = 0; i<V; i++){
            vis[i] = 0;
            for(Integer it : adj.get(i))
            adjT.get(it).add(i);
        }
        
        int scc = 0;
        while(!st.isEmpty()){
            int node = st.peek();
            st.pop();
            if(vis[node] == 0){
                scc++;
            
            dfs2(node,vis, adjT);
        }}
        
        return scc;
        
    }
}
