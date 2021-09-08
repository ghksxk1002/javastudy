package chapter03;

public class Goods {
	private String name;//private(접근지시자), 정보은닉과 캡슐화를위해 사용, 없으면 같은 페키지 않에서 다른 클레스가 접근할수 있다.
	private int price;
	private int countStock;
	private int countSold;
	public String getName() {
		return name;
	}
	public void setName(String name) {//public 은 어디서나 참조할수 있는 메소드를 말함
		this.name = name;
	}
	public int getPricare() {
		return price;
	}
	public void setPricare(int pricare) {
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
	
}

