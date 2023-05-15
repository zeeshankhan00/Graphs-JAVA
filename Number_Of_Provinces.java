class Solution {
    static void dfs(int node, int vis[], ArrayList<ArrayList<Integer>> adjT){
        vis[node] =1;
        
        for(int it: adjT.get(node)){
            if(vis[it]==0)
            dfs(it,vis,adjT);
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int vis[] = new int[V];
        ArrayList<ArrayList<Integer>> adjT = new ArrayList<>();
        
        for(int i=0; i<V; i++){
            adjT.add(new ArrayList<>());
        }
        
        for(int i=0; i<V; i++){
            for(int j =0; j<V; j++){
                if(adj.get(i).get(j)==1 && i!=j){
                    adjT.get(i).add(j);
                    adjT.get(j).add(i);
                }
            }
        }
        
        int count = 0;
        for(int i=0; i<V; i++){
                if(vis[i]==0){
                    count++;
                dfs(i,vis,adjT);
                }
            }
        
        return count;
        
    }
};
