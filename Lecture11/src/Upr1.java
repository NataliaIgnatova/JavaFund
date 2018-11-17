import java.util.Scanner;

public class Upr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String userIn1= in.nextLine();
		String userIn2 = in.nextLine();
		System.out.println(userIn1+" "+userIn2);

		System.out.println(userIn1.concat(" ").concat(userIn2));
		StringBuilder stringBuilder = new StringBuilder(userIn1);
		stringBuilder.append(" ");
		stringBuilder.append(userIn2);
		System.out.println(stringBuilder);
	}

}
