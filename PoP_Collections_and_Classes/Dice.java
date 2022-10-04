import java.util.Random;

/**
 * Dice class
 * 
 * @author Joe Baker
 * @since 2021
 */

public class Dice {
	
	private Random rand = new Random();
	private int faceValue;
	
	/** 
	 * Task 1
	 * 
	 * Rolls the dice and generates a new number between 1 and 6 for the dice.
	 */
	public void roll() {
		faceValue = rand.nextInt(6) + 1;
	}
	
	/** 
	 * Task 1
	 * 
	 * Gets the current value of the dice.
	 * 
	 * @return face value of dice
	 */
	public int getFaceValue() {
		return faceValue;
	}
	
	/** 
	 * Task 2
	 * 
	 * Will convert the value of the dice to a string
	 * 
	 * @return face value of dice as string
	 */
	public String toString() {
		return Integer.toString(faceValue);
	}
	
}
