//Link - https://nados.io/question/k-sum-target-sum-unique-set
import java.util.*;

public class $40_Ksum {

  public static List<List<Integer>> kSum(int[] arr, int target, int k) {
    Arrays.sort(arr) ;
    return kSumHelper(arr, target, k, 0) ;
  }
  
  
  
  public static List<List<Integer>> kSumHelper(int[] arr, int target, int k, int si){
    if(k == 2){
        return twoSum(arr, target, si) ;
    }
    
    int n = arr.length ;
    List<List<Integer>> ans = new ArrayList<>() ;
    if(n - si < k){
        return ans ;
    }
    
    for(int i = si; i <= n - k; i++){
        if(i != si && arr[i] == arr[i - 1]){
            continue ;
        }
        
        int val1 = arr[i] ;
        int newTarget = target - val1 ;
        List<List<Integer>> subAns = kSumHelper(arr, newTarget, k - 1, i + 1) ;
        
        for(List<Integer> list : subAns){
            list.add(val1) ;
            ans.add(list) ;
        }
    }
    return ans ;
  }
  
  public static List<List<Integer>> twoSum(int[] arr, int target, int si){
    int n = arr.length ;
    List<List<Integer>> ans = new ArrayList<>() ;
    if(n - si < 2){
        return ans ;
    }
    
    int left = si ;
    int right = n - 1 ;
    
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

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    int k = scn.nextInt();
    List<List<Integer>> res = kSum(arr, target, k);
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
