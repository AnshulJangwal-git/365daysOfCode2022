// Leetcode 1672 - https://leetcode.com/problems/richest-customer-wealth/
class $68reachestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE ;
        
        for(int[] arr : accounts){
            int sum = 0 ;
            for(int i = 0; i < arr.length; i++){
                sum += arr[i] ;        
            }
            max = Math.max(max, sum) ;
        }
        return max ;
    }
}