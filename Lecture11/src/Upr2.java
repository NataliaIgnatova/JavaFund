import java.util.Scanner;
import java.util.regex.Pattern;

public class Upr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String email = in.nextLine();
		String pattern = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
		boolean matches = Pattern.matches(pattern, email);
		if(matches){
			System.out.println(email.replace("@", "$"));
			System.out.println(email.replaceAll("com", "COM"));
			System.out.println(email.substring(email.lastIndexOf("@")+1, email.length()));
		}
		}

}
