package prob03;

public class CurrencyConverter {

	
	private static double rate;
	
	public static void setRate(double d) {
		rate = d;
	}

	public static double toDollar(double d) {
		rate *=d;
		return rate;
	}

	public static double toKRW(double d) {
		rate /=d;
		return rate;
	}

}
