package chapter04;

public class ObjectTest02 {

	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		Point p3 = p2;
		
		
		//여기서 비교연산자는 두 객체의 동일성을 검사하는것이다
		//매소드가 아닌 연산자는 동일성비교 밖에 할수 없다
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
	
		//동질성 비교 : 두 객체의 동질성(내용비교)
		//			부모 클래스 Object의 기본 구현은 동일성(==) 비교와 같다.
		//equals 
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
	
	}

}
