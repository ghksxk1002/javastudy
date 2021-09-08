package chapter03;

public class Goodsapp {
	
	public static void main(String[] args) {
		
		Goods goods = new Goods();
		goods.setName("Nikon");//프라이빗 접근명령자 떄문에 접근할수가 없다.
		goods.setPrice(200);
		goods.setCountStock(10);
		goods.setCountSold(20);
		goods.showInfo();
		
		
		goods.setPrice(-1);
		int discountPrice = goods.calcDiscountPrice(50);
		
		System.out.println(discountPrice);
		System.out.println(Goods.countofGoods);
		
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		
		String s = "콜라 1000 20";
		String[] tokens = s.split("");
		for(String str : tokens) {
			System.out.println(str);
		}
		
		
		System.out.println(Goods.countofGoods);
	}
	
}
