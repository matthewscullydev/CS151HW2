/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-28-22
 * 
 * PartTimeHourly class
 * 
 * <p>
 * This is the PartTimeHourly class which corresponds to a part time employee
 * This employee's computePay() method is derived from its attributes of baseHourly pay multiplied by the hours worked.
 * This class is an extension of the Employee class.
 * 
 * </p>
 */

package Business;

public class PartTimeHourly extends Employee {

	//instance variables
	
	double baseHourlyPay;
	
	public PartTimeHourly() {
		// TODO Auto-generated constructor stub
		super();
		
	}

	public PartTimeHourly(String firstname, String lastname, Address address, int age, int id, String ssn, double baseHourlyPay) {
		super(firstname, lastname, address, age, id, ssn);
		this.baseHourlyPay = baseHourlyPay;
		// TODO Auto-generated constructor stub
	}
	
	public double getBaseHourlyPay() {
		return baseHourlyPay;
	}

	public void setBaseHourlyPay(double baseHourlyPay) {
		this.baseHourlyPay = baseHourlyPay;
	}


	@Override
	public String toString() {
		return "PartTimeHourly [baseHourlyPay=" + baseHourlyPay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", ssn=" + ssn + ", address=" + address + "]";
	}

	/**
	 * overridden toString method which takes an input parameter of boolean and if true returns the string without the ssn
	 * @param test
	 * @return
	 */	
	
	public String toString(boolean test) {
		return "PartTimeHourly [baseHourlyPay=" + baseHourlyPay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", address=" + address + "]";
	}
	
	/**
	 * introduce method which displays all attributes of the object except the SSN if set to false
	 * 
	 */
	
	public void introduce(boolean displaySsn){
		
		if(!displaySsn)
		{
			boolean test = true;
			String returnString = toString(test);
			System.out.println(returnString);
		}
		
		else
		{
			String returnString = toString();
			System.out.println(returnString);
		}
	}

	

	/**
	 * computePay method which multiplies the hours by the base pay for every part time employee.
	 * if the hours exceed 40 the method returns -1.
	 * @param basePay
	 * @param hours
	 * @return
	 */
	
	public float computePay(int hours) {
		
		if (hours > 40)
		{
			return -1;
		}
		
		else
		{
			baseHourlyPay = hours*baseHourlyPay;
		}
		
		return (float) baseHourlyPay;
	}
}
