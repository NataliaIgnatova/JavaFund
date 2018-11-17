import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int userInput = input.nextInt();
		
		for(int i=0;i<userInput;i++){
			if(i%7==0 || i%9==0){
				System.out.println("i is: " + i);
			}else {
				if(i%7==0 && i%9==0){
					System.out.println("i is: " + i);
					break;	
				}
				
			}
			
		}
	}

}
