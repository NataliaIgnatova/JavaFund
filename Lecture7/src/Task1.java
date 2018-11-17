import java.util.Scanner;

public class Task1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter n: ");
		int n=in.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Please enter number:");
			arr[i]=in.nextInt();
		}
		int min=Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum=0;
		double avg=0;
		int even=0;
		int odd=0;
		for(int i=0;i<n;i++){
			if(arr[i]<min){
				min=arr[i];
			}
			if(arr[i]>max){
				max=arr[i];
			}
			sum=sum+i;
			avg=sum/n;
			if(i%2==0){
				even++;
			}else{
				odd++;
			}
		}
		System.out.println("Min number is:"+min);
		System.out.println("Max number is:"+max);
		System.out.println("Sum is:"+sum);
		System.out.println("Average is:"+avg);
		System.out.println("Odd: "+odd);
		System.out.println("Even: "+even);
	}
}
