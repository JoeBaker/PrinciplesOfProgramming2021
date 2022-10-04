import java.util.Random;

/**
 * WordPlay class used to explore if and loop statements
 * 
 * @author Joe Baker
 * @since 2021
 */

public class WordPlay {
	
	/** 
	 * Task 1
	 * 
	 * Takes two words and returns a message saying which one comes first alphabetically.
	 * 
	 * @param String 1, String 2
	 * @return Answer
	 */
	public String whatComesFirst(String word1, String word2) {
		int comparison = word1.compareToIgnoreCase(word2);
		if (comparison == 0) {
			return word1 + " is the same as " + word2;
		}
		else if (comparison < 0) {
			return word1 + " comes before " + word2 + " in the alphabet";
		}
		else {
			return word2 + " comes before " + word1 + " in the alphabet";
		}
	}
	
	/** 
	 * Task 2
	 * 
	 * Takes a string and returns it backwards.
	 * 
	 * @param String
	 * @return String backwards
	 */
	public String backwardsString(String message) {
		return new StringBuilder(message).reverse().toString();
	}
	
	/** 
	 * Task 3
	 * 
	 * Takes an array of names and an array of phone numbers,
	 * adds them together and returns an array with them together
	 * 
	 * @param names array, phone numbers array
	 * @return names and phone numbers array
	 */
	public String[] addressBook(String[] names, String[] numbers) {
		String[] namesAndNumbers = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			namesAndNumbers[i] = names[i] + " " + numbers[i];
		}
		return namesAndNumbers;
	}
	
	/** 
	 * Task 4
	 * 
	 * Takes a users choice as input of if they guessed rock, paper or scissors
	 * the computer then randomly selects one of the options,
	 * and then returns a message saying the results
	 * 
	 * @param user guess
	 * @return results
	 */
	public String rockPaperScissors(String userChoice) {
		Random randomGenerator = new Random();
		String[] words = {"rock", "paper", "scissors"};
		String compChoice = words[randomGenerator.nextInt(3)];
		
		String result;
		if ((userChoice == "rock" && compChoice == "paper") ||
				(userChoice == "paper" && compChoice == "scissors") ||
				(userChoice == "scissors" && compChoice == "rock")) {
			result = "COMPUTER wins";
		}
		else if ((userChoice == "paper" && compChoice == "rock") ||
				(userChoice == "scissors" && compChoice == "paper") ||
				(userChoice == "rock" && compChoice == "scissors")) {
			result = "user wins";
		}
		else {
			result = "it is a draw";
		}
		
		return "USER:" + userChoice + " vs COMP:" + compChoice + " " + result;
	}
	
}
