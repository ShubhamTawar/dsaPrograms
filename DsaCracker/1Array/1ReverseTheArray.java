import java.util.*;


class Solution{
    static Scanner sc = new Scanner(System.in);
	public static void readArray(int[] arr , int n){
		System.out.println("Enter " + n + " elements...");
		for(int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();
	}

	public static void display(int[] arr , int n){
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void reverse(int[] arr , int n){
		int i = 0;
		int j = n - 1;
		int temp = 0;

		for( ; i < j ; i++ , j--){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter the size of the array....");
		int size = sc.nextInt();
		int[] arr = new int[size];

		readArray(arr , size);
		display(arr , size);
		reverse(arr , size);
		display(arr , size);
	}
}