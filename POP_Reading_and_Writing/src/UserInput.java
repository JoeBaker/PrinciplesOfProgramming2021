import java.util.Scanner;

/**
 * UserInput class
 * 
 * @author Joe Baker
 * @since 2021
 */

public class UserInput {
	
	Scanner scan = new Scanner(System.in);
	
	/** 
	 * Task 1
	 * 
	 * Asks the user for their name and then returns Hello plus their name.
	 * 
	 * @return Hello plus user input name
	 */
	public String sayHello() {
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		return "Hello " + name;
	}
	
	/** 
	 * Task 2
	 * 
	 * Asks the user for ten numbers and then returns them in an array.
	 * 
	 * @return Array of 10 ints
	 */
	public int[] readTenNumbers() {
		int[] numbers = new int[10];
		for (byte i = 0; i < 10; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			numbers[i] = scan.nextInt();
		}
		scan.nextLine();
		return numbers;
	}
	
	/** 
	 * Task 3
	 * 
	 * Asks the user for ten names and then returns them in an array.
	 * 
	 * @return Array of 10 names
	 */
	public String[] readTenNames() {
		String[] names = new String[10];
		for (byte i = 0; i < 10; i++) {
			System.out.print("Enter name " + (i+1) + ": ");
			names[i] = scan.nextLine();
		}
		return names;
	}
}
