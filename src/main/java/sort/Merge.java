package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author shrugginG
 * @date 2021/11/8 9:58
 * @project algs4
 * @package sort
 */
public class Merge {
		// 归并两个有序的数组
		public static void merge(int[] a, int lo, int mid, int hi) {
				int i = lo;
				int j = mid + 1;

				for (int k = lo; k <= hi; k++)
						aux[k] = a[k];

				for (int k = lo; k <= hi; k++) {
						if (i > mid)
								a[k] = aux[j++];
						else if (j > hi)
								a[k] = aux[i++];
						else if (aux[j] < aux[i])
								a[k] = aux[j++];
						else
								a[k] = aux[i++];
				}
		}

		private static int[] aux;

		public static void sort(int[] a) {
				aux = new int[a.length];
				sort(a, 0, a.length - 1);
		}

		public static void sort(int a[], int lo, int hi) {
				if (hi <= lo)
						return;
				int mid = lo + (hi - lo) / 2;
				sort(a, lo, mid);
				sort(a, mid + 1, hi);
				merge(a, lo, mid, hi);
		}


		public static void main(String[] args) {
				int[] a = {1, 2, 34, 54, 7, 13, 16};
				sort(a);
				System.out.println(Arrays.toString(a));
		}
}
