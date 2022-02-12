//Leetcode 56 - https://leetcode.com/problems/merge-intervals/
import java.util.* ;

class $48mergeIntervals {
    public int[][] merge(int[][] intervals) {
        //sorting of two arrays by comparing their zero idx
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])) ;
        
        List<int[]> list = new ArrayList<>() ;
        
        for(int[] interval : intervals){
            if(list.size() == 0){
                list.add(interval) ;
                
            }else{
                int[] prevInterval = list.get(list.size() - 1) ;
                if(prevInterval[1] >= interval[0]){
                    prevInterval[1] = Math.max(interval[1], prevInterval[1]) ;
                    
                }else{
                    list.add(interval) ;
                }
            }
        }
        return list.toArray(new int[list.size()][]) ;
    }
}