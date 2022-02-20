//Link - https://nados.io/question/maximize-sum-of-arr-i-i-of-an-array
import java.util.*;

public class $10maximisetheSum {

    public static int maximise(int[]arr) {
        Arrays.sort(arr) ;
        int sum = 0 ;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]*i ;
        }
        return sum ;
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
