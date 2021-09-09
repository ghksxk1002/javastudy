package prob03;


public class CurrencyConverterTest {

	public static void main(String[] args) {
		//  환율을 세팅 합니다.
		CurrencyConverter.setRate(1197.0);
		
		double dollar = CurrencyConverter.toDollar( 1000000 );
		System.out.printf( "백만원는 %.4f 달러 입니다\n",dollar );
		double krw = CurrencyConverter.toKRW( 100. );
		System.out.printf( "백만원은 %.4f 원화 입니다", krw );
	}

}