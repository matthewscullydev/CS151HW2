package Business;

public class Contractor extends Employee {

	//instance variables
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

	public String toString(boolean test) {
		return "Contractor [basePay=" + basePay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", address=" + address + "]";
	}

	
	
	public float computePay(int basePay, int hours)
	{
		basePay = hours*basePay;
		
		return basePay;
		
	}
	
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
