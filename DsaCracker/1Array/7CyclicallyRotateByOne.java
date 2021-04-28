import java.util.*;


class Solution{
	static Scanner sc = new Scanner(System.in);

	public static void readArray(int[] arr , int n){
		System.out.println("Enter " + n + " elements..." );

		for(int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();
	}

	public static void writeArray(int[] arr , int n){
		for(int i = 0 ; i < n ; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void rotateByOne(int[] arr , int n){
		int temp = arr[n - 1];

		for(int i = n - 1 ; i > 0 ; i--)
			arr[i] = arr[i - 1];

		arr[0] = temp;
	}

	public static void main(String[] args) {
		System.out.print("Enter the size of the array....");
		int n = sc.nextInt();

		int[] arr = new int[n];

		readArray(arr , n);

		System.out.println("Before rotating...");
		writeArray(arr , n);

		rotateByOne(arr , n);

		System.out.println("After rotating...");
		writeArray(arr , n);
	}
}