package prob04;

public class StringUtil {


	public static String[] concatenate(String[] strArr) {
		
		
		String[] string = new String[strArr.length];
		for(int i = 0; i < strArr.length ; i++) {
			   string[i] = strArr[strArr.length-i];
		}
		return string;
	}
}
