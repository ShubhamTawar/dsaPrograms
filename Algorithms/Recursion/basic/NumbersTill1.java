import java.util.*;

class Solution{
	public static void printNumber(int n){
	   if(n == 0)
	   	return;
	   System.out.print(n + " ");
	   printNumber(n - 1);
	}
	public static void main(String[] args) {
		System.out.print("Enter n...");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		printNumber(n);
	}
}