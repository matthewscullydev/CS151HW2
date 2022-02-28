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
		System.out.println(salary);
		
		System.out.println();
		
		System.out.println("Executive 2:");
		executive2.introduce(false);
		float salary2 = executive2.computePay(executive2.yearlyCompensation, executive2.yearlyBonus);
		System.out.println(salary2);
		
		System.out.println();
		
		FullTimeSalaried fts1 = new FullTimeSalaried("Dane","Doe", thirdAdd, 24, 32140, "329669821", 20000); 
		FullTimeSalaried fts2 = new FullTimeSalaried("Jake","Duncer", fourthAdd, 29, 12340, "124669821", 40000);
		
		System.out.println("Full Time Salaried 1:");
		fts1.introduce(false);
		float salary3 = fts1.computePay(5);
		System.out.println(salary3);
		
		System.out.println();
		
		System.out.println("Full Time Salaried 2:");
		fts2.introduce(false);
		float salary4 = fts2.computePay(7);
		System.out.println(salary4);
		
		PartTimeHourly pth1 = new PartTimeHourly("Mitch","Moe", thirdAdd, 24, 88140, "132478821", 50.25);
		PartTimeHourly pth2 = new PartTimeHourly("Nate","Cage", secondAdd, 32, 57290, "098765821", 25.50);
		
		System.out.println();
		
		System.out.println("Part Time Salaried 1:");
		pth1.introduce(false);
		float salary5 = pth1.computePay(5);
		System.out.println(salary5);
		
		System.out.println();
		
		System.out.println("Part Time Salaried 2:");
		pth2.introduce(false);
		float salary6 = pth2.computePay(7);
		System.out.println(salary6);
	}

}
