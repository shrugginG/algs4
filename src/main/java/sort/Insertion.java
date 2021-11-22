package sort;

import java.util.Arrays;

/**
 * @author shrugginG
 * @date 2021/11/6 19:30
 * @project algs4
 * @package sort
 */
public class Insertion {
		public static void sort(int[] a) {
				int N = a.length;
				for (int i = 1; i < N; i++) {
						for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
								int temp = a[j];
								a[j] = a[j - 1];
								a[j - 1] = temp;
						}
				}
		}

		public static void sort(int[] a, int lo, int hi) {
				int N = hi + 1;
				for (int i = lo + 1; i < N; i++) {
						for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
								int temp = a[j];
								a[j] = a[j - 1];
								a[j - 1] = temp;
						}
				}
		}

		public static void main(String[] args) {
				int[] a = new int[]{12, 2, 34, 12, 7, 13, 16, 32, 34, 1234, 34};
				sort(a);
				System.out.println(Arrays.toString(a));
		}
}
