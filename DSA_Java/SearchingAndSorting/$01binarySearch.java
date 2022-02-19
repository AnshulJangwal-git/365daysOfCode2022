//Link - https://practice.geeksforgeeks.org/problems/binary-search/1
import java.util.* ;
public class $01binarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
        }
        int data = sc.nextInt() ;
        Arrays.sort(arr) ; //Binary serach only work on sorted arrays...

        int idx = binarySearch(arr, data) ;
        System.out.println(idx) ;
    }

    public static int binarySearch(int[] arr, int data){
        int lo = 0 ;
        int hi = arr.length - 1 ;

        while(lo <= hi){
            int mid = (lo + hi) / 2 ;
            if(data > arr[mid]){
                lo = mid + 1 ;

            }else if(data < arr[mid]){
                hi = mid - 1 ;

            }else{
                return mid ;

            }
        }
        return -1 ;
    }
}

//Time Complexity
// Average time complexity of binary search is -> O(logn)
//Best case time complexity is O(1) when the central element of array directly matches to the desired data value..