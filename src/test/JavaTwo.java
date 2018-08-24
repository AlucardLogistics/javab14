package test;

public class JavaTwo implements Walker {
	
	

	public static void main(String[] args) {
		
		// if else conditions
		int a = 0;
		int b = 1;
		
		if(a == b) {
			System.out.println("a and b are equal ... in age and rank! ");
		} else if(a > b) {			
			System.out.println("a greater than b .. be like A");			
		} else {
			System.out.println("a is smaller than b .. be like B");
		}
		System.out.println("if else statement");
		
		//switch cases
		int c = 4;
		switch(c) {
		case 0:
			System.out.println("c not 0");
			break;
		case 2:
			System.out.println("c not 2");
		case 4:
			System.out.println("c is 4, yay!");
			break;
		default:
			System.out.println("default!");
		}
		System.out.println("switch case");
		
		//for loop
		for(int i = 0; i<5; i++) {
			System.out.print(i + " ");
		}
		System.out.println("for loop");
		
		//while loop
		int i = 0;
		while(i < 3) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("while loop");
		//do while loop
		do {
			System.out.println(i + " ");
			i++;
		} while(i < 3);
		System.out.println("do while loop");
		//break statement
		for(int j = 0; j < 5; j++) {
			if(j == 3) {	
				System.out.println();
				System.out.println("j is " + j + " so we break");
				break;				
			}
			System.out.print(j + " ");
			
		}
		//continue statement
		for(int j = 0; j < 5; j++) {
			if(j == 3) {	
				System.out.println();
				System.out.println(" value 3 is skipped and continue");
				continue;				
			}
			System.out.print(j + " ");
				
		}		
	}
	/**
	 * boolean function
	 * @param num
	 * @param nun
	 * @return boolean value
	 */
	public boolean getValue(int num, int nun) {
		num = 9;
		nun = 7;
		return true;
	}
	@Override
	public void getSteps() {
		// TODO Auto-generated method stub
		
	}
	
	

}

