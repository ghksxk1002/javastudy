package prob01;

import java.util.HashSet;
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

	private static int randomize(int lNum, int rNum) {
		int random = (int) (Math.random() * rNum) + lNum;
		return random;
	}

	private static int[] randomizeAnswers() {
		/* 코드 작성(수정 가능) */
		HashSet<Integer> rNums = new HashSet<>();
		final int COUNT_ANSWER_NUMBER = 9;
		int[] boardNumbers = new int[COUNT_ANSWER_NUMBER];

		while (rNums.size() < COUNT_ANSWER_NUMBER) {
			int l = randomize(1, 9);
			int r = randomize(1, 9);
			rNums.add(l * r);
		}
		for(int rNum : rNums) {
			int i = 0;
			boardNumbers[++i] = rNum;
			System.out.println(rNum + " "+boardNumbers[i]);
		}
	//모르겠다
		return boardNumbers;
	}
}
