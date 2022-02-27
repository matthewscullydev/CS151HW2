package Business;

public class Address {

	@Override
	public String toString() {
		return "Address [streetnum=" + streetnum + ", streetName=" + streetName + ", city=" + city + ", zip=" + zip
				+ ", state=" + state + "]";
	}

	int streetnum;
	int streetName;
	String city;
	String zip;
	String state;
	
	Address(int streetnum, int streetName, String city, String zip, String state){
		
		setCity(city);
		setZip(zip);
		setState(state);
		setStreetName(streetName);
		setStreetNum(streetnum);
		
	}
	
	public int getStreetNum() {
		return streetnum;
	}

	public void setStreetNum(int streetnum) {
		this.streetnum = streetnum;
	}

	public int getStreetName() {
		return streetName;
	}

	public void setStreetName(int streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
