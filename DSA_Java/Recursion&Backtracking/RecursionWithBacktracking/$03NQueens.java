import java.io.*;
import java.util.*;

public class $03NQueens {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[][] chess = new int[n][n] ;
        
        printNQueens(chess, "", 0) ;
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row == chess.length){
            System.out.println(qsf + ".") ;
            return ;
        }

        for(int col = 0; col < chess[0].length; col++){
            
            if(isSafe(chess, row, col) == true){
                chess[row][col] = 1 ;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1) ;
                chess[row][col] = 0 ; //Backtrack..
            }
        }
    }
    public static boolean isSafe(int[][] chess, int row, int col){
        
        for(int i = row - 1, j = col; i >= 0; i --){
            if(chess[i][j] == 1) return false ;
        }
        
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i --, j--){
            if(chess[i][j] == 1) return false ;
        }
        
        for(int i = row - 1, j = col + 1; i >= 0 && j < chess[0].length; i--, j++){
            if(chess[i][j] == 1) return false ;
        }
        return true ;
    }
}




// Using boolean visited array

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[][] chess = new int[n][n] ;
        
        boolean[][] visited = new boolean[n][n] ;
        printNQueens(chess, "", 0, visited) ;
    }

    public static void printNQueens(int[][] chess, String qsf, int row, boolean[][] visited) {
        if(row == chess.length){
            System.out.println(qsf + ".") ;
            return ;
        }
        
        for(int col = 0; col < chess.length; col ++){
            if(isSafe(chess, row, col, visited) == true){
                visited[row][col] = true ;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1, visited) ;
                visited[row][col] = false ; //backtrack
            }
        }
        
    }
    
    public static boolean isSafe(int[][] chess, int row, int col, boolean[][] visited){
        
        for(int i = row - 1, j = col; i >= 0; i --){
            if(visited[i][j]) return false ;
        }
        
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(visited[i][j]) return false ;
        }
        
        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if(visited[i][j]) return false ;
        }
        
        return true ;
    }
}












