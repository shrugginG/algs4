package graph;

import fundamnetals.In;
import fundamnetals.ST;

/**
 * @author shrugginG
 * @date 2021/11/22 16:38
 * @project algs4
 * @package Digraph
 */
public class SymbolDigraph {
		private ST<String, Integer> st;
		private String[] keys;
		private Digraph G;

		public SymbolDigraph(String stream, String sp) {
				st = new ST<String, Integer>();
				In in = new In(stream);
				while (in.hasNextLine()) {
						String[] a = in.readLine().split(sp);

						for (int i = 0; i < a.length; i++) {
								if (!st.contains(a[i]))
										st.put(a[i], st.size());
						}
				}

				//	Initialize the inverted array
				keys = new String[st.size()];
				for (String name : st.keys())
						keys[st.get(name)] = name;

				G = new Digraph(st.size());
				in = new In(stream);
				while (in.hasNextLine()) {
						String[] a = in.readLine().split(sp);
						int v = st.get(a[0]);
						for (int i = 1; i < a.length; i++)
								G.addEdge(v, st.get(a[i]));
				}
		}

		public boolean contains(String s) {
				return st.contains(s);
		}

		public int indexOf(String s) {
				return st.get(s);
		}

		public String nameOf(int v) {
				return keys[v];
		}

		public Digraph G() {
				return G;
		}

}

