package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		int convert = 0;
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		//practice01
		System.out.print("κΈμ‘:");
		int num = scanner.nextInt();
		
		for(int i = 0; i < 10; i++) {
			
			convert = num/MONEYS[i];
			for(int j = 0; j < convert; j++) {
				num -= MONEYS[i];
			}
			
			
			System.out.println(MONEYS[i]+"μ "+convert+"μ");
		}
		scanner.close();
 	}
}