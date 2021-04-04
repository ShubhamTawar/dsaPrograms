import java.util.*;

class Solution{
	public static boolean isPrime(int no){
         if(no == 1)
         	return false;

         for(int i = 2 ; i * i <= no ; i++)
         	if(no % i == 0)
         		return false;

         return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n ..");
		int no = sc.nextInt();

		if(isPrime(no))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}