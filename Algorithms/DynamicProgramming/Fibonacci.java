import java.util.*;

class Solution{
	public static int fib(int n){
		
		if(n <= 1)
			return 2;
		int[] dp = new int[n + 1];

		dp[1] = 2;
		dp[2] = 3;

		for(int i = 3 ; i <= n ; i++)
			dp[i] = dp[i - 1] + dp[i - 2];

		return dp[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = fib	(n);

		System.out.println(res);
	}
}