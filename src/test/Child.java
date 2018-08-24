package test;

public class Child extends Parent {
	
	int a = 33;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child mChild = new Child();
		System.out.println(mChild.a);
		Parent child = new Child();
		System.out.println(child.getValue(9));
		System.out.println(child.getValue(3, 4));
		System.out.println(child.multiply(3, 4));

	}
	
	public int getValue(int a, int b) {
		return a - b;
	}

}

