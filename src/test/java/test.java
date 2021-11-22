import java.awt.image.Kernel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test {
		public int[] twoSum(int[] nums, int target) {
				int[] result = new int[2];
				for (int i = 0; i < nums.length; i++) {
						for (int j = i + 1; j < nums.length; j++) {
								if (nums[i] + nums[j] == target) {
										result[0] = i;
										result[1] = j;
										break;
								}
						}
				}
				return nums;
		}
		HashMap


}
