import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String last = first + "ivanov";
		
		//String second = "anton";
		//String third = new String("anton");
		//System.out.println(first);
		//System.out.println(first==second);
		//6 System.out.println(last);
		
		Scanner in = new Scanner(System.in);
		String userInput= in.nextLine();
		userInput.intern();
		String first = "anton";
		System.out.println(first==userInput);
		
	}

}
