package prob3;

public class Duck extends Bird{
	
	private String name;
	
	public void sing() {
		System.out.println("오리(꽥꽥이)는 소리내어 웁니다");
	}

	public void fly() {
		System.out.println("오리(꽥꽥이)는 날지않습니다");
	}
	
	
	@Override
	public String toString() {
		return "오리의 이름은" + name + " 입니다";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
