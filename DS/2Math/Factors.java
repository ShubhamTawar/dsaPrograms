import java.util.*;

class Solution{
	public static void factors(int no){
		for(int i = 1 ; i * i <= no ; i++){
			if(no % i == 0){
				if(i * i != no)
				System.out.print(i + " " + no / i + " ");
			    else
			    System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n ..");
		int no = sc.nextInt();

		factors(no);

	}
}