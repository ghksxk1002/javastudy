package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		System.out.println("수를 입력하였습니다. 맞추어보세요");
		while( true ) {
			
			/* 게임 작성 */
			
			int num = scanner.nextInt();
			
			
			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt( 100 ) + 1;
			
			System.out.print(num + ">>");
			System.out.println(correctNumber);
			
			if(num < correctNumber) {
				System.out.println("더높게");
			}
			else if (num > correctNumber ) {
				System.out.println("더 낮게");
			}
			else
				System.out.println("정답");
			
			
			
			

			
			//새 게임 여부 확인하기
			System.out.print( "다시 하겠습니까(y/n)>>" );
			String answer = scanner.next();
			if( "y".equals( answer ) == false ) {
				break;
			}
		}
		
		scanner.close();
	}

}