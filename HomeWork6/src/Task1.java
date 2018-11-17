import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = in.nextInt();
		while (number < 3) {
			System.out.println("Please, enter number bigger than 2!");
			number = in.nextInt();
		}
		// for(int j=number;j>=0;j--){
		for (int j = 0; j < number; j++) {
			for (int i = 1; i < 3*number; i++) {
				if(i<=number){
				System.out.print("*");
				}else{
					if(i>number && i<=2*number){
						System.out.print(" ");
					}else {
						if(i>2*number && i<3*number){
							if(j==0 || j==number-1 || i==2*number+1){
							System.out.print("*");
							}else{
								System.out.print("+");
							}
						}
					}
				}
				
			}
			System.out.println("*");
		}
		
	}

}
