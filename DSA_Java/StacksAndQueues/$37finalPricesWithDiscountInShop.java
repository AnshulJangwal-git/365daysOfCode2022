// Leetcode 1475 - https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
class $finalPricesWithDiscountInShop {
    public int[] finalPrices(int[] prices) {
        int n = prices.length ;
        Stack<Integer> st = new Stack<>() ;
        
        int[] nse = new int[n] ;
        
        for(int i = n - 1; i >= 0; i--){
            while(st.size() > 0 && prices[i] < st.peek()){
                st.pop() ;
            }
            
            if(st.size() != 0){
            nse[i] = st.peek() ;

            }else{
                nse[i] = -1 ;
            }
            st.push(prices[i]) ;
        }
        for(int i = 0; i < prices.length; i++){
            if(nse[i] != -1){
                prices[i] = prices[i] - nse[i] ;
                
            }else{
                prices[i] = prices[i] - 0 ;
            }
        }
        return prices ;
    }
}