package test;

import java.io.IOException;

public class ThrowTest {

	public static void main(String[] args) {
		
		ThrowTest test = new ThrowTest();
		test.m();
		//test.z();
		
		try {
			NestedTryCatch.validate(12);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic e");
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Custom Message age to small");
		} 		
		System.out.println("NEXT PERSON!!");

	}
	
	public void m() {
		
		try {
			n();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Exception handled in m function");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOexception form method p");
		}
	}
	
	public void n() throws IOException {
			o();//pass error to m
			p();
			try {
				z();
			} catch (IndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("z method handled in n");
			}
		}
	
	public void o() {
		int a = 10/0;
		//pass error to n
		
	}
	
	public void p() throws IOException {
		throw new IOException();
	}
	
	public void z() {
		throw new IndexOutOfBoundsException("arithmetic in z, handle me here or in next method im calld in");
	}

}
