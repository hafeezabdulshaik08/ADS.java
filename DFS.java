import java.util.ArrayList;
import java.util.List;

class dfs1{
	static void dfsreq(List<List<Integer> > adj,boolean[] visited, int s){
		visited[s] = true;
		System.out.print(s + " ");
		
		for(int i:adj.get(s)){
			if(!visited[i]){
				dfsreq(adj,visited,i);
			}
		}
	}
	static void req(List<List<Integer> > adj, int s){
		boolean[] visited = new boolean[adj.size()];
			dfsreq(adj,visited,s);
			
	}
	static void addedge(List<List<Integer> > adj,int u,int v){
		adj.get(u).add(v);
			adj.get(v).add(u);
	}
	public static void main(String[] args){
		int v=5;
		List<List<Integer> > adj = new ArrayList<>(v);
		for(int i = 0; i < v; i++){
			adj.add(new ArrayList<>());
		}
		int [][] edges =  { { 1, 2 }, { 1, 0 }, { 2, 0 }, { 2, 3}, { 2, 4 } };
		for(int[] e: edges){
			addedge(adj, e[0], e[1]);
		}
		req(adj, 0);
	}
}
		
