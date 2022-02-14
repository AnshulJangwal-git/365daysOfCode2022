// import java.util.* ;

public class longestLengthOfAP {
    public static void main(String[] args){
        int[] arr = {1, 7, 10, 15, 27, 29} ;
        int n = arr.length ;

        int ans = lengthOfLongestAP(arr, n) ;

        int arr2[] = {2, 4, 6, 8, 10} ;
        int n2 = arr2.length ;

        int ans2 = lengthOfLongestAP(arr2, n2) ;

        System.out.println(ans) ;
        System.out.println(ans2) ;
    }
     
    public static int lengthOfLongestAP(int[] arr, int n){
        if(n <= 2){
            return n ;
        }
        int[][] dp = new int[n][n] ;
        int maxLen = 2 ;

        for(int i = 0; i < n; i++){
            dp[i][n - 1] = 2 ;
        }

        for(int j = n - 2; j >= 1; j--){
            int i = j - 1 ;
            int k = j + 1 ;

            while(i >= 0 && k <= n - 1){
                if(arr[i] + arr[k] < 2 * arr[j]){
                    k ++ ;

                }else if(arr[i] + arr[k] > 2 * arr[j]){
                    dp[i][j] = 2 ;
                    i -- ;

                }else{
                    dp[i][j] = dp[j][k] + 1 ;
                    maxLen = Math.max(dp[i][j], maxLen) ;
                    i -- ;
                    k ++ ;
                }
            }

            while(i >= 0){
                dp[i][j] = 2 ;
                i -- ;
            }
        }
        return maxLen ;
    }
} 

