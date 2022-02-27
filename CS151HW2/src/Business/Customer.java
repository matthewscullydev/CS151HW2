package Business;
import java.lang.*;
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


	int customerID;
	String payPreference;
	
	
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", payPreference=" + payPreference + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn + ", address=" + address;
			
	}
	


	public String toString(boolean test) {
		return "Customer [customerID=" + customerID + ", payPreference=" + payPreference + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", address=" + address;
			
	}
	
	
	public void introduce()
	
	{
			boolean noSsn = true;
			String intro = toString(noSsn);
			
			System.out.println(intro);
		
	}
	
	public void makePayment(){
		
			System.out.println(this.payPreference);
		
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


