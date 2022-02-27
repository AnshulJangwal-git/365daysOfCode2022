//Link - https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1#
import java.util.* ;

class $40Leaders{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list = new ArrayList<>() ;
        int rmax = 0 ;
        
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] >= rmax){
                rmax = arr[i] ;
                list.add(arr[i]) ;
            }
        }
        Collections.reverse(list) ;
        return list ;
    }
}
