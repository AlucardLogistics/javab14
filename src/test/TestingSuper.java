package test;

public class TestingSuper extends Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingSuper testSUper = new TestingSuper();
		testSUper.testSuper();

	}
	
	void testSuper() {
		System.out.println(super.a);
	}

}
