package graph;

import fundamnetals.StdOut;

/**
 * @author shrugginG
 * @date 2021/11/22 16:32
 * @project algs4
 * @package graph
 */
public class Topological {
		private Iterable<Integer> order;

		public Topological(Digraph G) {
				DirectedCycle cyclefinder = new DirectedCycle(G);
				if (!cyclefinder.hasCycle()) {
						DepthFirstOrder dfs = new DepthFirstOrder(G);
						order = dfs.reversePost();
				}
		}

		public Iterable<Integer> order() {
				return order;
		}

		public boolean isDAG() {
				return order != null;
		}

		public static void main(String[] args) {
				String filename = args[0];
				String separator = args[1];
				SymbolDigraph sg = new SymbolDigraph(filename, separator);

				Topological top = new Topological(sg.G());

				for (int v : top.order()) {
						StdOut.println(sg.nameOf(v));
				}
		}
}
