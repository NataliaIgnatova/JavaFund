
public class Book {
	private String name;
	private Author author;
	private String ISBN;
	private int countOfBooks;
	public Book(String name, Author author, String iSBN, int countOfBooks) {
		super();
		this.name = name;
		this.author = author;
		ISBN = iSBN;
		this.countOfBooks = countOfBooks;
	}
	public Book(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getCountOfBooks() {
		return countOfBooks;
	}
	public void setCountOfBooks(int countOfBooks) {
		this.countOfBooks = countOfBooks;
	}
	

}
