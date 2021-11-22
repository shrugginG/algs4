package search;

import fundamnetals.BinarySearch;

/**
 * @author shrugginG
 * @date 2021/11/11 15:36
 * @project algs4
 * @package search
 */
public class BinarySearchST<Key extends Comparable<Key>, Value> {
		private Key[] keys;
		private Value[] vals;
		private int N;

		public BinarySearchST(int capacity) {
				keys = (Key[]) new Comparable[capacity];
				vals = (Value[]) new Object[capacity];
		}

		public int size() {
				return N;
		}

		public boolean isEmpty() {
				if (N == 0)
						return true;
				else
						return false;
		}

		public int rank(Key key) {
				int lo = 0, hi = N - 1;
				while (lo <= hi) {
						int mid = lo + (hi - lo) / 2;
						int cmp = key.compareTo(keys[mid]);
						if (cmp < 0)
								hi = mid - 1;
						else if (cmp > 0)
								lo = mid + 1;
						else
								return mid;
				}
				return lo;
		}

		public Value get(Key key) {
				if (isEmpty()) return null;
				int i = rank(key);
				if (i < N && key.compareTo(keys[i]) == 0) return vals[i];
				else return null;
		}

		public void put(Key key, Value val) {
				int i = rank(key);
				if (i < N && key.compareTo(keys[i]) == 0)
						vals[i] = val;
				for (int j = N; j > i; j--) {
						keys[j] = keys[j - 1];
						vals[j] = vals[j - 1];
				}
				keys[i] = key;
				vals[i] = val;
				N++;
		}


}
