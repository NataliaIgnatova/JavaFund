
public class BookStoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1 = new Author("A1","ss","123");
		Author a2 = new Author("A2","sss","1234");
		Author a3 = new Author("A3","ssss","12345");
		
		Book b1 = new Book("B1",a1,"ss",3);
		Book b2 = new Book("B2",a2,"ssss",1);
		Book b3 = new Book("B3",a3,"sss",5);
		
		ArrayBook arrBook = new ArrayBook(3);
		BookStore bookStore = new BookStore("bookstore","address",arrBook);
		arrBook.add(b1);
		arrBook.add(b2);
		arrBook.add(b3);
		System.out.println(arrBook.toString());
		bookStore.buyBook("ss", 2);
		bookStore.buyBook("ssss", 10);
		bookStore.sellBook("sss", 2);
		System.out.println(arrBook.toString());
	}

}
