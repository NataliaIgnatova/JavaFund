
public class Book implements Comparable<Book>{
	
	private int id;
	private String name;
	private String isbn;
	
	public Book(){
		
	}
	
	public Book(int id, String name, String isbn){
		this.id = id;
		this.name = name;
		this.isbn = isbn;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}

	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	
	public String getIsbn(){
		return this.isbn;
	}
	
	public String toString(){
		return "Name of book is: "+this.name+" ,isbn is: "+this.isbn+", id is: "+this.id;
	}

	@Override
	public int compareTo(Book arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
