import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Upr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy hh:MM:ss");
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(cal.MONTH, 1);
		System.out.println(df.format(cal.getTime()));
		cal.add(cal.HOUR, 1);
		System.out.println(df.format(cal.getTime()));
		
	}

}
