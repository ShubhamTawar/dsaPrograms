import java.util.*;

class Solution{
	public static int countSetBits(int no){
		int cnt = 0;

		for(int i = 0 ; i < 32 ; i++){
			if(((no >> i) & 1) == 1)
				cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		int cnt = countSetBits(no);
		System.out.println(cnt);
	}
}