// Leetcode 933 - https://leetcode.com/problems/number-of-recent-calls/
public class $36numberOfRecentCalls {
    
}

class RecentCounter {
    Queue <Integer> que ;
    public RecentCounter() {
        que = new ArrayDeque<>() ;
        
    }
    
    public int ping(int t) {
        que.add(t) ;
        int min = t - 3000 ;
        while(que.peek() < min){
            que.remove() ;
        }
        return que.size() ;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */