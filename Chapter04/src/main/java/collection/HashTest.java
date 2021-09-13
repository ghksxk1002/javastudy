package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();//여기서 String은 키값이다. 이값은 불변이여야 한다. String은 불변하기 떄문에 자주 사용한다
		
		
		String ks1 = "one";
		map.put(ks1, 1);//auto boxing .... new Integer(1);
		map.put("two", 2);
		map.put("three", 3);
		
		int i = map.get("one"); //Auto Boxing
		int j = map.get(new String("one")); //Auto Boxing
		
		System.out.println(i);
		System.out.println(j);
		
		
		map.put("three", 3333);//같은 키값으로 새롭게 입력하면 이전꺼에 덮어쓴다
		System.out.println(map.get("three"));
		
		// 순회
		Set<String> s = map.keySet();//map에서 key같은 리턴해주는 메소드
		
		for(String key : s) {
			System.out.println(map.get(key));//키 같을 가진 값들을 출력
		}
		
		
		
	}

}
