package search;

/**
 * @author shrugginG
 * @date 2021/11/15 17:04
 * @project algs4
 * @package search
 */
public class HashST<Key extends Comparable<Key>, Value> {
		private Key key;
		private Value val;

		public HashST(Key key, Value val) {
				this.key = key;
				this.val = val;
		}

		private int hash( ) {
//				return (key.hashCode() & 0x7fffffff) % 7;
			return key.hashCode();
		}

		public static void main(String[] args) {
				HashST test = new HashST(12, 23);
				System.out.println(test.hash());
		}
}
