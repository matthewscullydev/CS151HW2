package Business;

public class Executive extends Employee{

	double yearlyBonus;
	double yearlyCompensation;
	
	public Executive() {
		// TODO Auto-generated constructor stub
		super();
	}

	public double getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	public double getYearlyCompensation() {
		return yearlyCompensation;
	}

	public void setYearlyCompensation(double yearlyCompensation) {
		this.yearlyCompensation = yearlyCompensation;
	}

	public Executive(String firstname, String lastname, Address address, int age, int id, String ssn, int pay, double bonus) {
		super(firstname, lastname, address, age, id, ssn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Executive [yearlyBonus=" + yearlyBonus + ", yearlyCompensation=" + yearlyCompensation + ", id=" + id
				+ ", educationLevel=" + educationLevel + ", directDeposit=" + directDeposit + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn + ", address=" + address + ", streetnum="
				+ streetnum + ", streetName=" + streetName + ", city=" + city + ", zip=" + zip + ", state=" + state
				+ "]";
	}


	public String toString(boolean test) {
		return "Executive [yearlyBonus=" + yearlyBonus + ", yearlyCompensation=" + yearlyCompensation + ", id=" + id
				+ ", educationLevel=" + educationLevel + ", directDeposit=" + directDeposit + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", address=" + address + ", streetnum="
				+ streetnum + ", streetName=" + streetName + ", city=" + city + ", zip=" + zip + ", state=" + state
				+ "]";
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
	
	public float computePay() {
		
		
		return (float) yearlyBonus;
	}
}
