import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please size of first arr: ");
		int n = in.nextInt();
		int[] arr=new int[n];
		System.out.println("Please size of second arr: ");
		int m = in.nextInt();
		int[] arr2=new int[m];
		for(int i=0;i<n;i++){
			System.out.println("Please enter number: ");
			arr[i]=in.nextInt();
		}
		for(int i=0;i<m;i++){
			System.out.println("Please enter number: ");
			arr2[i]=in.nextInt();
		}
		int[] arr3 = new int[n+m];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++) arr3[j]=arr[j];
		}
		int idx=arr2.length;
		for(int i=0;i<m;i++){
			arr3[i+idx]=arr2[i];
		}
		System.out.println(java.util.Arrays.toString(arr));
		System.out.println(java.util.Arrays.toString(arr2));
		System.out.println(java.util.Arrays.toString(arr3));
	}

}
