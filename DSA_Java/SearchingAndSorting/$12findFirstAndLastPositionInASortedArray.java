//Leetcode 34 - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class $12findFirstAndLastPositionInASortedArray { //Time Complexity - O(n)
    public int[] searchRange(int[] arr, int target) {
        int si = -1 ;
        int ei = -1 ;

        int i = 0 ;

        while(i < arr.length){
            if(arr[i] == target){
                si = i ;
                break ;
            }
            i ++ ;
        }
        i = arr.length - 1 ;
        while(i >= 0){
            if(arr[i] == target){
                ei = i ;
                break ;
            }
            i -- ;
        }
        int[] ans = new int[2] ;
        ans[0] = si ;
        ans[1] = ei ;
        return ans ;
    }
}

//Method2 - Using Binary Search.., Time Complexity - O(logn)

// import java.util.*;
// // import java.io.*;

// public class Main {

//     //return an array of size two, which contains first and last index of target.
//     public static int[] find(int[]arr,int target) {
//         int[] ans = {-1, -1} ;
//         int lo = 0 ;
//         int hi = arr.length - 1 ;

//         while(lo <= hi){  
//             int mid = (lo + hi) / 2 ;
//             if(arr[mid] == target){
//                 ans[0] = mid ;
//                 hi = mid - 1 ;

//             }else if(arr[mid] < target){
//                 lo = mid + 1 ;

//             }else{
//                 hi = mid - 1 ;
//             }
//         }

//         lo = 0 ;
//         hi = arr.length - 1 ;

//         while(lo <= hi){  
//             int mid = (lo + hi) / 2 ;
//             if(arr[mid] == target){
//                 ans[1] = mid ;
//                 lo = mid + 1 ;

//             }else if(arr[mid] < target){
//                 lo = mid + 1 ;

//             }else{
//                 hi = mid - 1 ;
//             }
//         }
//         return ans ;
//     }

//     public static void main(String[]args) {
//         //input work
//         Scanner scn = new Scanner(System.in);

//         int n = scn.nextInt();
//         int[]arr = new int[n];

//         for(int i=0;i < n;i++) {
//             arr[i] = scn.nextInt();
//         }

//         int target = scn.nextInt();

//         int[]ans = find(arr,target);
//         System.out.println(ans[0] + " " + ans[1]);
//     }
// }
