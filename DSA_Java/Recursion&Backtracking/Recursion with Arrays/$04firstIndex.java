import java.io.*;
import java.util.*;

public class $04firstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
        }
        
        int x = sc.nextInt() ;
        int ans = firstIndex(arr, 0, x) ;
        System.out.println(ans) ;
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1 ;
        }
        
        int fi = firstIndex(arr, idx + 1, x) ;
        if(arr[idx] == x){
            return idx ;
            
        }else{
            return fi ;
            
        }
    }

}