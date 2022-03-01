/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-28-22
 * 
 * Employee class
 * 
 * <p>
 * This is the abstract Employee class which corresponds to an average Employee
 * This class is an extension of the Person class and contains attributes corresponding to id, education level, and direct deposit.
 * </p>
 */

package Business;

public abstract class Employee extends Person{
	/**
	 * integer attribute for id
	 */
	int id;
	/**
	 * String attribute for education level
	 * NOTE: THIS ATTRIBUTE WAS NOT ASSIGNED AS I DID NOT SEE IT IN THE UML DIAGRAM
	 */
	String educationLevel;
	/**
	 * boolean attribute for direct deposit
	 * NOTE: THIS ATTRIBUTE WAS NOT ASSIGNED AS I DID NOT SEE IT IN THE UML DIAGRAM
	 */
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
