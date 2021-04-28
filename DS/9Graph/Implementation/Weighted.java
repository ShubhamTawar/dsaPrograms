import java.util.*;


class Graph{

	Map<Integer , LinkedList<Edge>> graph = null;
	Graph(){
		graph = new HashMap<>();
	}

	static class Edge{
		int v ;
		int weight;

		Edge(int v , int weight){
			this.v 		= v;
			this.weight = weight;
		}

		@Override

		public String toString(){
			return "{ " + v + " => " + weight + "} ";
		}
	}

   public void addEdge(int u , int v , int weight){
   	 
   	 if(!graph.containsKey(u))
   	 	graph.put(u , new LinkedList<Edge>());
   	 
   	 if(!graph.containsKey(v))
   	 	graph.put(v , new LinkedList<Edge>());


   	 graph.get(u).add(new Edge(v , weight));
   	 graph.get(v).add(new Edge(u , weight));

   }

   @Override

   public String toString(){
   	StringBuilder sb = new StringBuilder("");

   	for(Map.Entry<Integer , LinkedList<Edge>> entry : graph.entrySet())
   		sb.append(entry.getKey() + " => " + entry.getValue() + "\n");
   	
   	return sb.toString();
   }

   public int getMin(Map<Integer , Integer> map , Set<Integer> visited){
   		int minVal = Integer.MAX_VALUE;
   		int minKey = -1;
   		
   		for(Map.Entry<Integer , Integer> entry : map.entrySet()){
  
   			if(!visited.contains(entry.getKey()) &&  entry.getValue() < minVal){
   				minKey = entry.getKey(); 
   				minVal = entry.getValue();
   			}
   		}

   		return minKey;
   }

   public Map<Integer , Integer> dijkstra(int source){
   		Set<Integer> visited = new HashSet<>();
   		Map<Integer , Integer> minDistance = new HashMap<>();

   		minDistance.put(source , 0);

   		while(visited.size() != graph.size()){
   			int temp = getMin(minDistance , visited);
   			visited.add(temp);

   			for(Edge edge : graph.get(temp)){

   				if(!minDistance.containsKey(edge.v))
   					minDistance.put(edge.v , Integer.MAX_VALUE);
				 int mm = Math.min(minDistance.get(edge.v) , minDistance.get(temp) + edge.weight);
   				  minDistance.put(edge.v , mm);
   			}
   		}
   		return 	minDistance;
   }
   public static void main(String[] args) {
   	 Graph graph = new Graph();

/*
   	 graph.addEdge(1 , 2 , 1);
   	 graph.addEdge(1 , 3 , 2);
   	 graph.addEdge(3 , 2 , 2);
   	 graph.addEdge(2 , 4 , 5);
   	 graph.addEdge(1 , 4 , 5);

   	// System.out.println(graph);
   	 System.out.println(graph.dijkstra(1));
*/

   	/* graph.addEdge(1 , 2 , 7);
   	 graph.addEdge(1 , 5 , 1);
   	 graph.addEdge(1 , 4 , 3);
   	 graph.addEdge(2 , 3 , 2);
   	 graph.addEdge(3 , 4 , 5);
   	 graph.addEdge(5 , 4 , 1);
	*/

   	 graph.addEdge(0 , 1 , 4);
   	 graph.addEdge(0 , 7 , 8);
   	 graph.addEdge(1 , 2 , 8);
   	 graph.addEdge(1 , 7 , 11);
   	 graph.addEdge(2 , 3 , 7);
   	 graph.addEdge(2 , 8 , 2);
   	 graph.addEdge(7 , 8 , 7);
   	 graph.addEdge(7 , 6 , 1);
   	 graph.addEdge(8 , 6 , 6);
   	 graph.addEdge(6 , 5 , 2);
   	 graph.addEdge(2 , 5 , 4);
   	 graph.addEdge(3 , 5 , 14);
   	 graph.addEdge(3 , 4 , 9);
   	 graph.addEdge(4 , 5 , 10);
   	 


   	 int source = 0;
   	 Map<Integer , Integer> dijkstra = graph.dijkstra(source);
   		
   	for(Map.Entry<Integer, Integer> entry : dijkstra.entrySet())
   		System.out.println( entry.getKey() + " => " + entry.getValue());
   	
   }
}