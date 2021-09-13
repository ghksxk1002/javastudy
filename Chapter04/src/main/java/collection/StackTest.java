package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();

		s.push("둘리");
		s.push("마이콜");
		s.push("도우너");
		
		while(!s.isEmpty()) {
			String str = s.pop();
			System.out.println(str);
		}
		
		s.push("둘리");
		s.push("마이콜");
		s.push("도우너");
		
		
		//비어잇는결우에는 예외 발생
		//s.pop();
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		
		

		
	}
}