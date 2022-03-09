// import java.io.*;
import java.util.*;

public class $15sumOfXorOfAllPairs {

    public static int solution(int[] arr){
       //write your code here
       int xor = 0 ;
       for(int val : arr){
           xor = xor ^ val ;
       }
       
       return 2 * xor ;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }
    
    
}



//GFG Sol - https://practice.geeksforgeeks.org/problems/sum-of-xor-of-all-pairs0723/1/#

class Solution{
   
    // Function for finding maximum and value pair
    public long sumXOR (int arr[], int n) {
        //Complete the function
        long sum=0;
       for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
               sum+=(arr[i]^arr[j]);
           }
       }
       return sum;


    }
    
    
}
