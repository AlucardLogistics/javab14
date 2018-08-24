package test;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Person playerOne = new Person(100, "Randy", 30);
		Person playerTwo = new Person(100, "Aluc", 87);
		boolean start = true;
		Scanner scanner = new Scanner( System.in );
		
		
		while(start) {
			//String readString = scanner.nextLine();
			int pTwoHit = hit();
			int pOneHit = hit();
        	playerOne.health = playerOne.health - pTwoHit;
        	System.out.println(playerTwo.getName() + " hit for: " + pTwoHit + " damage.");
			System.out.println(playerOne.getName() + " health is: " + playerOne.health);
			playerTwo.health = playerTwo.health - pOneHit;
			System.out.println(playerOne.getName() + " hit for: " + pOneHit + " damage.");
			System.out.println(playerTwo.getName() + " health is: " + playerTwo.health);
			if(playerTwo.health <= 0) {
				System.out.println(playerOne.getName() + " wins!");
				System.out.println("Game Over");
				start = false;
			} else if(playerOne.health <= 0) {
				System.out.println(playerOne.getName() + " wins!");
				System.out.println("Game Over");
				start = false;
			}
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	private static int hit() {
		
		Random rd = new Random();		
		return rd.nextInt(20) + 1;
	}
	
	private static int critHit() {
			
			Random rd = new Random();		
			return hit()*2;
		}

}
