import java.util.Scanner;

public class Task3 {
	public static int[] bubbleSort(int[] arr){
		boolean isSwap= true;
		int length = arr.length-1;
		while(isSwap){
			isSwap = false;
			for(int i=0;i<length;i++){
				int temp=0;
				if(arr[i]>arr[i+1]){
					temp= arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					isSwap = true;
				}
			}
		}
		return arr;
	}
	public static int binarySearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (end - start) / 2;
			if (key == arr[mid]) {
				return mid;

			}
			if (key < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a size of array: ");
		int size = in.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter an element of array: ");
			arr[i] = in.nextInt();
		}
		int[] newArr = new int[arr.length];
		newArr=bubbleSort(arr);
		System.out.println("Please enter a key: ");
		int key = in.nextInt();
		int bs = binarySearch(newArr, key);
		System.out.println("The key is found on index: " + bs);
	}

}
