//Link - https://nados.io/question/transpose-of-matrix-with-dimension-n-x-n
import java.util.*;
public class $29InplaceMatrix {

  // ~~~~~~~~~~~~~User Section~~~~~~~~~~~~~
  public static void transpose(int[][] matrix) {
    int[][] res = new int[matrix.length][matrix[0].length] ;

    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < i; j++){
        swap(matrix, i, j) ;
      }
    }
  }

  public static void swap(int[][] arr, int i, int j){
    int temp = arr[i][j] ;
    arr[i][j] = arr[j][i] ;
    arr[j][i] = temp ;
  }

  // ~~~~~~~~~~~Input Management~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = scn.nextInt();
      }
    }
    transpose(matrix);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
