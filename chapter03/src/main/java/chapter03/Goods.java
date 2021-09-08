package chapter03;

public class Goods {
	
	public static int  countofGoods = 0; //static 변수 jvm이 내려가야 없어짐 프로그램이 내려가도 살아있음.
	
	private String name;//private(접근지시자), 정보은닉과 캡슐화를위해 사용, 없으면 같은 페키지 않에서 다른 클레스가 접근할수 있다.
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods() {
		countofGoods = countofGoods+1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {//public 은 어디서나 참조할수 있는 메소드를 말함
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int pricare) {
		this.price = pricare;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}
	public void showInfo() {
		System.out.println("name:"+ name + ",price:"+ price + ",countStock:"+countStock + ",countSold"+ countSold);
	}
	public int calcDiscountPrice(int percentage) {
		return price*percentage/100;
	}
}

