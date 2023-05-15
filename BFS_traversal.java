class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int vis[] = new int[V];
        q.add(0);
        vis[0] =1;
        while(!q.isEmpty()){
            result.add(q.peek());
            int node = q.remove();
            for(int it: adj.get(node)){
                if(vis[it]==0){
                    vis[it] =1;
                    q.add(it);
                }
                
            }
        }
        
        return result;
    }
}
