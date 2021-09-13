package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		//String s1 = "Hello" + "world" + "Java" + 1.8;
		
		String s1 = new StringBuffer("Hello ")
			.append("World ")
			.append("Java ")
			.append(1.8)
			.toString();
		
		System.out.println(s1);
		
		String s2 = " ";
		
		for(int i=0; i<1000;i++) {
			s2 = s2 + i;
			s2 = new StringBuffer(s2)
					.append(i)
					.toString();
			
		}
		
		
		StringBuffer sb2 = new StringBuffer("");
		for(int i=0; i<10000;i++) {
			
			sb2.append(i);
		}
		
		String s3 = sb2.toString();
		System.out.println(s3.length());
		
		
		//String Method들...
		String s4 = "aBcABCadcAdc";
		System.out.println(s4.length());//문자열길이
		System.out.println(s4.charAt(2));//특별한 위치의 문자를 뺴오는것
		System.out.println(s4.indexOf("abc"));//특정문자영이 존제하는 위치
		System.out.println(s4.indexOf("abc", 7));//문자열 존제를 찾는데 시작위치를 찾을수 있다. 탐색결과가 없으면 -1이 나온다
		System.out.println(s4.substring(3, 5));//출력할 구간을 설정해서 출력해줌 
		
		String s5 = "   ab   cd   ";
		String s6 = "efg,hij,klm,nop,qrs";
		
		String s7 = s5.concat(s6);//두개의 문자열을 합쳐주는 메소드
		System.out.println(s7);
		
		System.out.println("------"+s5.trim()+ "-----------");//trim은 앞뒤공배를 뺴는것
		System.out.println(s5.replaceAll(" ", ""));//모든 공백을 뺴는것
		
		String[] tokens = s6.split(",");//기준이 되는 세퍼레이터를 주면 그것을 기준으로 문자열을 나우어 문자열을 리턴해준다
		for(String s : tokens) {//s 라는 새로운 객체에 tokens 의 내용을 하나씩 뿌려줌
			System.out.println(s);
		}
		
		String[] tokens2 = s6.split(" ");
		for(String s : tokens2) {
			System.out.println(s);//쪼게질 기주이 없으면 그 문자열 그대로 출력된다.
		}
		
		

	}

}
