import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 extends Thread {
	static volatile int findWords = 0;
	static List<String> words = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
			
		
		try (BufferedReader buffRead = new BufferedReader(new FileReader("c:\\Users\\TALI\\Desktop\\words.txt"))) {
			String line = buffRead.readLine();
			while (line != null) {
				words.add(line);
				line = buffRead.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error occured");
			Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, "Exception while close file", e);
		}

		Thread t = new Thread() {
			public void run() {
				try (BufferedReader buffRead = new BufferedReader(
						new FileReader("c:\\Users\\TALI\\Desktop\\input.txt"))) {
					String line = buffRead.readLine();
					while (line != null) {
						if (words.contains(line)) {
							System.out.println(line);
							findWords++;
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								System.out.println("Error occured");
								Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, "Interrupted exception", e);
							}
						}
						line = buffRead.readLine();
					}

				} catch (IOException e) {
					System.out.println("Error occured");
					Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, "Exception while close file", e);
				}
			}
		};
		t.start();
		System.out.println("Please enter:(i)-for interrupt or (f)-to see find words");
		String userIn = in.nextLine();	
		while(!userIn.equals("i")){
			if(userIn.equals("f")){
				System.out.println("Number of find words is: "+findWords);
			}
			System.out.println("Please enter:(i)-for interrupt or (f)-to see find words");
			userIn=in.nextLine();
		}
		if(userIn.equals("i")){
			t.interrupt();
		}
		
		
	
	}

}
