import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter n:");
		int input = in.nextInt();
		Random rand = new Random();
		int[][] matrix;
		int sumOfDiagonals=0;
		int sumOfCols=0;
		int sumOfRows=0;
		if (input % 2 == 0) {
			System.out.println("Please enter odd n: ");
			input = in.nextInt();
		} 
		do{
			matrix = new int[input][input];
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = rand.nextInt(50) + 1;
				}
			}
			int d = matrix.length-1;
			for(int i=0;i<matrix.length;i++){
				sumOfDiagonals+=matrix[i][i];
				//System.out.println(sumOfDiagonals + " "+matrix[i][i]);
				sumOfDiagonals+=matrix[i][d];
			//	System.out.println(sumOfDiagonals + " "+matrix[i][d]);
				d--;
			}
			for(int i=0;i<matrix.length;i++){
				for(int j=0;j<matrix[0].length;j++){
					
					if(i%2==0){
						sumOfCols+=matrix[j][i];

						//System.out.println("c"+sumOfCols+" "+matrix[j][i]);
					}
					if(i%2!=0){
						sumOfRows+=matrix[i][j];
						//System.out.println("r"+sumOfRows+" "+matrix[i][j]);
					}
				}
			}

			for(int[] m:matrix){
				System.out.println(Arrays.toString(m));
			}
			System.out.println("Sum of diagonals: "+sumOfDiagonals);
			System.out.println("Sum of columns: "+sumOfCols);
			System.out.println("Sum of rows: "+sumOfRows);
			input=in.nextInt();
		}while(input%2!=0);
		

	}

}
