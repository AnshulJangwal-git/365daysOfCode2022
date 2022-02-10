import java.util.* ;

public class $03inssertionSort {
    public static void insertionSort(int[] arr){
        for(int i = 1; i <= arr.length - 1; i++){
            for(int j = i - 1;  j >= 0; j--){
                if(isGreater(arr, j, j + 1)){
                    swap(arr, j, j + 1) ;

                }else{
                    break ;
                }
            }
        }
    }
    
    public static boolean isGreater(int arr[], int i, int j){
        if(arr[i] > arr[j]){
            return true ;

        }else{
            return false ;

        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    //Main method ------


}


//Time Complexity
// Best Case - O(n) 
// Worst Case - O(n^2)