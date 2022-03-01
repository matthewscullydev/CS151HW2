/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-28-22
 * 
 * Customer class
 * <p>
 * This is the Customer class which inherits the Person classes' attributes. This class has additional
 * variables for customerID and payment preference. It also has a method for returning the customers
 * preferred method of payment and introducing the customer.
 * 
 * </p>
 */


package Business;

public class Customer extends Person {

	
	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getPayPreference() {
		return payPreference;
	}


	public void setPayPreference(String payPreference) {
		this.payPreference = payPreference;
	}

	/**
	 * integer attribute for customerID
	 */
	int customerID;
	/**
	 * String attribute for payment preference
	 */
	String payPreference;
	
	
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", payPreference=" + payPreference + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn + ", address=" + address;
			
	}
	
	/**
	 * overridden toString method which takes an input parameter of boolean and if true returns the string without the ssn
	 * @param test
	 * @return
	 */

	public String toString(boolean test) {
		return "Customer [customerID=" + customerID + ", payPreference=" + payPreference + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", address=" + address;
			
	}
	
	/**
	 * introduce method which displays all attributes of the object except the SSN.
	 * 
	 */
	public void introduce()
	
	{
			boolean noSsn = true;
			String intro = toString(noSsn);
			
			System.out.println(intro);
		
	}
	
	/**
	 * makePayment method which returns payment preference of user.
	 */
	
	public void makePayment(){
		
			System.out.println("Payment method = " + this.payPreference);
		
	}

	public Customer()
	{
		super();
		
	}
	
	
	public Customer(String firstName, String lastName, Address address, int customerID, int age, String ssn, String payPreference) {	
		super(firstName,lastName,age,ssn, address);
		// TODO Auto-generated constructor stub

		this.customerID = customerID;
		this.payPreference = payPreference;

	}

		
		
	}


