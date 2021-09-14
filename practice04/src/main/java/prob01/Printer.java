package prob01;
//practice04
public class Printer {

	/*public void println(int println) {

		System.out.println(println);

	}

	public void println(boolean println) {

		System.out.println(println);

	}

	public void println(double println) {

		System.out.println(println);

	}

	public void println(String println) {

		System.out.println(println);

	}*/
	
	//제너릭 메소드
	/*public <T> void println(T t) {// 파라미터 앞에 지정했다고 해서 리턴타입의 제너릭이 아닌 파라미터의 제너릭 타입이다, 받고 싶은만큼 정의가 가능하다
		System.out.println(t);
	}*/
	//ㅇㅎ
	public <T> void println(T... ts) {// 파라미터 앞에 지정했다고 해서 리턴타입의 제너릭이 아닌 파라미터의 제너릭 타입이다, 받고 싶은만큼 정의가 가능하다
		for(T t: ts) {
			System.out.println(t);
		}
		
	}//제너릭 매소드와 가변파라미터를 합친것 오버로드가 필요가 없어진다
	
	public int sum(Integer... nums) {//가변파라미터 사용법
		int sum = 0;
		for(Integer i :nums) {
			sum += i;
		}
		return sum;
		
	}

	
	
	
}
