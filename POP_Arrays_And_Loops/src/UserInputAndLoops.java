import java.text.DecimalFormat;
import java.util.Scanner;

public class UserInputAndLoops {

	Scanner scan = new Scanner(System.in);

	//Task 1 - Request and return the student's age.
	public int studentAge() {
		System.out.print("Enter the students age: ");
		return scan.nextInt();
	}


	//Task 2 - Request the student's first name and surname, returning as 
	// a single string.
	public String studentName() {
		System.out.print("Enter the students first name: ");
		String name = scan.nextLine();
		System.out.print("Enter the students surname: ");
		name += " " + scan.nextLine();
		return name;
	}


	//Task 3 - Request and return the full student details
	public String studentDetails() {
		System.out.print("Enter your first name: ");
		String firstName = scan.nextLine();
		System.out.print("Enter your surname: ");
		String surname = scan.nextLine();
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		System.out.print("Enter your target starting salary: ");
		DecimalFormat currencyFormat = new DecimalFormat("£#,##0.00");
		String salary = currencyFormat.format(scan.nextInt());
		scan.nextLine();
		System.out.print("Enter your phone number: ");
		String phone = scan.nextLine();
		return firstName + " " + surname + " will be " + (age+4) + " when they graduate.\nSalaries over " +
			salary + " will be considered.\nTo contact " + firstName + ", call " + phone + "." ;
	}

	//Task 4 - Reading in Numbers and store in an array
	public int[] storeNumbers() {
		int[] numbers = new int[5];
		for (byte i = 0; i < 5; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			numbers[i] = scan.nextInt();
		}
		return numbers;
	}
	
	//Task 5 - Read in 3 marks, store in an array and calculate the average.
	public int numberTotal() {
		int total = 0;
		for (byte i = 0; i < 5; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			total += scan.nextInt();
		}
		return total;
	}

	//Task 6 - Read in 3 marks, store in an array and calculate the average.
	public double gradeAverage() {
		int total = 0;
		for (byte i = 0; i < 5; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			total += scan.nextInt();
		}
		return total / 5.0;
	}
	
	//Task 7 - calculate the square and cube of numbers 0 to value given by user
	// display the results in a table format
	public void squaresAndCubes() {
		System.out.println("Number\tSquare\tCube");
		for (byte i = 0; i <= 12; i++) {
			System.out.println(i + "\t" + (int)Math.pow(i, 2) + "\t" + (int)Math.pow(i, 3));
		}
	}
}