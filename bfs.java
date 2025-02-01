import java.util.*;
class bfs1{
	static void bfs(List<List<Integer>> adj, int s){
		Queue<Integer> q= new LinkedList<>();
		
		boolean[] visited = new boolean[adj.size()];
		visited[s] = true;
		q.add(s);
		
		while(!q.isEmpty()){
			int curr=q.poll();
			System.out.print(curr + " ");
			for(int x:adj.get(curr)){
				if(!visited[x]){
					visited[x]=true;
					q.add(x);
				}
			}
		}
	}
	static void addedge(List<List<Integer>> adj,int u,int v){
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static void main(String[] args){
		int v = 5;
		List<List<Integer>> adj = new ArrayList<>(v);
 		for (int i = 0; i < v; i++) 
		{
 			adj.add(new ArrayList<>());
 		}


 		addedge(adj, 0, 1);
		addedge(adj, 0, 2);
 		addedge(adj, 1, 3);
 		addedge(adj, 1, 4);
 		addedge(adj, 2, 4);

 
 		System.out.println("BFS starting from 0:");
 		bfs(adj, 4);
	}
}							
