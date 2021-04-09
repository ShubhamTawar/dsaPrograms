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

	public static void toEnd(int[] arr , int n){
		int low , high;

		low = 0;
		high = n - 1;

		while(low <= high){
			if(arr[low] < 0){
				swap(arr , low , high);
				high--;
			}else{
				low++;
			}
		}
	}

	public static void swap(int[] arr , int i , int j){
		int temp = arr[i];
		arr[i]   = arr[j];
		arr[j]   = temp;
	}
	public static void main(String[] args) {
		System.out.print("Enter the size of the array....");
		int size = sc.nextInt();
		int[] arr = new int[size];

		readArray(arr , size);
		display(arr , size);
		toEnd(arr , size);
		display(arr , size);
	}
}