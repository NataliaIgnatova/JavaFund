import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java,most,popular,programming,language";
		String[] searchWords = str.split(",");
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string:");
		String userIn = in.nextLine();
		int count = 0;
		for (String s : searchWords) {
			Pattern pat = Pattern.compile(s);
			Matcher matcher = pat.matcher(userIn.toLowerCase());
			while (matcher.find()) {
				count++;
			}
			System.out.println(s + ":" + count);
			count = 0;
		}
	}

}
