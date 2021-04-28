import java.util.*;

class Rat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t  = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[][] a = new int[n][n];

            for(int i = 0 ; i < n ; i++)
                for(int j = 0 ; j < n ; j++)
                    a[i][j] = sc.nextInt();

            Solution obj = new Solution();

            ArrayList<String> res = obj.findPath(a , n);

            if(res.size() > 0){
                for(int i = 0 ; i < res.size() ; i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            }else{
                System.out.println(-1);
            }

            }
    }
}


class Solution {
    public static boolean isSafe(int i , int j , int n , int[][] m , boolean[][] visited){
        return i < n && i >= 0 && j < n && j >= 0 && m[i][j] == 1 && !visited[i][j];
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> res = new ArrayList<>();
       
        if(m[n - 1][n - 1] == 0 || m[0][0] == 0)
           return res;
           
        boolean[][] visited = new boolean[n][n];
        util(m , "" , 0 , 0 , visited , n , res);
        return res;
    }
    
    public static void util(int[][] m , String s , int i , int j , boolean[][] visited , int n , ArrayList<String> res){
            if(i == n - 1 && j == n - 1){
                    res.add(s);        
                return ;
            }
       
            // Down
            visited[i][j] = true;
            if(isSafe(i + 1, j  , n , m , visited))
                util(m , s + "D" , i + 1 , j , visited , n , res);
             
            // Left
             if(isSafe(i , j - 1 , n , m , visited))
                util(m , s + "L" , i , j - 1 , visited , n , res);
             
            // Right
             if(isSafe(i , j + 1 , n , m , visited))
                util(m , s + "R" , i , j + 1 , visited , n , res);
           
            // Up
            if(isSafe(i - 1 , j , n , m , visited))
                util(m , s + "U" , i - 1, j , visited , n , res);
            
            
            visited[i][j] = false;

            
    }
}