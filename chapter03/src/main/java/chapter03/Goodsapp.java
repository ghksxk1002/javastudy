package chapter03;

public class Goodsapp {
	public static void main(String[] args) {
		
		
		Goods goods = new Goods();
		goods.setName("Nikon");//프라이빗 접근명령자 떄문에 접근할수가 없다.
		goods.setPricare(200);
		goods.setCountStock(10);
		goods.setCountSold(20);
		
		System.out.println(goods.toString());
	}
	
}
