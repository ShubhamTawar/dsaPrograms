// Union and Intersection of two sorted arrays...
// If array is not sorted then firstly sort the arrays
// Take care about duplicates either by using set or previous variable(keeps
// track of previously  added element)

import java.util.*;

class Solution{
	static Scanner sc = new Scanner(System.in);
	
	public static void readArray(int[] arr , int n){
		System.out.println("Enter " + n + " elements....");
		for(int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();
	}

	public static ArrayList<Integer> union(int[] arr1 , int[] arr2 , int n1 , int n2){
		int i , j ;
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		ArrayList<Integer> union = new ArrayList<>();
		i = j = 0 ;
	    int prev = Math.min(arr1[i] , arr2[j]);
	    union.add(prev);
		while( i < n1 && j < n2 ){
			if(arr1[i] == arr2[j]){

				if(prev != arr1[i])
				  union.add(arr1[i]);

				prev = arr1[i];

				i++;
				j++;
			}else if(arr1[i] < arr2[j]){
				
				if(prev != arr1[i])
				  union.add(arr1[i]);

				prev = arr1[i];
				i++;
			}else{
				if(arr2[j] != prev)
				  union.add(arr2[j]);

				prev = arr2[j];
				j++;
			}
		}

		while(i < n1){
			if(prev != arr1[i])
				  union.add(arr1[i]);

				prev = arr1[i];
				i++;
				
		}

		while(j < n2){
			if(prev != arr2[j])
				  union.add(arr2[j]);

				prev = arr2[j];
			j++;				
		}
		return union;
	}
	
	public static ArrayList<Integer> intersection(int[] arr1 , int[] arr2 , int n1 , int n2){
		int i , j;
		i = j = 0;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		ArrayList<Integer> intersection = new ArrayList<>();
		while(i < n1 && j < n2){
			if(arr1[i] == arr2[j]){
				intersection.add(arr1[i]);
				i++;
				j++;
			}else if(arr1[i] < arr2[j]){
				i++;
			}else{
				j++;
			}
		}
		return intersection;
	}

	public static void main(String[] args) {
		System.out.println("Enter size of first array....");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];

		readArray(arr1 , n1);

		System.out.println("Enter size of second array....");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];

		readArray(arr2 , n2);

		ArrayList<Integer> union = union(arr1 , arr2 , n1 , n2);
		ArrayList<Integer> intersection = intersection(arr1 , arr2 , n1 , n2);
		System.out.println(union);
		System.out.println(intersection);


	}
}