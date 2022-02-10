import java.util.* ;
import java.io.* ;

public class $01BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int itr = 1; itr <= arr.length - 1; itr ++){
            for(int j = 0; j < arr.length - itr; j++){
                if(isSmaller(arr, j + 1, j) == true){
                    swap(arr, j + 1, j) ;
                }
            }
        }
    }    

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    public static boolean isSmaller(int[] arr, int i, int j){
        if(arr[i] < arr[j]){
            return true ;

        }else{
            return false ;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
        }

        bubbleSort(arr) ;
        print(arr) ;
    }
    public static void print(int[] arr){
        for(int val : arr){
            System.out.print(val + "  ") ;
        }
    }
}

// Time Complexity => o(n^2) in the worst case and o(n) in the best case
