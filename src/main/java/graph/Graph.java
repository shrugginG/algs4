package graph;

import fundamnetals.Bag;
import fundamnetals.In;

/**
 * @author shrugginG
 * @date 2021/11/17 19:16
 * @project algs4
 * @package graph
 */
public class Graph {
		private final int V;
		private int E;
		private Bag<Integer>[] adj;

		public Graph(int V) {
				this.V = V;
				this.E = 0;
				adj = (Bag<Integer>[]) new Bag[V];
				for (int v = 0; v < V; v++) {
						adj[v] = new Bag<Integer>();
				}
		}

		public Graph(In in) {
				this(in.readInt());
				int E = in.readInt();
				for (int i = 0; i < E; i++) {
						int v = in.readInt();
						int w = in.readInt();
						addEdge(v, w);
				}
		}

		public int V() {
				return V;
		}

		public int E() {
				return E;
		}

		public void addEdge(int v, int w) {
				adj[v].add(w);
				adj[w].add(v);
				E++;
		}

		public Iterable<Integer> adj(int v) {
				return adj[v];
		}
}
