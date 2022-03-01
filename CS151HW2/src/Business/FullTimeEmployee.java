/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-28-22
 * 
 * FullTimeEmployee class
 * 
 * <p>
 * This is the FullTimeEmployee class which is an abstract class that is an extension of Employee
 * it has a baseP
 * 
 * </p>
 */

package Business;

public abstract class FullTimeEmployee extends Employee {

	//vars
	/**
	 * double attribute for basePay
	 */
	double basePay;
	
	public FullTimeEmployee() {
		// TODO Auto-generated constructor stub
		super();
		
	}

	public FullTimeEmployee(String firstname, String lastname, Address address, int age, int id, String ssn, double basePay) {
		super(firstname, lastname, address, age, id, ssn);
		this.basePay = basePay;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [basePay=" + basePay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", ssn=" + ssn + ", address=" + address + "]";
	}

	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	
	
	
	
	
}
