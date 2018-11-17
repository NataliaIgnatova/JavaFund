import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input;
		int[] inputArr=new int[6];
		int[] randArr=new int[6];
		Random rand = new Random();
		int count=0;
		
		do{
			for(int i=0;i<randArr.length;i++){
				randArr[i]=rand.nextInt(50)+1;
			}
			
			for(int i=0;i<randArr.length-1;i++){
				if(randArr[i]==randArr[i+1]){
					randArr[i+1]=rand.nextInt(50)+1;
				}
			}
			for(int i=0;i<inputArr.length;i++){
				System.out.println("Please enter number:");
				inputArr[i]=in.nextInt();	
			}

			for(int i=0;i<inputArr.length;i++){
				if(inputArr[i]==randArr[i]){
					count++;
				}
			}
			System.out.println(Arrays.toString(inputArr));

			System.out.println(Arrays.toString(randArr));

			System.out.println(count);
			System.out.println("If you want to play again enter p and if you want to quit enter e");
			input=in.next();
		}while(input.equals("p"));
	}

}
