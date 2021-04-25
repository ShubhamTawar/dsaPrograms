import java.util.*;

// DAG => For toposort a Graph should be DAG (Directed Acyclic Graph)

class Graph{
	Map<Integer , LinkedList<Integer>> graph = null;

	Graph(){
		graph = new HashMap<>();
	}

	public void addEdge(int u , int v){
		if(!graph.containsKey(u))
			graph.put(u , new LinkedList<Integer>());
		
		if(!graph.containsKey(v))
			graph.put(v , new LinkedList<Integer>());
		
		graph.get(u).add(v);
	}

	public List<Integer> toposort(){
		Map<Integer , Integer> inEdges = new HashMap<>();

		for(Map.Entry<Integer , LinkedList<Integer>> entry : graph.entrySet()){
			if(!inEdges.containsKey(entry.getKey()))
				inEdges.put(entry.getKey() , 0);
			for(Integer i : graph.get(entry.getKey())){
				if(!inEdges.containsKey(i))
					inEdges.put(i , 0);
				inEdges.put(i , inEdges.get(i) + 1);
			}
		}

		// Add vertices with zero incoming edges inside the queue
		Queue<Integer> q = new LinkedList<>();
		List<Integer> ts = new ArrayList<>();

		for(Map.Entry<Integer , Integer> entry : inEdges.entrySet()){
			if(entry.getValue() == 0)
				q.add(entry.getKey());
		}



		while(!q.isEmpty()){
			Integer temp = q.remove();
			ts.add(temp);

			for(Integer i : graph.get(temp)){
				inEdges.put(i , inEdges.get(i) - 1);

				if(inEdges.get(i) == 0)
					q.add(i);
			}

		}
		return ts;
	}

	public static void main(String[] args) {
		Graph g = new Graph();

		g.addEdge(5 , 2);
		g.addEdge(5 , 0);
		g.addEdge(4 , 0);
		g.addEdge(4 , 1);
		g.addEdge(2 , 3);
		g.addEdge(3 , 1);

		System.out.print(g.toposort());
	}
}