//Link - https://nados.io/question/count-inversions

import java.util.*;
// import java.io.*;

public class $11countInversions {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
        }

        mergeSort(arr, 0, n - 1) ;
        System.out.println(count) ;
    }
    static int count = 0 ;

    public static int[] mergeSort(int[] arr, int lo, int hi){
        if(lo == hi){
            int[] ba = new int[1] ;
            ba[0] = arr[lo] ;
            return ba ;
        }

        int mid = (lo + hi) / 2 ;
        int[] left = mergeSort(arr, lo, mid) ;
        int[] right = mergeSort(arr, mid + 1, hi) ;

        int[] merged = mergeTwoSortedArrays(left, right) ;
        return merged ;
    }

    public static int[] mergeTwoSortedArrays(int[] left, int[] right){
        int[] merged = new int[left.length + right.length] ;
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                merged[k] = left[i] ;
                i ++ ;
                k ++ ;

            }else{
                count += (left.length - i) ;
                merged[k] = right[j] ;
                j ++ ;
                k ++ ;

            }
        }
        while(i < left.length){
            merged[k] = left[i] ;
            i ++ ;
            k ++ ;

        }

        while(j < right.length){
            merged[k] = right[j] ;
            j ++ ;
            k ++ ;
        }
        return merged ;
    }

}

//Time Complexity - O(nlogn) bz of mergeSort