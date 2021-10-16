import java.util.Scanner;

public class Selection {
	Scanner scan = new Scanner(System.in);

	//Task 1 - Request and return the student's age.
	public String calculateGrade() {
		System.out.print("Enter student mark: ");
		byte grade;
		String result;
		try { grade = scan.nextByte(); }
		catch(Exception e) { grade = -1; }
		if (grade > 100 || grade < 0) {
			result = "Invalid Mark";
		}
		else if (grade < 40) {
			result = "Failed";
		}
		else if (grade < 50) {
			result = "3rd";
		}
		else if (grade < 60) {
			result = "2/2";
		}
		else if (grade < 70) {
			result = "2/1";
		}
		else {
			result = "1st";
		}
		return result;
	}

	//Task 2 - write a program to read in a speed and determine if a speeding ticket is due
	//And if so what the fine is.
	public String speedingTicket() {
		System.out.print("Enter speed limit: ");
		short limit = scan.nextShort();
		System.out.print("Enter car speed: ");
		short speed = scan.nextShort();
		if (speed <= limit) {
			return "Under the speed limit - no fine.";
		}
		else if (speed >= limit + 20) {
			return "20 miles or more over limit - fined £1000 and disqualified";
		}
		else if (speed >= limit + 15) {
			return "15 miles or more over limit - fined £150 and 3 points";
		}
		else if (speed >= limit + 10) {
			return "10 miles or more over limit - fined £100";
		}
		else if (speed >= limit + 5) {
			return "5 miles or more over limit - fined £50";
		}
		else {
			return "Over the speed limit – just – please be careful of your speed in future.";
		}
	}

	//Task 3 - write a program to read in a speed and determine if a speeding ticket is due
	//And if so what the fine is.
	public String whatDay() {
		System.out.print("Enter the day number: ");
		byte day;
		String dayWord;
		try { day = scan.nextByte(); }
		catch(Exception e) { day = 0; }
		if (day >= 1 && day <= 7) {
			dayWord = (new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"})[day-1];
		}
		else {
			dayWord = "INVALID DAY ENTERED";
		}
			
		return dayWord;
	}

	//Task 4 - Check whether a number entered by the user is divisible by
	// 3, 7, both or neither of them. Return a message giving the result.
	public String checkNumber() {
		System.out.print("Enter the day number: ");
		int number;
		try { number = scan.nextInt(); }
		catch(Exception e) { return "Invalid Number Entered"; }
		if (number % 3 == 0 && number % 7 == 0) {
			return number + " is divisible by 3 and 7";
		}
		else if (number % 3 != 0 && number % 7 == 0) {
			return number + " is divisible by 7 but not 3";
		}
		else if (number % 3 == 0 && number % 7 != 0) {
			return number + " is divisible by 3 but not 7";
		}
		else {
			return number + " is not divisible by either 3 or 7";
		}
	}

}