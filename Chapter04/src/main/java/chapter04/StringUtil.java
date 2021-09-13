package prob04;

public class StringUtil {

<<<<<<< HEAD

	public static String[] concatenate(String[] strArr) {
		
		
		String[] string = new String[strArr.length];
		for(int i = 0; i < strArr.length ; i++) {
			   string[i] = strArr[strArr.length-i];
		}
		return string;
=======
	public static String concatenate(String[] strArr) {
			
		
			String arr = "";
			for(int i = 0; i < strArr.length; i++) {
				
				arr += strArr[i];
				
			}
		
		
		
		return arr;
>>>>>>> branch 'master' of https://github.com/ghksxk1002/javastudy.git
	}
}
