package sort;

import java.util.Arrays;

/**
 * @author shrugginG
 * @date 2021/11/9 15:23
 * @project algs4
 * @package sort
 */
public class HeapSort {
		public static void initHeapAndSorted(int[] nums) {
				int N = nums.length - 1;
				for (int i = N / 2; i >= 1; i--)
						sink(nums, i, N);

				while (N > 1) {
						exch(nums, 1, N--);
						sink(nums,1,N);
				}
		}


		public static void exch(int[] a, int i, int j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
		}

		public static void sink(int[] nums, int i, int N) {
				while (2 * i <= N) {
						int j = i * 2;
						if (j < N && nums[j] < nums[j + 1])
								j++;
						if (nums[i] >= nums[j])
								break;
						exch(nums, i, j);
						i = j;
				}
		}

		public static void main(String[] args) {
				int[] a = {1, 3, 23, 43, 11, 5, 67, 2};
				int[] heapNums = new int[a.length + 1];
				for (int i = 1; i <= a.length; i++)
						heapNums[i] = a[i - 1];
				initHeapAndSorted(heapNums);
				System.out.println(Arrays.toString(heapNums));
		}
}
