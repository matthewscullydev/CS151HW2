
/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-28-22
 * 
 * Executive class
 * 
 * <p>
 * This is the Executive class which corresponds to an executive
 * This executives computePay() method is derived from its unique attributes, yearlyBonus and yearlyCompensation.
 * This class is an extension of the Employee class.
 * 
 * </p>
 */

package Business;

public class Executive extends Employee{

	/**
	 * double attribute for yearlyBonus
	 */
	
	double yearlyBonus;
	
	/**
	 * double attribute for yearlyCompensation
	 */	
	double yearlyCompensation;
	
	public Executive() {
		// TODO Auto-generated constructor stub
		super();
	}

	public double getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	public double getYearlyCompensation() {
		return yearlyCompensation;
	}

	public void setYearlyCompensation(double yearlyCompensation) {
		this.yearlyCompensation = yearlyCompensation;
	}

	public Executive(String firstname, String lastname, Address address, int age, int id, String ssn, int pay, double bonus) {
		super(firstname, lastname, address, age, id, ssn);
		this.yearlyCompensation = pay;
		this.yearlyBonus = bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Executive [yearlyBonus=" + yearlyBonus + ", yearlyCompensation=" + yearlyCompensation + ", id=" + id
				+ ", educationLevel=" + educationLevel + ", directDeposit=" + directDeposit + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn + ", address=" + address + "]";
	}


	/**
	 * overridden toString method which takes an input parameter of boolean and if true returns the string without the ssn
	 * @param test
	 * @return
	 */
	
	public String toString(boolean test) {
		return "Executive [yearlyBonus=" + yearlyBonus + ", yearlyCompensation=" + yearlyCompensation + ", id=" + id
				+ ", educationLevel=" + educationLevel + ", directDeposit=" + directDeposit + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", address=" + address + "]";
	}

	
	/**
	 * introduce method which displays all attributes of the object except the SSN if set to false
	 * @param displaySsn ssn
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
	 * computePay method which adds the yearly compensation with the yearly bonus.
	 * @param yearlyCompensation compensation of the executive
	 * @param yearlyBonus of the executive
	 * @return
	 */
	public float computePay(double yearlyCompensation, double yearlyBonus) {
		
		
		yearlyBonus = yearlyCompensation + yearlyBonus;
		
		return (float) yearlyBonus;
	}
}
