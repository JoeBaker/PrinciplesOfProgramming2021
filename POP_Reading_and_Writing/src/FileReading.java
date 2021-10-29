import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * FileReading class
 * 
 * @author Joe Baker
 * @since 2021
 */

public class FileReading {

	/** 
	 * Task 1
	 * 
	 * Takes the name of a file as input which contains a name with each name
	 * on a new line, it will put them into a single string, and then return the 
	 * full name.
	 * 
	 * @param filename
	 * @return full name
	 * @throws IOException 
	 */
	public String readName1(String filename) throws IOException {
		String fullName = "";
		File nameFile = new File(filename);
		Scanner nameScan = new Scanner(nameFile);
		while (nameScan.hasNext()) {
			fullName += " " + nameScan.nextLine();
		}
		nameScan.close();
		return fullName.substring(1);
	}

	/** 
	 * Task 2
	 * 
	 * Takes the name of a file as input which contains a name with each name
	 * on a new line, it will put them into a single string, and then return the 
	 * full name.
	 * 
	 * @param filename
	 * @return full name
	 */
	public String readName2(String filename) {
		try {
			String fullName = "";
			File nameFile = new File(filename);
			Scanner nameScan = new Scanner(nameFile);
			while (nameScan.hasNext()) {
				fullName += " " + nameScan.nextLine();
			}
			nameScan.close();
			return fullName.substring(1);
		}
		catch (IOException e) {
			return "Invalid filename";
		}
	}
	
	/** 
	 * Task 3
	 * 
	 * Takes the name of a file as input which contains a list of new names on new lines,
	 * it will put read ten of them as strings and put them into an array.
	 * 
	 * @param filename
	 * @return array of ten names
	 * @throws IOException 
	 */
	public String[] readNames(String filename) throws IOException {
		String[] names = new String[10];
		File nameFile = new File(filename);
		Scanner nameScan = new Scanner(nameFile);
		for (byte i = 0; i < 10; i++) {
			names[i] = nameScan.nextLine();
		}
		nameScan.close();
		return names;
	}

	/** 
	 * Task 4
	 * 
	 * Takes a filename as input and reads the numbers in it to a maximum of 20.
	 * If there are less than 20 numbers the rest of the numbers will be 0.
	 * 
	 * @param filename
	 * @return array of 20 numbers
	 * @throws IOException 
	 */
	public int[] readNumbers1(String filename) throws IOException {
		int[] numbers = new int[20];
		File numberFile = new File(filename);
		Scanner numberScan = new Scanner(numberFile);
		for (byte i = 0; i < 20 && numberScan.hasNext(); i++) {
			numbers[i] = numberScan.nextInt();
		}
		numberScan.close();
		return numbers;
	}
	
	/** 
	 * Task 5
	 * 
	 * Takes a filename as input and reads the first 20 valid numbers in a file.
	 * If there are less than 20 numbers the rest of the numbers will be 0.
	 * 
	 * @param filename
	 * @return array of 20 numbers
	 * @throws IOException 
	 */
	public int[] readNumbers2(String filename) throws IOException {
		int[] numbers = new int[20];
		File numberFile = new File(filename);
		Scanner numberScan = new Scanner(numberFile);
		byte i = 0;
		while (i < 20 && numberScan.hasNext()) {
			try {
				numbers[i] = numberScan.nextInt();
				i++;
			}
			catch (InputMismatchException e) {
				numberScan.nextLine();
			}
		}
		numberScan.close();
		return numbers;
	}

	/** 
	 * Task 6
	 * 
	 * Takes a filename as input and reads the first 5 names and phone numbers from a file.
	 * Will return an array of strings with names and phone numbers separated with a colon.
	 * 
	 * @param filename
	 * @return address book array
	 * @throws IOException 
	 */
	public String[] readAddressBook(String filename) throws IOException {
		String[] addressBook = new String[5];
		File addressBookFile = new File(filename);
		Scanner addressBookScan = new Scanner(addressBookFile);
		for (byte i = 0; i < 5; i++) {
			addressBook[i] = addressBookScan.nextLine() +
					": " + addressBookScan.nextLine();
		}
		addressBookScan.close();
		return addressBook;
	}
}
