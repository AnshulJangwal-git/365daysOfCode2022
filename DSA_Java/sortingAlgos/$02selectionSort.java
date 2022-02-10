import java.util.* ;
//time Complexity 
            // => worst Case - O(n^2)
            // Best case = O(n)

public class $02selectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
        }

        selectionSort(arr) ;
        print(arr) ;
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = i ;
            for(int j = i + 1; j < arr.length; j++){
                if(isSmaller(arr, j, min) == true){
                    min = j ;
                }
            }
            swap(arr, i, min) ;
        }
    }

    public static boolean isSmaller(int[] arr, int i, int j){
        if(arr[i] < arr[j]){
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

    public static void print(int[] arr){
        for(int val : arr){
            System.out.print(val + " ") ;
        }
    }

}
