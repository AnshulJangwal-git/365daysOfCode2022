import java.util.*;

public class $18PartitionArrayIntoDisjointIntervals {

  // ~~~~~~~~~~~~~~User's Section~~~~~~~~~~~~~~~
  public static int partitionDisjoint(int[] arr) {
    int lmax = arr[0] ;
    int greater = arr[0] ;
    int idx = 0 ;
    
    for(int i = 1; i < arr.length; i++){
        if(arr[i] > greater){
            greater = arr[i] ;
            
        }else if(arr[i] < lmax){
            lmax = greater ;
            idx = i ;
            
        }else{
            continue ;
            // nothing to do
        }
    }
    
    return idx + 1 ;
  }

  // ~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int len = partitionDisjoint(arr);
    System.out.println(len);
  }
}


