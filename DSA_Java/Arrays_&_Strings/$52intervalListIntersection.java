//Leetcode 986 - https://leetcode.com/problems/interval-list-intersections/
import java.util.* ;
class $52intervalListIntersection {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList.length == 0 || secondList.length == 0){
            return new int[0][0] ;
        }
        List<int[]> ans = new ArrayList<>() ;
        int ptr1 = 0 ;
        int ptr2 = 0 ;
        
        while(ptr1 < firstList.length && ptr2 < secondList.length){
            int csp = Math.max(firstList[ptr1][0], secondList[ptr2][0]) ;
            int cep = Math.min(firstList[ptr1][1], secondList[ptr2][1]) ;
            
            if(csp <= cep){
                int[] interval = {csp, cep} ;
                ans.add(interval) ;
            }
            
            if(firstList[ptr1][1] < secondList[ptr2][1]){
                ptr1 ++ ;
                
            }else{
                ptr2 ++ ;
                
            }
        }
        return ans.toArray(new int[ans.size()][]) ;
    }
}