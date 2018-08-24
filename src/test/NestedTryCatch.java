package test;

import java.io.IOException;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		try {//outer
			
			int f = 3/0;
			
			try {
				int a = 10/0;
				
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception");
			}
			
			try {
				int b[] = new int[5];
				b[5] = 11;
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("arithmetic exception occured");
			}
			
		} catch (Exception e) {
			System.out.println("App flow! ");
		}
		
		finally {
			System.out.println("Finally always occours w error or not!");
		}
			
		
		System.out.println("Close files w error or not!");

	}
	
	public static void validate(int age) throws CustomException {
		if(age > 18) {
			System.out.println("old enough");
		} else {
			throw new CustomException();
		}
	}

}
