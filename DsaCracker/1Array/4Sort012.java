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

	public static void sort(int[] arr , int size){
		int low = 0;
		int mid = 0;
		int high = size - 1;

		while(mid <= high){
			
			if(arr[mid] == 0){
				swap(arr , mid , low);
				low++;
				mid++;
			}
			else if(arr[mid] == 1){
				mid++;
			}
			else{
				swap(arr , mid , high);
				high--;
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
		sort(arr , size);
		display(arr , size);
	}
}