import java.io.*;
import java.util.*;

public class $05lastIndex {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
        }
        int x = sc.nextInt() ;
        
        int li = lastIndex(arr, n - 1, x) ;
        System.out.println(li) ;
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == -1){
            return -1 ;
        }
        if(arr[idx] == x){
            return idx ;
        }else{
            int li = lastIndex(arr, idx - 1, x) ;
            return li ;
        }
    }

}