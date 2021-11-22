package sort;

import java.util.Arrays;

/**
 * @author shrugginG
 * @date 2021/11/6 15:13
 * @project algs4
 * @package sort
 */
public class Selection {
		public static void sort(int[] a) {
				int N = a.length;
				for (int i = 0; i < N; i++) {
						int min = i;
						for (int j = i + 1; j < N; j++) {
								if (a[min] > a[j])
										min = j;
						}
						int temp = a[i];
						a[i] = a[min];
						a[min] = temp;
				}
		}

		public static void exch(int[] a, int i, int min) {
				int t = a[i];
				a[i] = a[min];
				a[min] = t;
		}

		public static void ch(int[] a) {
				for (int i = 0; i < a.length; i++) {
						a[i] = a[i] * 2;
				}
		}

		public static void main(String[] args) {
				int a[] = new int[]{1, 2, 5, 3, 12, 8, 17, 2, 3};
				sort(a);
				System.out.println(Arrays.toString(a));
		}
}
