//Ques Link - https://nados.io/question/majority-element-general
import java.util.*;

public class $09majorityElementsGeneral {
    
    //~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~
    static HashMap<Integer, Integer> map ;
    static ArrayList<Integer> ans ;
    
    public static ArrayList<Integer> majorityElement(int[] arr, int k) {
        map = new HashMap<>() ;
        ans = new ArrayList<>() ;
        
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1) ;
        }
        
        for(int key : map.keySet()){
            if(map.get(key) > arr.length / k){
                ans.add(key) ;
            }
        }
        
        Collections.sort(ans) ;
        return ans ;
    }
    
    //~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        ArrayList<Integer> res = majorityElement(arr, k);
        System.out.println(res);
    }
}
