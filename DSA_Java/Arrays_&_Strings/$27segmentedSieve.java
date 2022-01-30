//Link - https://nados.io/question/segmented-sieve
import java.util.*;
public class $27segmentedSieve {

  // ~~~~~~~~~~~~~User Section~~~~~~~~~~~~

  public static void segmentedSieveAlgo(int a, int b) {
    int rootb = (int)Math.sqrt(b) ;

    boolean[] arr = new boolean[b - a + 1] ;
    ArrayList<Integer> primes = sieveAlgo(rootb) ;
    // for(int val : primes){
    //   System.out.print(val + "    ") ;
    // }
    // System.out.println() ;

    for(int prime : primes){
      int multiple = (int)Math.ceil((a * 1.0) / prime) ;
      if(multiple == 1){
        multiple ++ ;
      }

      int idx = multiple * prime - a ;

      for(int j = idx; j < arr.length; j += prime){
        arr[j] = true ;
      }
    }

    for(int i = 0; i < arr.length; i++){
      if(arr[i] == false && i + a != 1){
        System.out.println((i + a)) ;
      }
    }

  }

  public static ArrayList<Integer> sieveAlgo(int n){
    boolean[] arr = new boolean[n + 1] ;
    Arrays.fill(arr, true) ;

    for(int i = 2; i * i <= arr.length; i++){
      if(arr[i] == true){
        for(int j = i + i; j < arr.length; j += i){
          arr[j] = false ; //marking prime..
        }
      }
    }
    ArrayList<Integer> ans = new ArrayList<>() ;

    for(int i = 2; i < arr.length; i++){
      if(arr[i] == true){
        ans.add(i) ;    
      }
    }
    return ans ;
  }


  // ~~~~~~~~~~~~Input Management~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    segmentedSieveAlgo(a, b);
  }
}

