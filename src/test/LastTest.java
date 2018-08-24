package test;

public class LastTest extends TestAbstract implements testInterfacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastTest lastTest = new LastTest();
		lastTest.testAbstract();
		lastTest.firstMethod();
		lastTest.secondMethod();
		lastTest.thirdMethod();
	}

	@Override
	public void testAbstract() {
		System.out.println("Implemented abstract method");
		
	}

	@Override
	public void firstMethod() {
		System.out.println("first Mehtod");
		
	}

	@Override
	public void secondMethod() {
		System.out.println("second Mehtod");
		
	}

	@Override
	public void thirdMethod() {
		System.out.println("third Mehtod");
		
	}

}
