class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        // Code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        
        for(int i =0 ; i<m; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
            
        }
        
        int dist[] = new int[n];
        for(int i = 0; i<n; i++){
            dist[i]= Integer.MAX_VALUE;
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dist[src] = 0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            for(int it : adj.get(node)){
                if(dist[node]+1< dist[it]){
                    dist[it] = dist[node]+1;
                    q.add(it);
                }
            }
        }
        
        for(int i=0; i<n; i++){
            if(dist[i]==Integer.MAX_VALUE)
            dist[i] = -1;
        }
        
        return dist;
        
    }
}
