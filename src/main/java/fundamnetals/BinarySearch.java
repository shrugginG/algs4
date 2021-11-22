package fundamnetals;

import java.sql.SQLOutput;
import java.util.Arrays;

public class BinarySearch {
		public static int rank(int key, int[] a) {
				int lo = 0;
				int hi = a.length - 1;
				while (lo <= hi) {
						int mid = (lo + hi) / 2;
						if (a[mid] > key) {
								hi = mid - 1;
						} else if (a[mid] < key) {
								lo = mid + 1;
						} else {
								return a[mid];
						}
				}
				return -1;
		}

		public static void main(String[] args) {
				int[] whitelist = {84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 33, 16, 77, 11, 29};
				int[] testList = {23, 50, 10, 99, 18, 23, 98, 84, 11, 10, 48, 77, 13, 54, 98, 77, 77, 68};
				Arrays.sort(whitelist);
				for (int i = 0; i < whitelist.length; i++) {
						System.out.println(rank(testList[i], whitelist) + "");

				}
		}
}
