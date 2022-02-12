//Leetcode 57 - https://leetcode.com/problems/insert-interval/
import java.util.* ;
class $53insertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>() ;
        int n = intervals.length ;
        
        int idx = 0 ;
        while(idx < n){
            if(intervals[idx][0] < newInterval[0]){
                ans.add(intervals[idx]) ;
                idx ++ ;
                
            }else{
                break ;
            }
        }
        
        if(ans.size() == 0 || ans.get(ans.size() -1)[1] < newInterval[0]){
            ans.add(newInterval) ;
            
        }else{
            int lastInterval[] = ans.get(ans.size() - 1) ;
            lastInterval[1] = Math.max(lastInterval[1], newInterval[1]) ;
            
        }
        
        while(idx < n){
            int lastInterval[] = ans.get(ans.size() - 1) ;
            if(lastInterval[1] >= intervals[idx][0]){
                lastInterval[1] = Math.max(lastInterval[1], intervals[idx][1]) ;
                
            }else{
                ans.add(intervals[idx]) ;
                
            }
            idx ++ ;
        }
        return ans.toArray(new int[ans.size()][]) ;
    }
}