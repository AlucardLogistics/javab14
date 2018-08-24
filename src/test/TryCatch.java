package test;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int a = 10/0;
			int b[] = new int[5];
			b[5] = 10;
		
		} catch (ArithmeticException e) {
			System.out.println("arithmetic exception occured");
		} catch (ArrayIndexOutOfBoundsException ee) {
			System.out.println("ArrayIndexOutOfBounds exception occured");
		} catch (Exception eee) {
			eee.printStackTrace();
			System.out.println("Something, Smething Dark Side!");
		}

	}

}
