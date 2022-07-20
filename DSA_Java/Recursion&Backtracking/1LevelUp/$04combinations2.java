import java.io.*;
import java.util.*;

public class $04combinations2 {

  public static void combinations(boolean[] boxes, int ci, int ti, int lb){
    if(ci > ti){
        for(int i = 0; i < boxes.length; i++){
          if(boxes[i] == true){
            System.out.print("i") ;

          }else{
            System.out.print("-") ;
          }
        }
        System.out.println() ;
        return ;
    }
    
    for(int bi = lb + 1; bi < boxes.length; bi ++){
        if(boxes[bi] == false){
            boxes[bi] = true ;
            combinations(boxes, ci + 1, ti, bi) ;
            boxes[bi] = false ;
        }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    combinations(new boolean[nboxes], 1, ritems, -1);
  }

}