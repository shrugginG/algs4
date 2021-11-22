package search;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author shrugginG
 * @date 2021/11/14 19:00
 * @project algs4
 * @package search
 */
public class RedBlackBST<Key extends Comparable<Key>, Value> {
		private static final boolean RED = true;
		private static final boolean BLACK = false;

		private Node root;

		private class Node {
				Key key;
				Value val;
				Node left, right;
				int N;
				boolean color;

				public Node(Key key, Value value, int n, boolean color) {
						this.key = key;
						this.val = value;
						this.N = n;
						this.color = color;
				}
		}

		private boolean isRed(Node x) {
				return x.color == RED;
		}

		private Node rotateLeft(Node h) {
				return null;
		}

		private Node rotateRight(Node h) {
				return null;
		}

		private void flipColors(Node h) {
		}

		private int size(Node x) {
				return 0;
		}

		public void put(Key key, Value val) {
				root = put(root, key, val);
				root.color = BLACK;
		}

		private Node put(Node h, Key key, Value val) {
				if (h == null)
						return new Node(key, val, 1, RED);
				int cmp = key.compareTo(h.key);
				if (cmp < 0) h.left = put(h.left, key, val);
				else if (cmp > 0) h.right = put(h.right, key, val);
				else h.val = val;

				if (isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
				if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
				if (isRed(h.left) && isRed(h.right)) flipColors(h);

				h.N = size(h.left) + size(h.right) + 1;
				return h;

		}

}
