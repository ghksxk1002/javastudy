package chapter03;
//
public class ArrayUtill {
	
	//응
	
	static double[] intToDouble(int[] d1) {
		double[] doubleArr = new double[d1.length];
		for(int i = 0; i < d1.length; i++) {
			doubleArr[i] = (double)d1[i];
		}

		return doubleArr;
	}

	static int[] doubleToInt(double[] a2) {
		
		int[] intArr = new int[a2.length];
		for(int i = 0; i < a2.length; i++) {
			intArr[i] = (int) a2[i];
		}

		return intArr;
	}

	static double[] concat(int[] a3, int[] a4) {
		
		int[] New = new int[a3.length + a4.length];
		
		int index = 0;
		
		for(int i : a3) {
			
		}
		
		return null;
	}


}
