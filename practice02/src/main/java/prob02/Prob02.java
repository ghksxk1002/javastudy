package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] intArray = new int[ 5 ];
		double sum = 0;

		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		for(int i = 0; i < 5; i++) {
			int num = scanner.nextInt();
			intArray[i] = num;
		}
		/* 배열에 저장된 정수 값 더하기 */
		for(int i = 0; i < 5; i++) {
			sum +=intArray[i];
		}
		/* 출력 */
		System.out.println(sum/5);
		/* 자원정리 */
		scanner.close();
	}
}
