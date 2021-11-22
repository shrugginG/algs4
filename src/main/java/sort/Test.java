package sort;

import java.util.Arrays;

/**
 * @author shrugginG
 * @date 2021/11/6 15:25
 * @project algs4
 * @package sort
 */
public class Test {
		public static void main(String[] args) {
//				Selection a=new Selection();
//			    Integer[] b={1, 2, 5, 3, 12, 8, 17, 2, 3};
//				a.sort(b);
//				System.out.println(Arrays.toString(b));
				int a = 10;
				change(a);
				String test = "hello";
				change(test);
				System.out.println(a);
				System.out.println(test);
				Integer b = new Integer(10);
				b = 20;
				System.out.println(b);
		}

		public static void change(int num) {
				num = 100;
		}

		public static void change(String text) {
				text = "changed";
		}

}
