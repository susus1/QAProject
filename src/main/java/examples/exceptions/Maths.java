package examples.exceptions;

public class Maths {

	public static void main(String[] args) {
		Maths maths = new Maths();
		try {
			int result = maths.divide(5, 0);
		} catch (DivisorTooBigException e) {
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

	public int divide(int a, int b) throws DivisorTooBigException {
		if (a < b) {
			throw new DivisorTooBigException();
		}
		int c = a / b;
		return c;

	}
}
