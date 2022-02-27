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


	int customerID;
	String payPreference;
	
	
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", payPreference=" + payPreference + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn + ", address=" + address + ", streetnum="
				+ streetnum + ", streetName=" + streetName + ", city=" + city + ", zip=" + zip + ", state=" + state
				+ "]";
	}

	public void introduce()
	
	{
		System.out.println("sup");
		
	}
	
	public void makePayment(){
		
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


