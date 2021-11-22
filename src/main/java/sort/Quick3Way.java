package sort;

import java.util.Arrays;

/**
 * @author shrugginG
 * @date 2021/11/11 9:50
 * @project algs4
 * @package sort
 */
public class Quick3Way {
		public static void main(String[] args) {
				int[] a = {3, 2, 23, 3, 1, 17, 3, 45, 32, 3, 4, 6, 7};
				sort(a, 0, a.length - 1);
				System.out.println(Arrays.toString(a));
		}

		public static void exch(int[] a, int i, int j) {
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
		}

		public static void sort(int[] a, int lo, int hi) {
				if (hi <= lo)
						return;
				int lt = lo, i = lo + 1, gt = hi;
				int pivot = a[lo];
				while (i <= gt) {
						if (a[i] < pivot)
								exch(a, lt++, i++);
						else if (a[i] > pivot)
								exch(a, i, gt--);
						else
								i++;
				}
				sort(a, lo, lt - 1);
				sort(a, gt + 1, hi);
		}
}
