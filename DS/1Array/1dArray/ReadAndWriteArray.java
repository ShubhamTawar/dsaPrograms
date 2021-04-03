import java.util.*;

class Solution{
	public static Scanner sc = new Scanner(System.in);
	public static void readArray(int[] ar , int n){
		System.out.println("Enter " + n + " elements...");
		for(int i = 0 ; i < n ; i++)
			ar[i] = sc.nextInt();
	}

	public static void printArray(int[] ar , int n){
		for(int i = 0 ; i < n ; i++)
			System.out.print(ar[i] + " ");
	}

	public static void main(String[] args) {
		System.out.print("Enter the size of the array...");	
		int n = sc.nextInt();
		int[] arr = new int[n];

		readArray(arr , n);
		printArray(arr , n);
    }
}