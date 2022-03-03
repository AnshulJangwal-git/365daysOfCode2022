//Link - https://practice.geeksforgeeks.org/problems/gold-mine-problem2608/1/#
class $01Goldmine{
    static int maxGold(int n, int m, int arr[][])
    {
        // code here
        int max = Integer.MIN_VALUE ;
        if(n == 1){
            int sum = 0 ;
            for(int j = 0; j < m; j++){
                sum+= arr[0][j] ;
            }
            return sum ;
            
        }else if(m == 1){
            for(int i = 0; i < n; i++){
                max = Math.max(arr[i][0], max) ;
            }
            return max ;
            
        }else if(n == 1 && m == 1){
            return arr[0][0] ;
        }
        
        int[][] dp = new int[n][m] ;
        for(int j = dp[0].length - 1; j >= 0; j--){
            for(int i = arr.length - 1; i >= 0; i--){
                if(j == m - 1){
                    dp[i][j] = arr[i][j] ;

                }else if(i == 0){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]) ;

                }else if(i == arr.length - 1){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]) ;

                }else{
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1],
                        Math.max(dp[i + 1][j + 1], dp[i - 1][j + 1])) ;
                }
            }
        }
        max = dp[0][0] ;
        for(int i = 1; i < arr.length; i++){
            max = Math.max(max, dp[i][0]) ;
        }
        
        return max ;
    }
}