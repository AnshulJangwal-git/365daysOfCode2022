//Link - https://nados.io/question/roof-top
import java.util.*;

public class $09roofTop {

    public static int findMaxSteps(int[]arr) {
        int count = 0 ;
        int max = 0 ;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i + 1]){
                count ++ ;

            }else{
                count = 0 ;
            }
            max = Math.max(max, count) ;            
        }
        max = Math.max(max, count) ;

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

        int ans = findMaxSteps(arr);
        System.out.println(ans);
    }
}