import java.util.*;


class Solution{
	static Scanner sc = new Scanner(System.in);

	public static void readMatrix(int[][] mat , int r , int c){
		System.out.println("Enter " + (r * c) + " elements\n");

		for(int i = 0 ; i < r ; i++)
			for(int j = 0 ; j < c ; j++)
				mat[i][j] = sc.nextInt();
	}


	public static void writeMatrix(int[][] mat , int r , int c){
		System.out.println();

		for(int i = 0 ; i < r ; i++){
			for(int j = 0 ; j < c ; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void spiralTraversal(int[][] mat , int r , int c){
		int top , down , left , right;

		top   = left = 0;
		down  = r - 1;
		right = c - 1;

		int flag = 0;

		while(top <= down && left <= right){
			if(flag == 0){
				for(int i = left ; i <= right ; i++)
					System.out.print(mat[top][i] + " ");
				top++;
			}else if(flag == 1){
				for(int i = top ; i <= down ; i++)
					System.out.print(mat[i][right] + " ");
				right--;
			}else if(flag == 2){
				for(int i = right ; i >= left ; i--)
					System.out.print(mat[down][i] + " ");
				down--;
			}else{
				for(int i = down ; i >= top ; i--)
					System.out.print(mat[i][left] + " ");
				left++;
			}

			flag = (flag + 1) % 4;
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter row and column for the matrix...");
		int r = sc.nextInt();
		int c = sc.nextInt();

		int[][] mat = new int[r][c];

		readMatrix(mat , r , c);
		writeMatrix(mat , r , c);
		spiralTraversal(mat , r , c);	
	}
}