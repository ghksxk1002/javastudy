package prob01;

import java.util.Scanner;

//hashset 사용 심화
public class Gugudan {

	static int resultNumber = 0;

	public static void main(String[] args) {
		int l = randomize(1, 9);
		int r = randomize(1, 9);// l,r에 1`9까지 랜덤한 숫자 저장

		resultNumber = l * r;

		int[] answerNumbers = randomizeAnswers();// answerNumber 변수에 렌덤한값 저장
		int loc = randomize(0, 8);
		answerNumbers[loc] = resultNumber;// 인자값 0`8까지 렌덤하게 l*r 값저장

		System.out.println(l + " x " + r + " = ?");

		int length = answerNumbers.length;
		for (int i = 0; i < length; i++) {
			if (i % 3 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}

			System.out.print(answerNumbers[i]);
		}

		System.out.print("\n\n");
		System.out.print("answer:");

		Scanner s = new Scanner(System.in);
		int answer = s.nextInt();
		s.close();

		System.out.println((answer == resultNumber) ? "정답" : "오답");
	}
//
	private static int randomize(int lNum, int rNum) {
		int random = (int) (Math.random() * rNum) + lNum;
		return random;
	}

	private static int[] randomizeAnswers(){
		/* 코드 작성(수정 가능) */
		//이렇게도 풀수있구나
		final int COUNT_ANSWER_NUMBER = 9;
		int[] boardNumbers = new int[COUNT_ANSWER_NUMBER];
		int i = 0;
		while(i < COUNT_ANSWER_NUMBER) {
			int rNums = randomize(1,9)*randomize(1,9);
			boolean checkNum = false;
			for(int j = 0; j <COUNT_ANSWER_NUMBER; j++) {
				if(rNums == boardNumbers[j] || rNums == resultNumber) {//resultNumber : 클래스의 전역변수이기 때문에 사용가능
					checkNum = true;
					break;
				}
			}
			if(!checkNum) {
				boardNumbers[i++] = rNums;
			}
			
		}
		return boardNumbers;
	}
}
