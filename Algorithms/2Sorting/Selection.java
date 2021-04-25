import java.util.*;

class SelectionSort{
	static Scanner sc = new Scanner(System.in);

	public static void readArray(int[] arr , int size){
		System.out.println("Enter " + size + " elements...");
		for(int i = 0 ; i < size ; i++)
			arr[i] = sc.nextInt();
	}

	public static void writeArray(int[] arr , int size){
		for(int i = 0 ; i < size ; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void sort(int[] arr , int size){
		int minIndex = -1;
		for(int i = 0 ; i < size ; i++){
			minIndex = i;

			for(int j = i + 1 ; j < size ; j++){
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}

			swap(arr , i , minIndex);
		}
	}

	public static void swap(int[] arr , int i , int j){
		int temp = arr[i];
		arr[i]   = arr[j];
		arr[j]   = temp;
	}
	public static void main(String[] args) {
		System.out.print("Enter the size of the array..." );
		int size = sc.nextInt();

		int[] arr = new int[size];
		readArray(arr , size);
		System.out.println("Before sorting...");
		writeArray(arr , size);
		
		sort(arr , size);

		System.out.println("After sorting...");
		writeArray(arr , size);

	}
}