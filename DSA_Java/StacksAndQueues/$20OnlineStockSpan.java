// Leetcode 901 - https://leetcode.com/problems/online-stock-span/
class StockSpanner {
    static class Pair{
        int price ;
        int idx ;
        
    }
    
    Stack<Pair> st ;
    int time = 0 ;
    
    public StockSpanner() {
        st = new Stack<>() ;
        Pair base = new Pair() ;
        base.price = 1000000 ;
        base.idx = -1 ;
        
        st.push(base) ;
    }
    
    
    public int next(int price) {
        Pair p = new Pair() ;
        p.price = price ;
        p.idx = time ;
        time ++ ;
        
        while(st.peek().price <= p.price){
            st.pop() ;
        }
        int ans = p.idx - st.peek().idx ;
        st.push(p) ;
        
        
        return ans ;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */