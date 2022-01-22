//Leetcode 840 - https://leetcode.com/problems/magic-squares-in-grid/
import java.util.* ;

class magicSquareInGrid{
    public boolean checkMagicSquare(int i, int j, int[][] grid){
          if(i - 1 < 0 || j - 1 < 0 || i + 1 >= grid.length || j + 1 >= grid[0].length){
              return false ;
          }
        
        HashSet<Integer> set = new HashSet<>() ;
          set.add(grid[i - 1][j - 1]) ;
          set.add(grid[i - 1][j]) ;
          set.add(grid[i - 1][j + 1]) ;
          set.add(grid[i][j - 1]) ;
          set.add(grid[i][j]) ;
          set.add(grid[i][j + 1]) ;
          set.add(grid[i + 1][j - 1]) ;
          set.add(grid[i + 1][j]) ;
          set.add(grid[i + 1][j + 1]) ;
        
        for(int val : set){
              if(val >= 10 || val <= 0){
                 return false ;
              }
          }


          int r1 = grid[i - 1][j - 1] + grid[i - 1][j] + grid[i - 1][j + 1] ;

          int r2 = grid[i][j -1] + grid[i][j] + grid[i][j + 1] ;
          int r3 = grid[i + 1][j - 1] + grid[i + 1][j] + grid[i + 1][j + 1] ;

          int c1 = grid[i - 1][j - 1] + grid[i][j - 1] + grid[i + 1][j - 1] ;
          int c2 = grid[i - 1][j] + grid[i][j] + grid[i + 1][j] ;
          int c3 = grid[i - 1][j + 1] + grid[i][j + 1] + grid[i + 1][j + 1] ;

          int d1 = grid[i - 1][j - 1] + grid[i][j] + grid[i + 1][j + 1] ;
          int d2 = grid[i - 1][j + 1] + grid[i][j] + grid[i + 1][j - 1] ;

          boolean flag = true ;

          if(r1==r2 && r3==r2 && c1==r1 && c2==c1 && c3==c1 && d1==r1 && d2==d1 && set.size()==9 && flag==true){
              return true ;
          }else{
              return false ;
          }

    }

      public int numMagicSquaresInside(int[][] grid) {
          int count = 0 ;

          if(grid.length < 3 || grid[0].length < 3){
              return 0 ;
          }


          for(int i = 0; i < grid.length; i++){
              for(int j = 0; j < grid[0].length; j++){
                  if(grid[i][j] == 5){
                      boolean flag = checkMagicSquare(i, j, grid) ;
                      if(flag == true){
                          count ++ ;

                      }
                  }
              }
          }
          return count ;
      }
}



