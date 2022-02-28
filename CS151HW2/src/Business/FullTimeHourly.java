package Business;

public class FullTimeHourly extends FullTimeEmployee {

	//instance variables
	
	double overtimePay;
	
	public FullTimeHourly() {
		// TODO Auto-generated constructor stub
		super();
		
	}



	public FullTimeHourly(String firstname, String lastname, Address address, int age, int id, String ssn,
			double basePay) {
		super(firstname, lastname, address, age, id, ssn, basePay);
		this.overtimePay = overtimePay;
		this.basePay = basePay;
	}



	public double getOvertimePay() {
		return overtimePay;
	}

	public void setOvertimePay(double overtimePay) {
		this.overtimePay = overtimePay;
	}

	@Override
	public String toString() {
		return "FullTimeHourly [overtimePay=" + overtimePay + ", id=" + id + ", educationLevel=" + educationLevel
				+ ", directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", ssn=" + ssn + ", address=" + address + "]";
	}

	public String toString(boolean test) {
		return "FullTimeHourly [overtimePay=" + overtimePay + ", id=" + id + ", educationLevel=" + educationLevel
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
		

			basePay = hours*basePay;
			
			if (overtimePay > 0)
			{
				basePay = basePay + overtimePay;
			}
	
		return (float) basePay;
	}
}
