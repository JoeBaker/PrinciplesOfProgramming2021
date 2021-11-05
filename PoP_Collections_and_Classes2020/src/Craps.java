import java.util.Scanner;

/**
 * Craps class
 * 
 * @author Joe Baker
 * @since 2021
 */

public class Craps {
	
	private Dice dice1 = new Dice();
	private Dice dice2 = new Dice();
	/**
	 * Task 1
	 * 
	 * Rolls both of the dice at the same time.
	 */
	public void shoot() {
		dice1.roll();
		dice2.roll();
	}
	
	/**
	 * Task 1
	 * 
	 * Returns the object of dice1.
	 * 
	 * @return dice1 object
	 */
	public Dice getDice1() {
		return dice1;
	}
	
	/**
	 * Task 1
	 * 
	 * Returns the object of dice2.
	 * 
	 * @return dice2 object
	 */
	public Dice getDice2() {
		return dice2;
	}
	
	/**
	 * Task 2
	 * 
	 * Adds the two dices values together and returns it.
	 * 
	 * @return sum of both dice
	 */
	public int addUpScore() {
		return dice1.getFaceValue() + dice2.getFaceValue();
	}
	
	/**
	 * Task 3
	 * 
	 * Takes the sum of the dices as input and outputs what the values mean.
	 * 
	 * @param dices sum
	 * @return outcome
	 */
	public String decideOutcome(int sum) {
		if (sum == 7 || sum == 11) {
			return "You win";
		}
		else if (sum == 2 || sum == 3 || sum == 12) {
			return "You lose";
		}
		else {
			return "Throw again";
		}
	}
	
	/**
	 * Task 4 - No UNIT TEST FOR THIS ONE - Check the output
	 * 
	 * Returns a string with the details and results of a throw.
	 * 
	 * @return results
	 */
	public String getResults() {
		String results;
		results = "Dice 1 is " + dice1.getFaceValue();
		results += "\nDice 2 is " + dice2.getFaceValue();
		int totalScore = addUpScore();
		results += "\nTotal is: " + totalScore;
		results += "\nResult is " + decideOutcome(totalScore);
		return results;
	}
	
	/**
	 * Task 5 - No UNIT TEST FOR THIS ONE - Check the output
	 * 
	 * Will play craps until it either wins or looses.
	 * 
	 * @return results
	 */
	public String playCraps() {
		String results = "";
		String outcome = "";
		do {
			shoot();
			outcome = getResults();
			results += outcome + "\n**************\n";
		} while (outcome.contains("Throw again"));
		return results;
	}
	
	/**
	 * Task 6 - Additional tasks - OPTIONAL AND NOT ASSESSED
	 * Can you add a method that asks the user if they want to play again?
	 * 
	 * Will play craps and ask the user if they want to play again, 
	 * if they do, it will play again and then ask again.
	 * This will keep happening until they don't chose to play again.
	 */
	public void playAgain() {
		char playAgain = 'y';
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println(playCraps());
			System.out.print("Do you want to play again? ");
			playAgain = scan.nextLine().charAt(0);
		} while (Character.toUpperCase(playAgain) == 'Y');
		scan.close();
	}
	
}
