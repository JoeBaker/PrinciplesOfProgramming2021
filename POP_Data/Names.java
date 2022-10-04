
/** 
 * Names class
 * This class contains all the String tasks following the week 14 lecture. 
 * 
 * @author Joe Baker
 * @since 2021
 */

public class Names {
	
	/** 
	 * Task 1
	 * 
	 * Converts a name to upper case.
	 * 
	 * @param name
	 * @return name in upper case
	 */
	public String upperCaseName(String name) {
		return name.toUpperCase();
	}
	
	/** 
	 * Task 2
	 * 
	 * Takes someone's first name and surname then returns their full name.
	 * 
	 * @param firstName, surname
	 * @return fullName
	 */
	public String fullName(String firstName, String surname) {
		return firstName + " " + surname;
	}
	
	
	/** 
	 * Task 3
	 * 
	 * Takes someone's name and returns the number of letters in it.
	 * 
	 * @param name
	 * @return length of name
	 */
	public int letterCount(String name) {
		return name.length();
	}
	
	
	/** 
	 * Task 4
	 * 
	 * Check if two names are the same, if they are it will return true.
	 * This function is case sensitive and ignores capitals.
	 * 
	 * @param name1, name2
	 * @return boolean, 
	 */
	public boolean theSameName(String name1, String name2) {
		return name1.equalsIgnoreCase(name2);
	}
	
	
	/** 
	 * Task 5
	 * 
	 * Takes a name as input and returns the name with the first letter
	 * as upper case and the rest as lower case.
	 * 
	 * @param name
	 * @return name with correct case
	 */
	public String properCaseName(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}

}
