
/**
 * ArrayMultiDimensions sampler
 * Examples of  
 *  * single dimensional arrays
 *  * parrallel arrays with values related by index
 *  * multidimensional arrays
 * 
 * @author Suzy Atfield-Cutts
 * @since November 2020
 *
 */
public class ArrayMultiDimensions {


	/**
	 * displayEmptyArray()
	 * 
	 * Display a single dimensional array
	 */
	public void displayEmptyArray() {
		int [] numbers = new int[10];

		System.out.println("Index\tValue");

		for (int index = 0; index < numbers.length; index++){
			System.out.println(index+"\t"+numbers[index]);
		}
	}
	
	/**
	 * displayEmptyArray()
	 * 
	 * change element value and display a single dimensional array
	 */
	public void changeElementFourValue() {
		int [] numbers = new int[10];

		System.out.println("Index\tValue");
		
		numbers[3] = 60;

		for (int index = 0; index < numbers.length; index++){
			System.out.println(index+"\t"+numbers[index]);
		}
	}
	
	/**
	 * parallelArrays()
	 * 
	 * Implementing parallel arrays related by index
	 */
	public void parallelArrays() {
		String[] names = {"Andy", "Brent", "Cali", "Dana", "Ely", "Fran", "Guy", "Hugh","Ike", "Jo"};
		int[] marks = {48, 64, 88, 60, 57, 19, 72, 64, 53, 61};

		System.out.println("Index\tName\tGrade");
		
		for (int index = 0; index < names.length; index++){
			System.out.println(index+"\t"+ names[index]+"\t"+ marks[index]);
		}
	}
	
	/**
	 * threeUnitsMarksSeparateArrays()
	 * 
	 * Implementing parallel arrays related by index
	 */
	public void threeUnitsMarksSeparateArrays() {
		String[] names = {"Andy", "Brent", "Cali", "Dana", "Ely", "Fran", "Guy", "Hugh", "Ike","Jo"};
		int[] studentPOPGrades = {32, 79, 44, 33, 51, 68, 56, 76, 63, 42};
		int[] studentDADGrades = {77, 42, 50, 66, 77, 22, 97, 44, 57, 78};
		int[] studentCFGrades  = {66, 56, 88, 65, 65, 90, 40, 36, 66, 72};
		
		System.out.println("Index\tName\tPOP\tDAD\tCF");
		
		for (int index = 0; index < names.length; index++){
			System.out.print(index+"\t"+ names[index]);
			System.out.print("\t"+ studentPOPGrades[index]);
			System.out.print("\t"+ studentDADGrades[index]);
			System.out.println("\t"+ studentCFGrades[index]);
		}
	}
	
	/**
	 * threeUnitsMarks2DArray()
	 * 
	 * Implementing 2D arrays
	 */
	public void threeUnitsMarks2DArray() {
		String[] names = {"Andy", "Brent", "Cali", "Dana", "Ely", "Fran", "Guy", "Hugh", "Ike","Jo"};
		int[][] marks = {{32,77,66}, {79,42,56}, {44,50,88}, {33,66,65}, {51,77,65}, {68,22,90}, {56,97,40}, {76,44,36}, {63,57,66}, {42,78,72}};

		
		System.out.println("Index\tName\tPOP\tDAD\tCF");
		
		for (int row = 0; row < names.length; row++){
			System.out.print(row+"\t"+ names[row]);
			
			for (int col = 0; col < marks[row].length; col++){
				System.out.print("\t"+ marks[row][col]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ArrayMultiDimensions  exampleArray = new ArrayMultiDimensions();
		//exampleArray.displayEmptyArray();
		//exampleArray.changeElementFourValue();
		//exampleArray.parallelArrays();
		//exampleArray.threeUnitsMarksSeparateArrays();
		//exampleArray.threeUnitsMarks2DArray();
	}
}
