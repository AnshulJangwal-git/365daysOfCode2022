// Leetcode 1389 - https://leetcode.com/problems/create-target-array-in-the-given-order/
import java.util.* ;
class $01createTargetArrayInOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        Vector<Integer> ans = new Vector<>() ;
        for(int i = 0; i < nums.length; i++){
            ans.add(index[i], nums[i]) ;
        }
        
        return Arrays.stream(ans.toArray()).mapToInt(o -> (int)o).toArray() ;
    }
}