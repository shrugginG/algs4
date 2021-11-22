package sort;

import java.util.Arrays;

/**
 * @author shrugginG
 * @date 2021/11/7 14:40
 * @project algs4
 * @package sort
 */
public class Shell {
		public static void sort(int[] a) {
				for (int increament = a.length / 2; increament > 0; increament /= 2) {
						for (int i = 0; i < increament; i++) {
								for (int j = i + increament; j < a.length; j += increament) {
										for (int x = j; x - increament >= 0 && a[x] < a[x - increament]; x -= increament) {
												// insertion sort
												int temp = a[x];
												a[x] = a[x - increament];
												a[x - increament] = temp;
										}
								}
						}
				}
		}

		public static void shellSortSmallToBig(int[] data) {
				int j = 0;
				int temp = 0;
				for (int increment = data.length / 2; increment > 0; increment /= 2) {
						System.out.println("increment:" + increment);
						for (int i = increment; i < data.length; i++) {
								// System.out.println("i:" + i);
								temp = data[i];
								for (j = i - increment; j >= 0; j -= increment) {
										// System.out.println("j:" + j);
										// System.out.println("temp:" + temp);
										// System.out.println("data[" + j + "]:" + data[j]);
										if (temp < data[j]) {
												data[j + increment] = data[j];
										} else {
												break;
										}
								}
								data[j + increment] = temp;
						}
						for (int i = 0; i < data.length; i++)
								System.out.print(data[i] + " ");
				}
		}


		public static void main(String[] args) {
				int[] a = new int[]{2, 17, 12, 23, 43, 0, 3, 7, 1, 5, 3, 6};
				shellSortSmallToBig(a);
				System.out.println(Arrays.toString(a));
		}
}
