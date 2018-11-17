import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter number:");
			arr[i] = in.nextInt();
		}
		int idx = 0;
		int count = 0;
		int max_idx=Integer.MIN_VALUE;
		int max_count =Integer.MIN_VALUE;
		for(int i=0;i<n-1;i++){
			if(arr[i]==arr[i+1]){
				idx=i;
				count++;
				System.out.println(count+"c");
			}
			if(count>max_count){
				max_count=count;
				System.out.println(max_count+"mc");
				max_idx=idx;
				System.out.println(idx+"mi");
			}
		}
		count=0;
		int[] arr2 =java.util.Arrays.copyOfRange(arr, max_idx+1-max_count+1, max_count+2);
		System.out.println(java.util.Arrays.toString(arr2));
	}

}
