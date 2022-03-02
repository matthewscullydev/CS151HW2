/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-28-22
 * 
 * FullTimeSalaried class
 * 
 * <p>
 * This is the FullTimeSalaried class which corresponds to a full time salaried worker
 * this workers computePay() method is determined by the amount of weeks worked *basePay and they
 * are an extension of the FullTimeEmployee class
 * 
 * </p>
 */


package Business;

public class FullTimeSalaried extends FullTimeEmployee {


	
	public FullTimeSalaried() {
		// TODO Auto-generated constructor stub
	super();
	
	}

	public FullTimeSalaried(String firstname, String lastname, Address address, int age, int id, String ssn,
			double basePay) {
		super(firstname, lastname, address, age, id, ssn, basePay);

	}

	@Override
	public String toString() {
		return "FullTimeSalaried [basePay=" + basePay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", ssn=" + ssn + ", address=" + address + "]";
	}

	/**
	 * overridden toString method which takes an input parameter of boolean and if true returns the string without the ssn
	 * @param test
	 * @return
	 */
	
	public String toString(boolean test) {
		return "FullTimeSalaried [basePay=" + basePay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", address=" + address + "]";
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
	 * computePay method which takes in the amount of weeks and multiplies it by the basePay
	 * @param weeks
	 * @return
	 */
	public float computePay(int weeks)
	{
		basePay = basePay * weeks;
		
		return (float)basePay;
		
	}
	
}
