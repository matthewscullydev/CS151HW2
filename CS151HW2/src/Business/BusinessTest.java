package Business;

public class BusinessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address(2, "sad", "sada","ds", "asd");
		//create subclass of Person
		Customer c = new Customer("fdasf ", " esfa ", a, 32, 23, " yes", "ad");
		
		c.introduce();
		String s = c.toString();
		System.out.println(s);
	}

}
