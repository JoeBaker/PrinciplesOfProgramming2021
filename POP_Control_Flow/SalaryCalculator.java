/**
 * Salary calculator class used to explore if and loop statements
 * 
 * @author Joe Baker
 * @since 2021
 */

public class SalaryCalculator {
	
	/** 
	 * Task 1
	 * 
	 * Takes the gross salary, calculates tax rate and then subtracts it before returning it.
	 * 
	 * @param gross salary
	 * @return net salary
	 */
	public double salaryTax(double salary) {
		double taxRate;
		if (salary >= 45000) {
			taxRate = 0.5;
		}
		else if (salary >= 30000) {
			taxRate = 0.7;
		}
		else {
			taxRate = 0.85;
		}
		return salary * taxRate;
	}
	
	/** 
	 * Task 2
	 * 
	 * Takes the gross salary and a character for the NI band
	 * and will return the net salary with NI subtracted.
	 * 
	 * @param gross salary, NI band
	 * @return net salary
	 */
	public double calculateNI(double salary, char niBand) {
		double niRate = 1;
		switch (Character.toUpperCase(niBand)) {
		case 'A':
			niRate = 0.88;
			break;
		case 'B':
			niRate = 0.9415;
			break;
		case 'C':
			niRate = 0.98;
			break;
		}
		return salary * niRate;
	}
	
	/** 
	 * Task 3
	 * 
	 * Takes an array of salaries and returns the total as a single double.
	 * 
	 * @param array of salaries
	 * @return total of salaries
	 */
	public double salaryTotal(double[] salaries) {
		double total = 0;
		for (double salary : salaries) {
			total += salary;
		}
		return total;
	}
	
	/** 
	 * Task 4
	 * 
	 * Takes an array of salaries and returns the average as a single double.
	 * 
	 * @param array of salaries
	 * @return average of salaries
	 */
	public double salaryAverage(double[] salaries) {
		double total = 0;
		for (double salary : salaries) {
			total += salary;
		}
		return total / salaries.length;
	}
	
	/** 
	 * Task 5
	 * 
	 * Takes an array of salaries and returns an array with the salaries increased by 5%.
	 * 
	 * @param array of salaries
	 * @return array of new salaries
	 */
	public double[] salaryIncrease(double[] salaries) {
		for (int i = 0; i < salaries.length; i++) {
			salaries[i] *= 1.05;
		}
		return salaries;
	}

}
