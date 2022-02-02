//Link - https://nados.io/question/2-sum-target-sum-unique-pairs
import java.util.*;

public class $37_2sumUniquePairsSumEqualsTarget {
  // ~~~~~~~~~~~~User Section~~~~~~~~~~~~
  public static List<List<Integer>> twoSum(int[] arr, int target) {
    List<List<Integer>> ans = new ArrayList<>() ;
    
    Arrays.sort(arr) ;
    int left = 0 ;
    int right = arr.length - 1 ;
    
    while(left < right){
        if(left > 0 && arr[left] == arr[left - 1]){
            left ++ ;
            continue ;
        }
        
        // if(right < arr.length - 1 && arr[right] == arr[right + 1]){
        //     right -- ;
        //     continue ;
        // }
        
        
        int sum = arr[left] + arr[right] ;
        if(sum > target){
            right -- ;
            
        }else if(sum < target){
            left ++ ;
            
        }else{
            // List<Integer> list = new ArrayList<>() ;
            // list.add(arr[left]) ;
            // list.add(arr[right]) ;
            ans.add(Arrays.asList(arr[left], arr[right])) ;
            
            left ++ ;
            right -- ;
        }
    }
    return ans ;
  }

  // ~~~~~~~~~~Input Management~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    List<List<Integer>> res = twoSum(arr, target);
    ArrayList<String> finalResult = new ArrayList<>();
    for (List<Integer> list : res) {
      Collections.sort(list);
      String ans = "";
      for (int val : list) {
        ans += val + " ";
      }
      finalResult.add(ans);
    }
    Collections.sort(finalResult);
    for (String str : finalResult) {
      System.out.println(str);
    }
  }
}