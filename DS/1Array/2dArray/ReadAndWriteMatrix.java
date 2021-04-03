import java.util.*;

class Solution{
	static Scanner sc = new Scanner(System.in);

	public static void readMatrix(int[][] mat , int r , int c){
		System.out.println("Enter " + (r * c) + " elements....");
		for(int i = 0 ; i < r ; i++)
			for(int j = 0 ; j < c ; j++)
				mat[i][j] = sc.nextInt();
	}
	
	public static void printMatrix(int[][] mat , int r , int c){
        for(int i = 0 ; i < r ; i++){
			for(int j = 0 ; j < c ; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
        }
	}

	public static void main(String[] args) {
		System.out.print("Enter row and columns of the matrix....");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] mat = new int[row][col];
		readMatrix(mat , row , col);
		printMatrix(mat , row , col);

	}
}