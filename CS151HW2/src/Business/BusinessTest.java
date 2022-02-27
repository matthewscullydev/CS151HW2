package Business;

public class BusinessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address(2, "sad", "sada","ds", "asd");
		//create subclass of Person
		Customer c = new Customer(a.streetnum, a.streetName, a.city,a.zip, a.state, "Matt", "Scully", 21 , "732429844", a, 123, "ye");
		
		c.introduce();
		String s = c.toString();
		System.out.println(s);
	}

}
