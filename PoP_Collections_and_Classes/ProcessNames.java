import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ProcessNames class
 * 
 * @author Joe Baker
 * @since 2021
 */

public class ProcessNames {

	
	
	/** 
	 * Task 1 - read in all data from a file
	 * 
	 * Reads the names of a file and returns them as an array list.
	 * Works no matter how long the file is.
	 * 
	 * @param filename
	 * @return arrayList of all names
	 * @throws IOException
	 */
	public ArrayList<String> readNames(String filename) throws IOException {
		ArrayList<String> names = new ArrayList<String>();
		File nameFile = new File(filename);
		Scanner nameScan = new Scanner(nameFile);
		while (nameScan.hasNextLine()) {
			names.add(nameScan.nextLine());
		}
		nameScan.close();
		return names;
	}
	
	/** 
	 * Task 2 - sort the data
	 * 
	 * Takes an arrayList of names and sorts them.
	 * 
	 * @param unsorted arrayList of names
	 * @return sorted arrayList of names
	 */
	public ArrayList<String> sortNames(ArrayList<String> names) {
		Collections.sort(names);
		return names;
	}
	
	/** 
	 * Task 3 - find name position
	 * 
	 * Takes an arrayList and a name to find and returns the position of that name in the arrayList.
	 * If the name is not in the list it will return -1.
	 * 
	 * @param arrayList of names, name to find
	 * @return position of name
	 */
	public int findNamePosition(ArrayList<String> names, String nameToFind) {
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).equals(nameToFind)) {
				return i;
			}
		}
		return -1;
	}
	
	/** 
	 * Task 4 - delete name
	 * 
	 * Takes an arrayList and a name to remove and returns an arrayList without that name.
	 * 
	 * @param arrayList of names, name to remove
	 * @return new arrayList of names
	 */
	public ArrayList<String> deleteName(ArrayList<String> names, String nameToRemove) {
		names.remove(nameToRemove);
		return names;
	}
	
	/** 
	 * Task 5 - change name 
	 * 
	 * Takes an arrayList, a name to replace, and a name to replace it with.
	 * A new arrayList is returned with the name replaced.
	 * If the old name does not exist, the original arrayList will be returned.
	 * 
	 * @param arrayList of names, old name to replace, new name
	 * @return new arrayList of names
	 */
	public ArrayList<String> changeName(ArrayList<String> names, String oldName, String newName) {
		int position = findNamePosition(names, oldName);
		if (position != -1) {
			names.set(position, newName);
		}
		return names;
	}

}
