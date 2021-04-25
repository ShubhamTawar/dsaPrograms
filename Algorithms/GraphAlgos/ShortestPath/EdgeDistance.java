import java.util.*;

class Solution{
	static class Graph{
	   Map<Integer , ArrayList<Integer>> graph = null;

	   Graph(){
	   	graph = new HashMap<>();
	   }

	   public void addEdge(int u , int v){
	   	 if(!graph.containsKey(u))
	   	 	graph.put(u , new ArrayList<>());
	   	 
	   	 if(!graph.containsKey(v))
	   	 	graph.put(v , new ArrayList<>());

	   	 graph.get(u).add(v);
	   	 graph.get(v).add(u);

	   }

	   @Override 

	   public String toString(){
	   	 StringBuilder sb = new StringBuilder("");

	   	 for(Map.Entry<Integer , ArrayList<Integer>> entry : graph.entrySet())
	   	 	sb.append(entry.getKey() + " => " + entry.getValue() + "\n");

	   	 return sb.toString();
 	}

 	public Map<Integer , Integer> minDistance(int source){
 		Queue<Integer> q = new LinkedList<>();
 		Set<Integer> visited = new HashSet<>();
 		Map<Integer , Integer> minDistance = new HashMap<>();

 		minDistance.put(source , 0);
 		q.add(source);

 		while(!q.isEmpty()){
 			Integer temp = q.remove();
 			visited.add(temp);
 			for(Integer i : graph.get(temp)){
 				if(minDistance.containsKey(i)){
 					int dist = Math.min(minDistance.get(i) , minDistance.get(temp) + 1);
 					minDistance.put(i , dist);
 				}else
 				   minDistance.put(i , minDistance.get(temp) + 1);

 				if(!visited.contains(i))
 					q.add(i);
 			}
 		}

 		return minDistance;	

 	}
	}

	public static void main(String[] args) {
		Graph graph = new Graph();

		graph.addEdge(1 , 2);
		graph.addEdge(1 , 3);
		graph.addEdge(3 , 2);
		graph.addEdge(3 , 4);
		graph.addEdge(4 , 2);
		graph.addEdge(2 , 5);
		graph.addEdge(5 , 6);
		graph.addEdge(3 , 6);



		System.out.println(graph);

		System.out.println(graph.minDistance(1));

	}

}











