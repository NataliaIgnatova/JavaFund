import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		System.out.println(df.format(cal.getTime()));
		cal.add(cal.MONTH, 14);//добавя четиринадесет години
		cal.add(cal.MONTH, -14);//вади четиринадесет години
		cal.add(cal.MINUTE, 10);//добавя минути 
		
	}

}
