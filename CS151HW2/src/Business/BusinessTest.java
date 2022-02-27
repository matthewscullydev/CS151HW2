package Business;

public class BusinessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address(2403, "Marriot Lane", "San Jose","95122", "California");
		//create subclass of Person
		Customer c = new Customer("Paul", " Walker ", a, 32156, 23, "123428664", "Debit Card");
		
		c.introduce();
		c.makePayment();

	}

}
