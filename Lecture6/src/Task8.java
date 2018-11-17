import java.util.Scanner;

public class Task8 {
	private static int x;
	private static int n;

	public static double Equation(){
		int fact=1;
		double S = 0;
		for(int i=1;i<=n;i++){
			fact=fact*i;
			//System.out.println(fact);
			S+= fact/Math.pow(x,i);
			/*System.out.println(Math.pow(x,i));
			System.out.println(S);*/
		}
		return S;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter x: ");
		x = in.nextInt();
		System.out.println("Please enter n: ");
		n = in.nextInt();
		Task8 t = new Task8();
		double S = t.Equation();
		System.out.println("S= " + S);

	}

}
