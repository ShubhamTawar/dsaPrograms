import java.util.*;

class Solution{
	public static void printNumber(int a , int b){
	   if(a == b + 1)
	   	return;
	   System.out.print(a + " ");
	   printNumber(a + 1 , b);
	}
	public static void main(String[] args) {
		System.out.print("Enter range...");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		printNumber(a , b);
	}
}