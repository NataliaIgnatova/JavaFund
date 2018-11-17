import java.text.SimpleDateFormat;
import java.util.Date;

public class SecondTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String test ="test";
		
		for(char c:test.toCharArray()){
			System.out.print("-"+c+"-");
			System.out.print((int) c);
		}
		System.out.println(" ");
		Date today = new Date();
		Thread.currentThread().sleep(4000);
		Date newtoday = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
		System.out.println(sdf.format(today));
		System.out.println(sdf.format(newtoday));
		if(today.after(newtoday)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}

}
