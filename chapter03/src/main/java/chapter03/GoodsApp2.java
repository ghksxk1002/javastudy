package chapter03;

import mypackage.Goods2;

public class GoodsApp2 {

	public static void main(String[] args) {
		Goods2 g = new Goods2();
		
		//public은 접근 제한이 없다
		g.name="camera";
		
		//protected는 같은 패키지에서만 접근이 가능하다
		//더 중요한 것은 자식에서도 접급이 가능하다
		//g.price = 1000;
		
		//디폴트는 같은 패키지에서만 접근이 가능하다
		//g.countStock = 10; 
		
		//private은 같은 클래스 에서만 접근이 가능하다.
		/*g.countSold = 10;*/
	}

}
