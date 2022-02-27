package Business;

public abstract class Employee extends Person{

	int id;
	String educationLevel;
	boolean directDeposit;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Employee(String firstname, String lastname,Address address, int age, int id, String ssn) {
		super(firstname, lastname, age, ssn, address);
		this.id = id;
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public boolean isDirectDeposit() {
		return directDeposit;
	}

	public void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}


}
