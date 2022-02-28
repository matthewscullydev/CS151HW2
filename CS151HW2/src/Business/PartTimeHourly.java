package Business;

public class PartTimeHourly extends Employee {

	//instance variables
	
	double baseHourlyPay;
	
	public PartTimeHourly() {
		// TODO Auto-generated constructor stub
		super();
		
	}

	public PartTimeHourly(String firstname, String lastname, Address address, int age, int id, String ssn, double baseHourlyPay) {
		super(firstname, lastname, address, age, id, ssn);
		this.baseHourlyPay = baseHourlyPay;
		// TODO Auto-generated constructor stub
	}
	
	public double getBaseHourlyPay() {
		return baseHourlyPay;
	}

	public void setBaseHourlyPay(double baseHourlyPay) {
		this.baseHourlyPay = baseHourlyPay;
	}


	@Override
	public String toString() {
		return "PartTimeHourly [baseHourlyPay=" + baseHourlyPay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", ssn=" + ssn + ", address=" + address + "]";
	}

	public String toString(boolean test) {
		return "PartTimeHourly [baseHourlyPay=" + baseHourlyPay + ", id=" + id + ", educationLevel=" + educationLevel
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

	public float computePay(int hours) {
		
		if (hours > 40)
		{
			return -1;
		}
		
		else
		{
			baseHourlyPay = hours*baseHourlyPay;
		}
		
		return (float) baseHourlyPay;
	}
}
