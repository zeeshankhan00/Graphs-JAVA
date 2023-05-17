class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean checkCycle(int src, int V, boolean vis[], ArrayList<ArrayList<Integer>> adj ){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,-1));
        vis[src] = true;
        
        while(!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();
            for(int adjNode : adj.get(node)){
                if(vis[adjNode]==false){
                    vis[adjNode] = true;
                    q.add(new Pair(adjNode,node));
                }
                
                else if(parent != adjNode)
                return true;
            }
        }
        
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        for(int i=0; i<V; i++){
            vis[i] = false;
        }
        
        for(int i=0; i<V; i++){
            if(vis[i]==false){
                if(checkCycle(i,V,vis,adj))
                return true;
            }
        }
        
        return false;
    }
}
