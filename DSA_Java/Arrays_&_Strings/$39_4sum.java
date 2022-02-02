//Link - https://leetcode.com/problems/4sum/
import java.util.* ;

class $39_4sum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
      List<List<Integer>> ans = new ArrayList<>() ;
      int n = nums.length ;
      if (n < 4) {
        return ans ;
      }
  
      Arrays.sort(nums) ;
  
      for (int i = 0; i <= n - 4; i++) {
        if (i != 0 && nums[i] == nums[i - 1]) {
          continue ;
        }
  
        int val1 = nums[i] ;
        int netTarget = target - val1 ;
        List<List<Integer>> subAns = threeSum(nums, i + 1, netTarget) ;
  
        for (List<Integer> list : subAns) {
          list.add(val1) ;
          ans.add(list) ;
        }
      }
  
      return ans ;
    }
  
   public List<List<Integer>> threeSum(int[] arr, int si, int target) {
      List<List<Integer>> ans = new ArrayList<>() ;
      int n = arr.length ;
      if(n - si < 3){
          return ans ;
      }
      
      // Arrays.sort(arr) ;
      
      for(int i = si; i <= n - 3; i++){
          // int val = arr[i] ;
          if(i != si && arr[i] == arr[i - 1]){
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