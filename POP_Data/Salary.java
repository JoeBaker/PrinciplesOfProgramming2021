import java.text.DecimalFormat;

/** 
 * Salary class
 * This class contains all the Salary tasks following the week 14 lecture. 
 * 
 * @author Joe Baker
 * @since 2021
 */

public class Salary {

	/** 
	 * Task 1
	 * 
	 * Increases a salary by 200
	 * 
	 * @param salary
	 * @return new salary
	 */
	public int salaryIncrease(int salary) {
		return salary + 200;
	}
	
	/** 
	 * Task 2
	 * 
	 * Increases a salary by 200.50
	 * 
	 * @param salary
	 * @return new salary
	 */
	public double salaryIncrease(double salary) {
		return salary + 200.50;
	}
	
	/** 
	 * Task 3
	 * 
	 * Increases a salary by a percentage.
	 * 
	 * @param salary, increase percentage
	 * @return new salary
	 */
	public double salaryIncrease(double salary, int increasePercentage) {
		double salaryMultiplier = 1 + ((double)increasePercentage / 100);
		return salary * salaryMultiplier;
	}
	
	/** 
	 * Task 4
	 * 
	 * Calculates the tax and pension, subtracts that from their salary,
	 * and then divides by 12 to get their monthly salary.
	 * 
	 * @param gross yearly salary
	 * @return net monthly salary
	 */
	public double calculatePay(double salary) {
		final double deductables = 1 - (0.15 + 0.13);
		return (salary * deductables) / 12;
	}
	
	/**
	 * Task 5
	 * 
	 * Converts a salary from a double into a correctly formatted string
	 * with two decimal places, thousands separators, and pound sign.
	 * 
	 * @param salary as a double
	 * @return salary as a formatted string
	 */
	public String formatCurrency(double salary) {
		DecimalFormat currencyFormat = new DecimalFormat("£#,##0.00");
		return currencyFormat.format(salary);
	}

}
