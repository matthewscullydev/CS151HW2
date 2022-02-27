package Business;

public abstract class Person extends Address {

	
	
	Person(int streetnum, String streetName, String city, String zip, String state, String firstname, String lastname, int age, String ssn, Address address) {
		super(streetnum, streetName, city, zip, state);
		
		setFirstName(firstname);
		setLastName(lastname);
		setAddress(address);
		setAge(age);
		setSsn(ssn);
		
		
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn
				+ ", address=" + address + ", streetnum=" + streetnum + ", streetName=" + streetName + ", city=" + city
				+ ", zip=" + zip + ", state=" + state + "]";
	}


	String firstName;
	String lastName;
	int age;
	String ssn;
	Address address = new Address(streetnum, streetName, city, zip, state);
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
}
