package chapter03;

public class SwapTest02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a + ":" + b);
		
		/*스홥하기*/
		swap(a,b);
		
			
		System.out.println(a +":"+ b);
	}
	
	
	public static void swap(int p, int q) {
		/*스홥하기*/
		int temp = p;
		p = q;
		p = temp;
	}
}
