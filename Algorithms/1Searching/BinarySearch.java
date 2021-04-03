import java.util.*;

class Solution{
  static Scanner sc = new Scanner(System.in);
  public static int binarySearch(int[] arr , int n , int x){
  	 int l = 0;
     int r = n - 1;
     int mid = 0;


     while(l <= r){
      mid = (l + r) / 2;
      if(arr[mid] == x)
        return mid;
      else if(arr[mid] > x)
        r = mid - 1;
      else
        l = mid + 1;


     }
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
  	int idx = binarySearch(arr , n , x);

  	if(idx == -1)
  		System.out.println(x + " is not present inside the array...");
  	else
  		System.out.println(x + " is present at index no " + idx);
  }
}