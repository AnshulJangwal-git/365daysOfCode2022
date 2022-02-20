//Link - https://practice.geeksforgeeks.org/problems/maximize-arrii-of-an-array0026/1/#
import java.util.* ;
class $10maximisetheSum{
    
    int Maximize(int arr[], int n)
    {
        // Complete the function
        Arrays.sort(arr) ;
        long sum = 0 ;
        for(int i = 0; i < arr.length; i++){
            sum += (long)arr[i] * i ;
        }
        int mod = (int)(Math.pow(10, 9) + 7) ;
        return (int)(sum % mod) ;
    }   
}
