import java.io.IOException;
import java.io.InputStream;

public class task1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter text: ");
//		int ch;
//		while ((ch = System.in.read()) != '\n') {
//			System.out.print((char) ch);
//
//		}
		String next = nextLine(System.in);
		System.out.println(next);
	}
	public static String nextLine(InputStream is) throws IOException{
		String res="";
		int ch;
		while ((ch = is.read()) != '\n') {
			//System.out.print((char) ch);
			res = res+(char)ch;
		}
		return res;
	}

}
