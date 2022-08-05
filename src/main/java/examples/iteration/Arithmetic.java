package examples.iteration;

public class Arithmetic {

	public static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	public static long factorial(int i) {
		// TODO Auto-generated method stub
		long result = 1;
		for (; i > 1; i--) {
			result *= i;
		}
		return result;
	}

}
