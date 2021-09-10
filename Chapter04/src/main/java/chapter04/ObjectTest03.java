package chapter04;

public class ObjectTest03 {

	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 = new String("hello");

		System.out.println(s1 == s2);//객체주소끼리 비교
		System.out.println(s1.equals(s2));//객체소리 비교
		System.out.println(s1.hashCode()+":"+s2.hashCode());
		System.out.println(System.identityHashCode(s1)+ ":"+System.identityHashCode(s2));//주소기반 해신
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		String s3 = "hello";
		String s4 = "Hello";

		System.out.println(s3 == s4);//객체주소끼리 비교
		System.out.println(s3.equals(s4));//객체소리 비교
		System.out.println(s3.hashCode()+":"+s4.hashCode());
		System.out.println(System.identityHashCode(s3)+ ":"+System.identityHashCode(s4));//주소기반 해신
	}

}
