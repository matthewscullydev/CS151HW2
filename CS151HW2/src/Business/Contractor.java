/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-28-22
 * 
 * Contractor class
 * <p>
 * This is a class which inherits the Employee class and its corresponding attributes.
 * this class
 * 
 * </p>
 */


package Business;

public class Contractor extends Employee {


	/**
	 * double attribute
	 */
	
	double basePay;
	
	public Contractor() {
		// TODO Auto-generated constructor stub
	super();
	
	}

	public Contractor(String firstname, String lastname, Address address, int age, int id, String ssn, double basePay) {
		super(firstname, lastname, address, age, id, ssn);
		this.basePay = basePay;
		// TODO Auto-generated constructor stub
	}

	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	@Override
	public String toString() {
		return "Contractor [basePay=" + basePay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", ssn=" + ssn + ", address=" + address + "]";
	}

	/**
	 * overridden toString method which takes an input parameter of boolean and if true returns the string without the ssn
	 * @param test
	 * @return
	 */
	
	public String toString(boolean test) {
		return "Contractor [basePay=" + basePay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", address=" + address + "]";
	}

	/**
	 * computePay method which multiplies the hours by the base pay for every contractor.
	 * @param basePay
	 * @param hours
	 * @return
	 */
	
	public float computePay(int basePay, int hours)
	{
		basePay = hours*basePay;
		
		return basePay;
		
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

}
