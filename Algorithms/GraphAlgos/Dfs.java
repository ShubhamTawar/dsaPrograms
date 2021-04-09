import java.util.*;

class Dfs{
	static class Graph{
		static Map<Integer , ArrayList<Integer>> graph ;

		Graph(){
			graph = new HashMap<>();
		}

		public void addEdge(int u , int v){
			if(!graph.containsKey(u))
				graph.put(u , new ArrayList<Integer>());
			
			if(!graph.containsKey(v))
				graph.put(v , new ArrayList<Integer>());

			graph.get(u).add(v);
			graph.get(v).add(u);

		}

		public String toString(){
			StringBuilder sb = new StringBuilder("");

			for(Map.Entry<Integer , ArrayList<Integer>> entry : graph.entrySet())
				sb.append(entry.getKey() + " => " + entry.getValue() + "\n");
			
			return sb + "";
		}

		public void dfs(int start){
			Set<Integer> visited = new HashSet<>();
			Stack<Integer> stack = new Stack<>();
			visited.add(start);
			stack.push(start);
			Integer temp = null;
			while(!stack.isEmpty()){
				temp = stack.pop();
				System.out.print(temp + " ");
				//visited.add(temp);
				
				for(Integer i : graph.get(temp)){
					if(!visited.contains(i)){
						stack.push(i);
						visited.add(i);
					}
				}

			}	
		}
	}
	public static void main(String[] args) {
		Graph g = new Graph();

		g.addEdge(1 , 2);
		g.addEdge(2 , 3);
		g.addEdge(1 , 3);
		g.addEdge(3 , 4);
		g.addEdge(3 , 5);
		g.addEdge(4 , 5);
		
		System.out.println(g);

		g.dfs(1);
	}
}