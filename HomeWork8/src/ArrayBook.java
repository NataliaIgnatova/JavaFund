import java.util.Arrays;

public class ArrayBook {
	private Book[] arrayBook;
	private int size;

	public ArrayBook(int size) {
		this.arrayBook = new Book[size];
	}

	public ArrayBook() {
		this(10);
	}

	public boolean add(Book book){
		ensureCapacity(size+1);
		arrayBook[size++]=book;
		return true;
	}

	private void ensureCapacity(int minCapacity) {
		// TODO Auto-generated method stub
		int oldCapacity = arrayBook.length;
		if(minCapacity>oldCapacity){
			int newCapacity = oldCapacity*2;
			
			if(newCapacity<minCapacity){
				newCapacity=minCapacity;
			}
			arrayBook=Arrays.copyOf(arrayBook,newCapacity);
		}
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0; 
	}
	
	public Book get(int idx){
		if(idx>size){
			throw new IndexOutOfBoundsException(
                    "Index: " + idx + ", Size: " + size);
		}
		return arrayBook[idx];
	}
	
	public boolean hasElement(String isbn){
		return indexOf(isbn)>=0;
		
	}
	public int indexOf(String str){
		for(int i=0;i<size;i++){
			if(str.equals(arrayBook[i].getISBN())){
				return i;
			}
		}
		return -1;
	}
	
	@Override
    public String toString() {
        if (arrayBook == null)
            return "null";

        int iMax = arrayBook.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(arrayBook[i].getName());
            b.append(" ");
            b.append(arrayBook[i].getAuthor().getName());
            b.append(" ");
            b.append(String.valueOf(arrayBook[i].getISBN()));
            b.append(" ");
            b.append(String.valueOf(arrayBook[i].getCountOfBooks()));
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
}
