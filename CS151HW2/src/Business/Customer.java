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


	public Customer(int streetnum, String streetName, String city, String zip, String state, String firstname,
			String lastname, int age, String ssn, Address address, int customerID, String payPreference) {
		super(streetnum, streetName, city, zip, state, firstname, lastname, age, ssn, address);
		// TODO Auto-generated constructor stub
		setCustomerID(customerID);
		setPayPreference(payPreference);
		
		
	}

		
		
	}


