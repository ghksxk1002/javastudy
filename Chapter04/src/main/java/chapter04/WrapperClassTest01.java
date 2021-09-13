package chapter04;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('c');
		Boolean b = new Boolean(true);
		
		//위에꺼 아래꺼 같은 내용이지만 리터럴풀이 자동으로 만들어준다. 자동으로 랩핑, 박스를 만들어서 기본타임의 객체로 만들어준다. Auto Boxing이라고 한다.
		Integer j = 10;
		Integer j2 = 10;
		
		System.out.println(j == j2);// 동질성검사
		System.out.println(j.equals(j2));
		
		
		int m = j.intValue()/*객체안의 내용을 뺴내는것*/+10;//이런경우에는 자동으로 언박싱을 해준다.
		System.out.println(m);
		

	}

}
