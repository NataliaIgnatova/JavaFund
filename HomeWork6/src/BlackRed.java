import java.util.Random;
import java.util.Scanner;

public class BlackRed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int userIn = in.nextInt();
		int wins = 0;
		int loses = 0;
		int account = userIn;
		int start=account;
		System.out.println("Please enter if your want to exit(e), statistics(s),or to see account(a) or play(p)");
		String user = in.next();
		while (!user.equals("e")) {
			if (user.equals("s")) {
				System.out.println("Statistics: ");
				System.out.println("Wins: " + wins);
				System.out.println("Loses: " + loses);

			} else {
				if (user.equals("a")) {
					System.out.println("Account: " + account);
				} else {
					if (user.equals("p")) {
						System.out.println("How much you want to gamble? ");
						int pay = in.nextInt();
						if (pay > userIn || pay < 1) {
							System.out.println("You can`t gamble this type of money!");
						} else {
							System.out.println("Please enter red(r) or black(b)?");
							String redBlack= in.next();
							Random rand = new Random();
							String str = "rb";
							char c = str.charAt(rand.nextInt(str.length()));
							System.out.println(c);
							if(redBlack.charAt(0)==c){
								
								account=account+pay;
								wins++;
								System.out.println("You won!");
							}else{
								account=account-pay;
								loses++;
								System.out.println("You lose!");
							}
							
						}

					}
				}
			}
			
			if(account==0){
				System.out.println("Bankrut!");
				System.out.println("Statistics: ");
				System.out.println("Wins: " + wins);
				System.out.println("Loses: " + loses);
				break;
			}
			
			System.out.println("Please enter if your want to exit(e), statistics(s),or to see account(a) or play(p)");
			user = in.next();
		}
		
		if(user.equals("e")){
			System.out.println("Statistics: ");
			System.out.println("Wins: " + wins);
			System.out.println("Loses: " + loses);
			System.out.println("You were in with:" + start);
			System.out.println("Now you are with:" + account);
			
		}

	}

}
