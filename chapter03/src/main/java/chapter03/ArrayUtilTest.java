package chapter03;

import java.util.Arrays;

public class ArrayUtilTest {

	public static void main(String[] args) {
		double[] di = ArrayUtill.intToDouble(new int[] {10,20,30,40,50});//객체생성없이 메소드에 접근가능
		
		int[] a2 = ArrayUtill.doubleToInt(new double[] {10.1,20.2,30.3,40.4,50.5});
		
		double[] a3 = ArrayUtill.concat(new int[] {1,2,3,4}, new int[] {5,6,7,8});
		
		
		System.out.println(Arrays.toString(di));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
		
		
	}

}
