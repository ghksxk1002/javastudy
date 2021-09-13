package chapter04;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		String s1 = "123456";
		int i = Integer.parseInt(s1);//Integer객체에 s1스트링 객체를 int로 변환시켜줌

		// cf1 반대로
		String s2 = String.valueOf(i);//int롤 된 값을 String 으로 바꿔줌
		// cf2 반대로
		String s3 = "" + i;
		
		System.out.println(s1 + ":" + s2 + ":" + s3);
		
		char c = 'A';
		int a = Character.getNumericValue('A');
		System.out.println((int)c);
		
		
		//2진수 
		String s4 = Integer.toBinaryString(15);
		System.out.println(s4);
		
		
		//16진수
		String s5 = Integer.toHexString(15);
		System.out.println(s5);
	}

}
