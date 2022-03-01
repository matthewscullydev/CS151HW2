/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-28-22
 * 
 * Business class
 * <p>
 * This is the class used for testing the functional business. In this class we create 4 addresses
 * and we create 2 of each type of object and invoke their methods. 
 * 
 * </p>
 */

package Business;



public class BusinessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//addresses
		Address firstAdd = new Address(2403, "Marriot Lane", "San Jose","95122", "California");
		Address secondAdd = new Address(4238, "Bech Ave", "Chicago","32481", "Illinois");
		Address thirdAdd = new Address(3257, "Beach Walk Dr", "Santa Cruz","95332", "California");
		Address fourthAdd = new Address(4238, "Fuller St", "Norwich","05055", "Vermont");
		//customers
		Customer customer1 = new Customer("Paul", " Walker ", firstAdd, 32156, 23, "123428664", "Debit Card");
		Customer customer2 = new Customer("James", "Johnson", secondAdd, 53274, 20, "122114664", "Credit Card");
		
		System.out.println("Customer 1:");
		customer1.introduce();
		customer1.makePayment();
		System.out.println();
		System.out.println("Customer 2:");
		customer2.introduce();
		customer2.makePayment();
		System.out.println();
		
		Executive executive1 = new Executive("Dane","Mitchell", thirdAdd, 24, 32140, "329669821", 20000, 20000);
		Executive executive2 = new Executive("Josh","Slayer", thirdAdd, 29, 41190, "321669821", 120000, 20000);
		
		System.out.println("Executive 1:");
		float salary = executive1.computePay(executive1.yearlyCompensation, executive1.yearlyBonus);
		executive1.introduce(false);
		System.out.println("Salary = " + salary);
		
		System.out.println();
		
		System.out.println("Executive 2:");
		executive2.introduce(false);
		float salary2 = executive2.computePay(executive2.yearlyCompensation, executive2.yearlyBonus);
		System.out.println("Salary = " + salary2);
		
		System.out.println();
		
		FullTimeSalaried fts1 = new FullTimeSalaried("Dane","Doe", thirdAdd, 24, 32140, "329669821", 80000); 
		FullTimeSalaried fts2 = new FullTimeSalaried("Jake","Duncer", fourthAdd, 29, 12340, "124669821", 40000);
		
		System.out.println("Full Time Salaried 1:");
		fts1.introduce(false);
		float salary3 = fts1.computePay(5);
		System.out.println("Salary = " + salary3);
		
		System.out.println();
		
		System.out.println("Full Time Salaried 2:");
		fts2.introduce(false);
		float salary4 = fts2.computePay(7);
		System.out.println("Salary = " + salary4);
		
		PartTimeHourly pth1 = new PartTimeHourly("Mitch","Moe", thirdAdd, 24, 88140, "132478821", 50.25);
		PartTimeHourly pth2 = new PartTimeHourly("Nate","Cage", secondAdd, 32, 57290, "098765821", 25.50);
		
		System.out.println();
		
		System.out.println("Part Time Salaried 1:");
		pth1.introduce(false);
		float salary5 = pth1.computePay(5);
		System.out.println("Salary = " + salary5);
		
		System.out.println();
		
		System.out.println("Part Time Salaried 2:");
		pth2.introduce(false);
		float salary6 = pth2.computePay(7);
		System.out.println("Salary = " + salary6);
		
		//full time hourly employees, first test is when there is no overtime pay second test is with
		FullTimeHourly fth1 = new FullTimeHourly("Mitch","Moe", thirdAdd, 24, 88140, "132478821", 50.25, 0);
		FullTimeHourly fth2 = new FullTimeHourly("Nate","Cage", secondAdd, 32, 57290, "098765821", 25.50, 500);
		
		System.out.println();
		
		System.out.println("Full Time Hourly 1:");
		fth1.introduce(false);
		float salary8 = fth1.computePay(40);
		System.out.println("Salary = " + salary8);
		
		System.out.println();
		
		System.out.println("Full Time Hourly 2:");
		fth2.introduce(false);
		float salary9 = fth2.computePay(34);
		System.out.println("Salary = " + salary9);
		
		Contractor contrac1 = new Contractor("Mitch","Moe", firstAdd, 24, 88140, "132478821", 50.25);
		Contractor contrac2 = new Contractor("Mitch","Moe", thirdAdd, 24, 88140, "132478821", 27.25);
		
		System.out.println();
		
		System.out.println("Contractor 1:");
		contrac1.introduce(false);
		float salary10 = fth1.computePay(40);
		System.out.println("Salary = " + salary10);
		
		System.out.println();
		
		System.out.println("Contractor 2:");
		contrac2.introduce(false);
		float salary11 = fth2.computePay(34);
		System.out.println("Salary = " + salary11);
		
		
	}

}
