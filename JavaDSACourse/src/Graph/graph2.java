package Graph;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class graph2 {
		private HashMap<Integer, HashMap<Integer, Integer>> g;

	public graph2(int v) {
		g = new HashMap<>();

		for (int i = 1; i <= v; i++) {
			g.put(i, new HashMap<>());
		}
	}
	
	public void addEdge(int v1, int v2, int w) {
		g.get(v1).put(v2, w);
		g.get(v2).put(v1, w);
	}
	
	public void BFT() {
		Queue<Integer>  q = new LinkedList<>();
		HashSet<Integer> visited =  new HashSet<>();
		
		for (int src : g.keySet()) {
			if(visited.contains(src)) { // if visited ignore
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.poll(); // remove

				if (visited.contains(rv)) { // if visited ignore
					continue;
				}

				visited.add(rv); // mark visited
				System.out.print(rv + " ");
				for (int nbr : g.get(rv).keySet()) {
					if (!visited.contains(nbr)) { // add nbr if not visited
						q.offer(nbr);
					}
				}

			}
			
		}
		System.out.println();
	}
	
	public void DFT() {
		Stack<Integer>  st = new Stack<>();
		HashSet<Integer> visited =  new HashSet<>();
		
		for (int src : g.keySet()) {
			st.push(src); // add src

			while (!st.isEmpty()) {
				int rv = st.pop(); // remove
				if (visited.contains(rv)) { // if visited
					continue;
				}

				visited.add(rv); // mark visited
				System.out.print(rv + " ");
				for (int nbr : g.get(rv).keySet()) {
					if (!visited.contains(nbr)) { // add nbr if not visited
						st.push(nbr);
					}
				}

			}
		}
		System.out.println();
	}
	
	public boolean isCyclic() {
		Queue<Integer>  q = new LinkedList<>();
		HashSet<Integer> visited =  new HashSet<>();
		
		for (int src : g.keySet()) {
			if(visited.contains(src)) { // if visited ignore
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.poll(); // remove
				if (visited.contains(rv)) { // if visited again cycle present
					return true;
				}
				visited.add(rv); // mark visited
				for (int nbr : g.get(rv).keySet()) {
					if (!visited.contains(nbr)) { // add nbr if not visited
						q.offer(nbr);
					}
				}

			}	
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
