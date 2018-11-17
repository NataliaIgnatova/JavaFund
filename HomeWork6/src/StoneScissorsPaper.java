import java.util.Random;
import java.util.Scanner;

public class StoneScissorsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int comp = 0;
		int user = 0;
		int eq = 0;
		String userIn = " ";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter K,N or H: ");
		userIn = in.next();
		while (!userIn.equals("y")) {
			Random rand = new Random();
			String str = "KNH";
			char c = str.charAt(rand.nextInt(str.length()));

			if (userIn.equals("K") && c == 'N' || userIn.equals("N") && c == 'H' || userIn.equals("H") && c == 'K') {
				System.out.println("User win!");
				user++;
			} else {
				if (userIn.equals("K") && c == 'H' || userIn.equals("H") && c == 'N'
						|| userIn.equals("N") && c == 'K') {
					System.out.println("Computer win!");
					comp++;
				} else {
					if (userIn.equals("K") && c == 'K' || userIn.equals("N") && c == 'N'
							|| userIn.equals("H") && c == 'H') {
						System.out.println("Equal!");
						eq++;
					}
				}
			}
			System.out.println("Please enter K,N or H: ");
			userIn = in.next();
		}
		int count = user + comp + eq;
		System.out.println("Статистика: ");
		System.out.println("Брой игри: " + count);
		System.out.println("Победи на потребителя: " + user);
		System.out.println("Загуби на потребителя: " + comp);
		System.out.println("Равни: " + eq);
	}

}
