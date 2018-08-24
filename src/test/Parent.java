package test;

public class Parent {
	
	int a = 4;
	
	public Parent() {}
	
	public Parent(int a) {
		this.a = a;
	}
	
	public int getValue(int a) {
		return a;
	}
	
	public int getValue(int a, int b) {
		return a + b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	
}


