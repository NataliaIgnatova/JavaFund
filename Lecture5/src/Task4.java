import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a note:");
		String note = input.next();
		switch (note.toUpperCase()) {
		case "A":
			System.out.println("6");
			break;
		case "B":
			System.out.println("5");
			break;
		case "C":
			System.out.println("4");
			break;
		case "D":
			System.out.println("3");
			break;
		case "F":
			System.out.println("2");
			break;
		default:
			System.out.println("Invalid grade!");
		}
	}

}
