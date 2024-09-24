package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class graph {
     HashMap<Integer, HashMap<Integer,Integer>> graph;
     public graph(int v) {
    	 graph=new HashMap<>();
    	 for (int i = 1; i <= v; i++) {
 			graph.put(i, new HashMap<>());
 		}
     }
     public void addEdge(int v1,int v2,int w) {
    	 graph.get(v1).put(v2, w);
    	 graph.get(v2).put(v1,w);
     }
     public void addVertex(int v1) {
    	 graph.put(v1, new HashMap<>());
     }
     public void removeVertex(int v1) {
    	 for(int nbr:graph.get(v1).keySet()) {
    		 graph.get(nbr).remove(v1);
    	 }
    	 graph.remove(v1);
     }
     public void removeEdge(int v1,int v2) {
    	 graph.get(v1).remove(v2);
    	 graph.get(v2).remove(v1);
     }
     public boolean containsEdge(int v1,int v2) {
    	 return graph.get(v1).containsKey(v2);
     }
     public boolean containsVertex(int v1) {
    	 return graph.containsKey(v1);
     }
     
     public void display() {
 		for (int i : graph.keySet()) {
 			System.out.println(i + " ==> " + graph.get(i));
 		}
 	}
     public boolean hasPath(int src,int dest,HashSet<Integer> visited) {
    	 if(src==dest) {
    		 return true;
    	 }
    	 visited.add(src);
    	 for(int nbr:graph.get(src).keySet()){
    		 if(!visited.contains(src)) {
    			 boolean ans=hasPath(nbr,dest,visited);
    			 if(ans) {
        			 return true;
        		 }
    		 }
    		 
    	 }
    	 visited.remove(src);
    	 return false;
     }

 	public void printAllPath(int src, int dest, HashSet<Integer> visited, String s) {
 		if (src == dest) {
 			System.out.println(s + dest);
 			return;
 		}
 		visited.add(src); // avoid deadlock
 		for (int nbrs : graph.get(src).keySet()) {
 			if (!visited.contains(nbrs)) {
 				printAllPath(nbrs, dest, visited, s + src + "=>");
 			}

 		}
 		visited.remove(src);
 	}
 	public boolean bfs(int src,int dest,HashSet<Integer> visited) {
 		if(src==dest) {
 			return true;
 		}
 		Queue<Integer> q=new LinkedList<>();
 		q.add(src);
 		while(!q.isEmpty()) {
 			int rv=q.poll();
 			if (rv == dest) {
				return true;
			}
 			if(visited.contains(rv)) {
 				continue;
 			}
 			visited.add(rv);
 			for(int nbr: graph.get(rv).keySet()) {
 				if(!visited.contains(nbr)){
 					q.offer(nbr);
 				}
 			}
 		}
 		
 		return false;
 	}

	public boolean dfs(int src, int dest, HashSet<Integer> visited) {
		if (src == dest) {
			return true;
		}
		Stack<Integer>  st = new Stack<>();

		st.push(src);

		while (!st.isEmpty()) {
			int rv = st.pop(); 
			if (rv == dest) {
				return true;
			}

			if (visited.contains(rv)) { 
				continue;
			}

			visited.add(rv); 

			for (int nbr : graph.get(rv).keySet()) {
				if (!visited.contains(nbr)) { 
					st.push(nbr);
				}
			}

		}
		return false;
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph g = new graph(7);
		g.addEdge(1, 2, 100);
		g.addEdge(1, 3, 400);
		g.addEdge(3, 4, 300);
		g.addEdge(2, 4, 700);
		g.addEdge(2, 5, 800);
		g.addEdge(5, 6, 1000);
		g.addEdge(5, 7, 900);
		g.addEdge(6, 7, 200);
		
//		g.display();
//		System.out.println("-------------");
////		g.removeEdge(6, 7);
////		g.removeVertice(2);
////		g.addVertice(8);
////		System.out.println(g.containsEdge(1, 9));
//		g.display();
		
//		System.out.println(g.hasPath(1, 8,new HashSet<>()));
//		g.printAllPath(1, 7,new HashSet<>(),"");

		System.out.println(g.bfs(1, 6, new HashSet<>()));
		System.out.println(g.dfs(1, 6, new HashSet<>()));

	}

}