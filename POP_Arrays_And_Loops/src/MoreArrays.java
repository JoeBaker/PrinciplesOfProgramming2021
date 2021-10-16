import java.util.Arrays;
import java.util.Random;

/** 
 * MoreArrays class
 * 
 * @author Joe Baker
 * @since 2021
 */

public class MoreArrays {

	
	// Task 1 - Display the array
	public String displayArray(String[] names) {
		return String.join(", ", names);
	}

	
	//Task 2 - Sort the array and display it again
	public String sortArray(String[] names) {
		Arrays.sort(names);
		return String.join(", ", names);
	}
	
	
	// Task 3 - Search array for specific name
	public int searchArray(String[] names, String nameToFind) {
		return Arrays.binarySearch(names, nameToFind);
	}
	
	// Task 4 - Select a winner at random from the array of names 
	// and display that they are the winner
	public String selectWinner(String[] names) {
		Random randomNumberGenerator = new Random();
		String name =  names[randomNumberGenerator.nextInt(names.length)];
		return "Congratulations " + name + ", you are the winner!";
	}
}
