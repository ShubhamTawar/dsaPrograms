import java.util.*;

class Solution{
  static Scanner sc = new Scanner(System.in);
  public static int linearSearch(int[] arr , int n , int x){
  	 for(int i = 0 ; i < n ; i++)
  	 	if(arr[i] == x)
  	 		return i;
  	return -1;
  }

  public static void readArray(int[] arr , int n){
  	System.out.println("Enter " + n + " elements..");
  	for(int i = 0 ; i < n ; i++)
  		arr[i] = sc.nextInt();
  }

  public static void main(String[] args) {
  	System.out.print("Enter the size of the array....");
  	int n = sc.nextInt();
  	int[] arr = new int[n];
  	readArray(arr , n);
  	System.out.print("Enter the element to be searched....");
  	int x = sc.nextInt();
  	int idx = linearSearch(arr , n , x);

  	if(idx == -1)
  		System.out.println(x + " is not present inside the array...");
  	else
  		System.out.println(x + " is present at index no " + idx);
  }
}