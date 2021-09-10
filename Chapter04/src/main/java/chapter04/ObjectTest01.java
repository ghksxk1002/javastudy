package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10 , 20);
		
//		Class klass = p.getClass();

		System.out.println(p.getClass());//reflect, 이 객체가 참조한 클래스의 정보를 리턴
		System.out.println(p.hashCode());//hashing=정수값을 만드는것...Hashing Funtion() 이라는 객체와 변수를 담고있는 함수가 피룡함. 왜 만들까?
										 //기본구현에서는 객체의 address 기반의 haxhing(해슁	)값 : 36612642가 나온다. 이렇게 볼수는 있다
										 //hashing 함수는 파라미터가 다르다고 해서 다른 값이라는 것을 보장해주지는 않는다.암호화 목적이 아님
		System.out.println(p.toString());//객체안의 내용을 스트리으로 바꾸어주는것. gatClass() + "@" + hashCode()
		System.out.println(p);			 
	}

}
