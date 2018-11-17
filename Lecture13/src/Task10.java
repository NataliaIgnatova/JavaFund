import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String next = in.nextLine();
		String secondDate1 = in.nextLine();
		String secondDate2 = in.nextLine();
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		try {
			Date date1 = df.parse(input);
			Date date2 = df.parse(next);
			Date date3 = df.parse(secondDate1);
			Date date4 = df.parse(secondDate2);
			if((date1.before(date2) && date2.before(date3) && date3.before(date4)) || (date3.before(date4) && date1.before(date2) && date4.before(date1))){
				System.out.println("Doesn`t have intersection");
			}else{
				System.out.println("Have intersection");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
