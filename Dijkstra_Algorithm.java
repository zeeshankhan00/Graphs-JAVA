class pair{
    int distance;
    int node;
  public  pair(int distance, int node)
    {
        this.distance = distance;
        this.node = node;
        
    }
}

class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        PriorityQueue<pair> pq = new PriorityQueue<>((x,y)-> x.distance - y.distance);
        int dist[] = new int[V];
        for(int i= 0; i<V; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        
        dist[S] = 0;
        pq.add(new pair(0,S));
        while(pq.size()!=0){
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();
            
            for(int i= 0; i<adj.get(node).size(); i++){
                int edgeW = adj.get(node).get(i).get(1);
                int adjN = adj.get(node).get(i).get(0);
                
                if(dis+edgeW < dist[adjN]){
                dist[adjN] = dis+edgeW;
                pq.add(new pair(dist[adjN],adjN));
                
            }
        }
    }
        return dist;
    }
}
