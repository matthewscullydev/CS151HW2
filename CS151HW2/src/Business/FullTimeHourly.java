/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-28-22
 * 
 * FullTimeHourly class
 * 
 * <p>
 * This is the FullTimeHourly class which corresponds to a full time hourly worker
 * this workers computePay() method is determined by the amount of hours*basePay and they
 * are given an attribute of overtimePay which is factored into the computePay method.
 * 
 * This class is an extension of the FullTimeEmployee class.
 * </p>
 */


package Business;

public class FullTimeHourly extends FullTimeEmployee {

	//instance variables
	/**
	 * double attribute for overtime pay
	 */
	double overtimePay;
	
	public FullTimeHourly() {
		// TODO Auto-generated constructor stub
		super();
		
	}



	public FullTimeHourly(String firstname, String lastname, Address address, int age, int id, String ssn,
			double basePay, double overtimePay) {
		super(firstname, lastname, address, age, id, ssn, basePay);
		this.overtimePay = overtimePay;

	}



	public double getOvertimePay() {
		return overtimePay;
	}

	public void setOvertimePay(double overtimePay) {
		this.overtimePay = overtimePay;
	}

	@Override
	public String toString() {
		return "FullTimeHourly [overtimePay=" + overtimePay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", ssn=" + ssn + ", address=" + address + "]";
	}
	
	/**
	 * overridden toString method which takes an input parameter of boolean and if true returns the string without the ssn
	 * @param test
	 * @return
	 */
	
	public String toString(boolean test) {
		return "FullTimeHourly [overtimePay=" + overtimePay + ", id=" + id + ", educationLevel=" + educationLevel
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
	 * full time hourly employee compute pay method which multiplies basePay by number of hours worked.
	 * it also adds the overtime pay is the overtime pay variable is greater than 0.
	 *
	 * @param hours
	 * @return
	 */
	
	public float computePay(int hours) {
		

			basePay = hours*basePay;
			
			if (overtimePay > 0)
			{
				basePay = basePay + overtimePay;
			}
	
		return (float) basePay;
	}
}
