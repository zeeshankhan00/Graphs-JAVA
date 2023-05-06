class Solution{
    
    public static List<Integer> BFS(ArrayList<ArrayList<Integer>> adj, int K){
        Queue<Integer> q = new LinkedList<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        int[] indegree = new int[K];
        
        for(int i=0;i<K;i++){
            for(int a : adj.get(i))
                indegree[a]++;
        }
        
        for(int i=0;i<K;i++){
            if(indegree[i] == 0)
                q.add(i);
        }
        
        int i=0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            al.add(node);
            
            for(int a : adj.get(node)){
                indegree[a]--;
                if(indegree[a] == 0)
                    q.add(a);
            }
        }
        return al;
    }
    
    public String findOrder(String [] dict, int N, int K){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<K;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<dict.length-1;i++){
            String s1 = dict[i];
            String s2 = dict[i+1];
            
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    adj.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                    break;
                }
            }
        }
        List<Integer> res = BFS(adj, K);
        String ans = "";
        for(int a : res){
            ans = ans + (char)(a + (int)'a');
        }
        return ans;
    }
}

