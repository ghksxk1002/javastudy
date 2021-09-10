package prob3;

public class Sparrow extends Bird{
	private String name;
	
	public void sing() {
		System.out.println( this.name +"는 소리내어 웁니다");
	}

	public void fly() {
		System.out.println("참새(쨱짹)는 날지않습니다");
	}
	
	
	

	@Override
	public String toString() {
		return "참새의 이름은 " + name + " 인디다.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}