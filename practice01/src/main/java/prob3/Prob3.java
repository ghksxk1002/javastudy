package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int result = 0;
		
		System.out.print("숫자를 입력하세요:");
		while(scanner.hasNext()) {
			int num = scanner.nextInt();
			if (num % 2 == 1) {
				for (int i = 0; i <= num; i++) {
					if(i % 2 == 0) {
						result +=i;
					}
					
				}
			} else {
				for (int i = 0; i <=num; i++) {
					if(i % 2 != 0) {
						result +=i;
					}
				}
			}
			System.out.println("결과값:"+result);
		}
		scanner.close();
	}
}
