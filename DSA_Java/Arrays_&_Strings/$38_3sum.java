//Link - https://leetcode.com/problems/3sum/

import java.util.* ;
class $38_3sum {
    public List<List<Integer>> threeSum(int[] arr) {
    int target = 0 ;
    List<List<Integer>> ans = new ArrayList<>() ;
    int n = arr.length ;
    if(n < 3){
        return ans ;
    }
    
    Arrays.sort(arr) ;
    
    for(int i = 0; i <= n - 3; i++){
        // int val = arr[i] ;
        if(i != 0 && arr[i] == arr[i - 1]){
            // i ++ ;
            continue ;
        }
        int val = arr[i] ;
        int newTarget = target - val ;
        
        List<List<Integer>> subAns = twoSum(i + 1, n - 1, newTarget, arr) ;
        for(List<Integer> list : subAns){
            list.add(val) ;
            ans.add(list) ;
        }
    }
    return ans ;
  }

  public List<List<Integer>> twoSum(int si, int ei, int target, int[] arr){
    int left = si ;
    int right = ei ;
    
    // Arrays.sort(arr) ;
    List<List<Integer>> ans = new ArrayList<>() ;
    
    while(left < right){
        if(left != si && arr[left] == arr[left - 1]){
            left ++ ;
            continue ;
        }
        
        int sum = arr[left] + arr[right] ;
        if(sum > target){
            right -- ;
            
        }else if(sum < target){
            left ++ ;
            
        }else{
            List<Integer> subAns = new ArrayList<>() ;
            subAns.add(arr[left]) ;
            subAns.add(arr[right]) ;
            ans.add(subAns) ;
            
            left ++ ;
            right -- ;
        }
    }
    return ans ;
  }
}