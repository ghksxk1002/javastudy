package exeption;

public class ExeptionTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10 -a;
		
		
		System.out.println("some code1.....");
		try {
			System.out.println("some code2.....");
			int result = (1+2+3)/b;//0으로 나누면 무한대로 나누기 떄문에 오류
			System.out.println("some code3.....");
		}catch(ArithmeticException e){//회사마다 예외처리를 하는 방법이 정해져있따
			/*예외처리*/
			//1. 사과
			System.out.println("미안합니다.");
			//2. 로깅(로그로 남겨두는 행위)을 해야된다
			System.out.println("error:" + e);//e는 받는에러
			//3. 정상종료
			return;
			
		} finally {//return 다음에 있지만 finally는 실행이된다. 구문의 끝에 적는것이 좋다. 
					// 이 밑에는 코드를 안쓰는것이 좋다.
			System.out.println("자원 정리");
		}

	}

}
