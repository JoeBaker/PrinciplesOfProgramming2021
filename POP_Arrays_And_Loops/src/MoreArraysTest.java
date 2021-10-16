
public class MoreArraysTest {

	public static void main(String[] args) {
		MoreArrays moreArrays = new MoreArrays();
		String[] names = {"Bob", "Fred", "Gabriella", "Mohammed", "Eric", "Xavier", "Albert", "Connor", "Kevin", "Laura"};

		//task1 test
		//System.out.println(moreArrays.sortArray(names));
		
		// task2 test
		//System.out.println(moreArrays.displayArray(names));
		
		//task3 test
		// See if the array contains a specific name 
		// Try one that is there and one that isn't
		//System.out.println(names[moreArrays.searchArray(names, "Bob")]);
		//System.out.println(names[moreArrays.searchArray(names, "Kevin")]);
		
	
		//int[] numbers = {10,20,30,40,50};
		//System.out.println(myArrays.addUpNumbers(numbers));
			
		//task 4 test
		System.out.println(moreArrays.selectWinner(names));
		System.out.println(moreArrays.selectWinner(names));
	
	}
}