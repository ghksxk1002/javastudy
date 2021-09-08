package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		str.length();
		for(int i = 0; i < str.length(); i++) {
			str[str.length()-1-i] = str[i];
		}
		return null;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		
		System.out.println( array );
	}
}