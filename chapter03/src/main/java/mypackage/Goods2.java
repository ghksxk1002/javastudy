package mypackage;

public class Goods2 {
	public String name;		//모든 접근이 가능(접근 제한이 없다)
	protected int price;	//같은 페키지+자식 접근이 가능
	int countStock;		//디폴트, 같은 페키지 
	private int countSold;	//class 내부에서만 접근이 가능 

	void m() {
		countSold = 100;
	}
	
	
}
