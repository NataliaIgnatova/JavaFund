
public class BookStore {
	private String name;
	private String address;
	private ArrayBook storage;
	
	public BookStore(){
		
	}
	
	public BookStore(String name, String address, ArrayBook storage) {
		super();
		this.name = name;
		this.address = address;
		this.storage = storage;
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

	public ArrayBook getStorage() {
		return storage;
	}

	public void setStorage(ArrayBook storage) {
		this.storage = storage;
	}
	
	public boolean hasBook(String ISBN){
		if(storage.hasElement(ISBN)){
			return true;
		}
		return false;
	}
	public boolean sellBook(String ISBN,int number){
		if(storage.hasElement(ISBN)){
			storage.get(storage.indexOf(ISBN)).setCountOfBooks(storage.get(storage.indexOf(ISBN)).getCountOfBooks()-number);
			return true;
		}
		return false;
	}
	
	public boolean buyBook(String ISBN,int number){
		if(storage.hasElement(ISBN)){
			storage.get(storage.indexOf(ISBN)).setCountOfBooks(storage.get(storage.indexOf(ISBN)).getCountOfBooks()+number);
		return true;
		}
		return false;
	}
	
}
