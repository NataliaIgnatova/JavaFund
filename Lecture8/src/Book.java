
public class Book {
	
	private static int bookCount;
	int bookId;
	String name;
	String author;
	double price;

	public Book(int bookId, String name, String author, double price) {
		/*this.bookId = bookId;
		this.name = name;*/
		this(bookId,name);//извикване на конструктор с два параметъра
		this.author = author;
		this.price = price;
		bookCount++;
	}
	public Book(int id,String name){
		this.bookId=id;
		this.name=name;
		bookCount++;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "The name of the book is: " + this.name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(1, "Java 1", "Author", 9.99);
		book1.author="Ivan";//only in this package, in other package can`t do this
		book1.name="Java 2";
		Book book2 = new Book(2, "Angular 5", "James", 12.99);
		System.out.println(book1);
		System.out.println(book2);
		
	}

}
