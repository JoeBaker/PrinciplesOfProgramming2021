import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * FileWriting class
 * 
 * @author Joe Baker
 * @since 2021
 */

public class FileWriting {

	/** 
	 * Task 1
	 * 
	 * Takes a single string that is your full name as input and splits it into new lines for each word,
	 * and then writes that to a file. It will then return the name that it was written to.
	 * 
	 * @param fullname
	 * @return filename
	 * @throws IOException 
	 */
	public String writeYourName(String fullname) throws IOException {
		String filename = "myNameFile.txt";
		PrintWriter nameOut = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
		nameOut.write(fullname.replace(' ', '\n'));
		nameOut.close();
		return filename;
	}
	
	/** 
	 * Task 2
	 * 
	 * Will generate any amount of random numbers and then write the to a file.
	 * 
	 * @param number of random numbers to generate
	 * @return filename
	 * @throws IOException 
	 */
	public String writeRandomNumbers(int amount) throws IOException {
		String filename = "randomNumbersFileToWrite.txt";
		PrintWriter numbersOut = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
		Random randomNums = new Random();
		for (int i = 0; i < amount; i++) {
			numbersOut.println(randomNums.nextInt(9000) + 1000);
		}
		numbersOut.close();
		return filename;
	}
}
