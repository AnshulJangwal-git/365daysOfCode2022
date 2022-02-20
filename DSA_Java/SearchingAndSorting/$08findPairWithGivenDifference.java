//Link - https://nados.io/question/find-pair-with-given-difference
import java.util.*;
// import java.io.*;

public class $08findPairWithGivenDifference {


    public static void findPair(int[]arr,int target) {
        Arrays.sort(arr) ;
        int i = 0 ;
        int j = 1 ;
        
        while(i < arr.length && j < arr.length){
            int gap = arr[j] - arr[i] ;
            if(gap == target){
                System.out.print(arr[i] + " " + arr[j]) ;
                return ;
                
            }else if(gap < target){
                j ++ ;
                
            }else{
                i ++ ;
                
            }
        }
        System.out.println(-1) ;
    }

    public static void main(String[]args) {

        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];

        for(int i=0; i < n;i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        findPair(arr,target);
    }
}