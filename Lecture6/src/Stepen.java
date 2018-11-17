import java.util.Scanner;

public class Stepen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter base: ");
		int base = in.nextInt();
		System.out.println("Please enter stepen: ");
		int stepen = in.nextInt();
		int res=1;
		for(int i=stepen;i>0;i--){
			res*= base;
		}
		System.out.println(res);
	}

}
