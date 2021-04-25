import java.util.*;

class InsertionSort{
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
		int key = 0;
		int i , j;
		i = j = 0;
		for(i = 1 ; i < size ; i++){
			key = arr[i];
			for(j = i - 1; j > 0 && arr > arr[j + 1]; j--){
				arr[j + 1] = arr[j];
			}
			arr[j] = key;
		}		
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