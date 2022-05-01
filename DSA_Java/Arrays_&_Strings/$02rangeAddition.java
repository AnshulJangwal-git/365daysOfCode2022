//Link - https://www.lintcode.com/problem/range-addition/description

public class $02rangeAddition {
    /**
     * @param length: the length of the array
     * @param updates: update operations
     * @return: the modified array after all k operations were executed
     */
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] arr = new int[length] ;

        for(int i = 0; i < updates.length; i++){
            int si = updates[i][0] ;
            int ei = updates[i][1] ;
            int inc = updates[i][2] ;

            arr[si] += inc ;
            if(ei + 1 < length){
                arr[ei + 1] += -inc ;
            }
        }

        int[] ps = new int[arr.length] ;
        ps[0] = arr[0] ;

        for(int i = 1; i < ps.length; i++){
            ps[i] = ps[i - 1] + arr[i] ;
        }

        return ps ;
    }
}


// Brute Force Solution..
// Time Complexity - O(n * q), q = no of queries
public class solution{
    public int[] getModifiedArray2(int length, int[][] updates) {
        int[] ans = new int[length] ;
    
        for(int[] update : updates){
            int si = update[0] ;
            int ei = update[1] ;
            int inc = update[2] ;
    
            for(int i = si; i <= ei; i++){
                ans[i] = ans[i] + inc ;
            }
        }
        return ans ;
    }
}
