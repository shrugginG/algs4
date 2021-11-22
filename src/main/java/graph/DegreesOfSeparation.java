package graph;

import fundamnetals.StdIn;
import fundamnetals.StdOut;

/**
 * @author shrugginG
 * @date 2021/11/18 16:13
 * @project algs4
 * @package graph
 */
public class DegreesOfSeparation {
		public static void main(String[] args) {
				String filename = args[0];
				String delimiter = args[1];
				String source = args[2];

				SymbolGraph sg = new SymbolGraph(filename, delimiter);
				Graph G = sg.G();
				if (!sg.contains(source)) {
						StdOut.println(source + " not in database.");
						return;
				}

				int s = sg.indexOf(source);
				BreadthFirstPaths bfs = new BreadthFirstPaths(G, s);

				while (!StdIn.isEmpty()) {
						String sink = StdIn.readLine();
						if (sg.contains(sink)) {
								int t = sg.indexOf(sink);
								if (bfs.hasPathTo(t)) {
										for (int v : bfs.pathTo(t)) {
												StdOut.println("   " + sg.nameOf(v));
										}
								}
								else {
										StdOut.println("Not connected");
								}
						}
						else {
								StdOut.println("   Not in database.");
						}
				}
		}
}
