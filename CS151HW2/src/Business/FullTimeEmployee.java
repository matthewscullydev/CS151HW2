package Business;

public abstract class FullTimeEmployee extends Employee {

	//vars
	
	double basePay;
	
	public FullTimeEmployee() {
		// TODO Auto-generated constructor stub
		super();
		
	}

	public FullTimeEmployee(String firstname, String lastname, Address address, int age, int id, String ssn, double basePay) {
		super(firstname, lastname, address, age, id, ssn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [basePay=" + basePay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", ssn=" + ssn + ", address=" + address + ", streetnum=" + streetnum + ", streetName="
				+ streetName + ", city=" + city + ", zip=" + zip + ", state=" + state + "]";
	}

	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	
	
	
	
	
}
