import java.util.Random;

/**
 * LabExample class used to explore if and loop statements
 * 
 * @author Joe Baker
 * @since 2021
 */

public class LabExample {

	/** 
	 * Task 1
	 * 
	 * Takes two integers and returns the highest one.
	 * Will return -1 if they are both equal.
	 * 
	 * @param number1, number2
	 * @return highest number
	 */
	public int highestOfTwo(int number1, int number2) {
		if (number1 > number2) {
			return number1;
		}
		else if (number1 < number2) {
			return number2;
		}
		else {
			return -1;
		}
	}
	
	/** 
	 * Task 2
	 * 
	 * Takes the exam mark of a student and returns the grade.
	 * 
	 * @param mark
	 * @return grade
	 */
	public String calculateGrade(int mark) {
		if (mark > 100 || mark < 0) {
			return "Invalid mark";
		}
		else if (mark < 40) {
			return "Fail";
		}
		else if (mark < 50) {
			return "3rd";
		}
		else if (mark < 60) {
			return "2ii";
		}
		else if (mark < 70) {
			return "2i";
		}
		else /* 70 or over */ {
			return "1st";
		}
	}
	
	/** 
	 * Task 3
	 * 
	 * Takes the users guess as input and then flips a coin,
	 * will return a string saying if they were correct and what was flipped.
	 * 
	 * @param guess
	 * @return result
	 */
	public String headsOrTails(String guess) {
		Random randomGen = new Random();
		String resultGuess;
		String resultFlip;
		if (randomGen.nextBoolean()) {
			resultGuess = "Correct";
			resultFlip = guess;
		}
		else {
			resultGuess = "Incorrect";
			if (guess == "heads") {
				resultFlip = "tails";
			}
			else {
				resultFlip = "heads";
			}
		}
		return resultGuess + ": you guessed " + guess + " and I flipped " + resultFlip;
	}
	
	/** 
	 * Task 4
	 * 
	 * Takes an integer and sums all the numbers from 1 to that number.
	 * 
	 * @param top number
	 * @return sum
	 */
	public int sumFromOneToWhat(int top) {
		int sum = 0;
		for (int i = 1; i <= top; i++) {
			sum += i;
		}
		return sum;
	}
	
	/** 
	 * Task 5
	 * 
	 * Takes two integers and sums all the numbers from the bottom number to the top number.
	 * 
	 * @param bottom number, top number
	 * @return sum
	 */
	public int sumFromWhatToWhat(int bottom, int top) {
		int sum = 0;
		for (int i = bottom; i <= top; i++) {
			sum += i;
		}
		return sum;
	}

}
