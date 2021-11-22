package graph;

/**
 * @author shrugginG
 * @date 2021/11/18 9:37
 * @project algs4
 * @package graph
 */
public class DepthFirstSearch {
		private boolean[] marked;
		private int count;

		public DepthFirstSearch(Graph G, int s) {
				marked = new boolean[G.V()];
				dfs(G, s);
		}

		public void dfs(Graph G, int v) {
				marked[v] = true;
				count++;
				for (int w : G.adj(v)) {
						if (!marked[w]) dfs(G, w);
				}
		}

		public boolean marked(int w){
				return marked[w];
		}

		public int count(){
				return count;
		}
}
