package Business;

public class FullTimeSalaried extends FullTimeEmployee {


	
	public FullTimeSalaried() {
		// TODO Auto-generated constructor stub
	super();
	
	}

	public FullTimeSalaried(String firstname, String lastname, Address address, int age, int id, String ssn,
			double basePay) {
		super(firstname, lastname, address, age, id, ssn, basePay);
		this.basePay = basePay;
	}

	@Override
	public String toString() {
		return "FullTimeSalaried [basePay=" + basePay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", ssn=" + ssn + ", address=" + address + "]";
	}


	public String toString(boolean test) {
		return "FullTimeSalaried [basePay=" + basePay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", address=" + address + "]";
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

	public float computePay(int weeks)
	{
		basePay = basePay * weeks;
		
		return (float)basePay;
		
	}
	
}
