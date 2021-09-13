package collection;

import java.util.HashSet;
import java.util.Set;

public class HashingTest01 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		
		
		//두 객체가 동일성을 가지지만 동질성은 가지지 않는다
		String s1 = new String("도우너");
		String s2 = new String("도우너");
		
		s.add("둘리");
		s.add("마일클");
		s.add("또치");
		s.add(s1);//s 객체에 s1객체 추가
		
		System.out.println(s.size());
		System.out.println(s.contains("둘리"));
		System.out.println(s.contains(s2));//자료구조는 내용이 중요하기 떄문에 있다라고 나온다.
		
		
		
		
		for(String str :s) {
			System.out.println(str);
		}
		
		
		

	}

}
