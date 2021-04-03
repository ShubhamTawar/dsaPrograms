import java.util.*;

class Solution{
	public static void printNumber(int start , int n){
	   if(start == n + 1)
	   	return;
	   System.out.print(start + " ");
	   printNumber(start + 1 , n);
	}
	public static void main(String[] args) {
		System.out.print("Enter n...");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		printNumber(1 , n);
	}
}