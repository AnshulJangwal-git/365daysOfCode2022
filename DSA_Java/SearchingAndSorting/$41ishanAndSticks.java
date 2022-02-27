//Link - https://practice.geeksforgeeks.org/problems/ishaan-and-sticks0542/1#
import java.util.* ;
//Method1 - Using HashMap
class $41ishanAndSticks{
    
    // Function for finding maximum and value pair
    public static ArrayList<Integer> square (int arr[], int n) {
        //Complete the function
        ArrayList<Integer> list = new ArrayList<>() ;

        HashMap<Integer, Integer> map = new HashMap<>() ;
        for(int val : arr){
          map.put(val, map.getOrDefault(val, 0) + 1) ;
        }
        int sideCount = 0 ;
        int maxSide = 0 ;
    
        for(int key : map.keySet()){
          if(map.getOrDefault(key, 0) >= 4){
            maxSide = Math.max(maxSide, key) ;
          }
    
          sideCount = map.getOrDefault(maxSide, 0) ;
        }
        if(maxSide == 0){
          list.add(-1) ;
          return list ;
        }
        
        list.add(maxSide * maxSide) ;
        list.add(sideCount / 4) ;
        
        return list ;
    }
    
}


