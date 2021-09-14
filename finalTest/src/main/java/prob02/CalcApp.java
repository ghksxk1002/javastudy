package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("두 정수와 연산자를 입력하시오");
			System.out.print(">> ");
			String expression = scanner.nextLine();// 한줄에 입력

			if ("quit".equals(expression)) {// quit이라는 문자열이 들어오면 프로그램종료
				break;
			}

			String[] tokens = expression.split(" ");// 스페이스 담위로 token 문자열 객체에 입력값 저장

			if (tokens.length != 3) {// token 문자열 객체의 길이가 3이상이 되면 알수 없는 식이라는 값 출력후 다시 입력
				System.out.println(">> 알 수 없는 식입니다.");
				continue;
			}

			int lValue = Integer.parseInt(tokens[0]);
			int rValue = Integer.parseInt(tokens[2]);// 양쪽 항에 토큰에 저장된값 저장Integer.parsnInt는 문자열을 인트형으로 바꿔줌

			Arithmetic arithmetic = null;// 인터페이스로 지정한 변수에 null로 지정

			/* 코드 작성 */
			if (tokens[1].equals("+") ) {
				arithmetic = new Add();
			} else if (tokens[1].equals("-")) {
				arithmetic = new Sub();
			} else if (tokens[1].equals("*")) {
				arithmetic = new Mul();
			} else {
				arithmetic = new Div();
			}
			int result = arithmetic.calculate(lValue, rValue);
			System.out.println(">> " + result);
		}

		scanner.close();
	}
}