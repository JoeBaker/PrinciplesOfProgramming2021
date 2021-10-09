import java.util.Random;

/** 
 * MyArrays class
 * This class contains all the array tasks following the week 14 lecture. 
 * 
 * @author Joe Baker
 * @since 2021
 */

public class MyArrays {

	/** 
	 * Task 1
	 * 
	 * Takes five numbers and returns the sum of them.
	 * 
	 * @param number1, number2, number3, number4, number5
	 * @return sum of numbers
	 */
	public int addUpNumbers(int num1, int num2, int num3, int num4, int num5) {
		return num1 + num2 + num3 + num4 + num5;
	}
	
	/** 
	 * Task 2
	 * 
	 * Takes an array of numbers and returns the sum of them.
	 * 
	 * @param array of numbers
	 * @return sum of numbers
	 */
	public int addUpNumbers(int[] numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}
	
	/** 
	 * Task 3
	 * 
	 * Takes an array of numbers and calculates their average.
	 * 
	 * @param array of numbers
	 * @return average of numbers
	 */
	public double averageOfNumbers(int[] numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return (double)total / numbers.length;
	}
	
	/** 
	 * Task 4
	 * 
	 * Takes an array of temperatures in Fahrenheit and converts
	 * them to Celsius and returns them in an array.
	 * 
	 * @param array of Fahrenheit temperatures
	 * @return array of Celsius temperatures
	 */
	public int[] convertToCelsius(int[] temperatures) {
		for (int i = 0; i < temperatures.length; i++) {
			temperatures[i] = (int)((temperatures[i] - 32) * (5/9.0));
		}
		return temperatures;
	}
	
	/** 
	 * Task 5
	 * 
	 * Takes an array of grades and returns an array of unit codes with the grades
	 * as well as calculates the average grade and adds that onto the end.
	 * 
	 * @param array of six grades
	 * @return array of the unit codes with grade and average
	 */
	public String[] unitMarks(int[] grades) {
		String[] unitGrades = {"APP", "BSAD", "CF", "DAD", "N&CS", "POP", "Average"};
		int totalGrade = 0;
		for (int i = 0; i < 6; i++)
		{
			unitGrades[i] += ":" + grades[i];
			totalGrade += grades[i];
		}
		unitGrades[6] += ":" + (totalGrade / 6.0);
		return unitGrades;
	}
	
	/** 
	 * Task 6
	 * 
	 * Chooses a random string from an array of strings.
	 * 
	 * @param Array of strings
	 * @return A randomly selected string from the array
	 */
	public String andTheWinnerIs(String[] names) {
		Random randomNumberGenerator = new Random();
		return names[randomNumberGenerator.nextInt(names.length)];
	}

}
