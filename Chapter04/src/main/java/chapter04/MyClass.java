package chapter04;

public class MyClass {
	
	private static MyClass instance = null;
	private MyClass() {}
	
	//싱글톤 +팩토리 메소드
	public static MyClass getInstance() {
		if(instance == null) {
			instance = new MyClass();
		}
		return instance;
	}

}
