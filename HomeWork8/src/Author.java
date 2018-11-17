
public class Author {
	private String name;
	private String address;
	private String number;
	public Author(String name, String address, String number) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public Author(){
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
