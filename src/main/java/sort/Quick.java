package sort;

import java.util.Arrays;

/**
 * @author shrugginG
 * @date 2021/11/8 15:40
 * @project algs4
 * @package sort
 */
public class Quick {
		public static void exch(int[] a, int i, int j) {
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
		}

		public static int partition(int[] a, int lo, int hi) {
				int i = lo, j = hi + 1;
				int v = a[lo];
				while (true) {
						// 相等时放左置是置右
						while (a[++i] < v)
								if (i == hi)
										break;
						while (a[--j] > v)
								if (j == lo)
										break;
						if (i >= j)
								break;
						exch(a, i, j);
				}
				exch(a, lo, j);
				return j;
		}

		public static void sort(int a[]) {
				sort(a, 0, a.length - 1);
		}

		public static void sort(int a[], int lo, int hi) {
				// 小型数组使用插入排序加快排序速度
//				int M = 13;
//				if (hi <= lo + M) {
//						Insertion.sort(a, lo, hi);
//						return;
//				}
				if (hi <= lo ) {
						return;
				}
				int j = partition(a, lo, hi);
				sort(a, lo, j - 1);
				sort(a, j + 1, hi);
		}

		public static int[] generateRandomArrays(int len, int max) {
				int[] array = new int[len];
				for (int i = 0; i < len; i++) {
						array[i] = (int) (Math.random() * max);
				}
				return array;
		}

		public static void main(String[] args) {
				int[] a = generateRandomArrays(100000, 100);
				long startTime = System.currentTimeMillis(); //获取开始时间
				sort(a);
				long endTime = System.currentTimeMillis(); //获取结束时间
				System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
		}
}
