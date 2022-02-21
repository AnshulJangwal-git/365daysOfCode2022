//Link - https://nados.io/question/max-sum-in-the-configuration
import java.util.*;

public class $13maxSumInTheConfiguration {

    public static int maximise(int[]arr) {
        int n = arr.length ;
        int sum = 0 ;
        int s0 = 0 ;
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i] ;
            s0 += arr[i] * i ;
        }
        int max = s0 ;
        int si = s0 ;
        
        for(int i = 0; i < n - 1; i++){
            int sip1 = si + sum - n * arr[n - i - 1] ;
            max = Math.max(sip1, max) ;
            
            si = sip1 ;
        }
        return max ;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = maximise(arr);
        System.out.println(ans);
    }
}