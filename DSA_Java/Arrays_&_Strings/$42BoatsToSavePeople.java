//Leetcode 881 - https://leetcode.com/problems/boats-to-save-people/
import java.util.* ;

class $42BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people) ;
        int n = people.length ;
        
        int left = 0 ;
        int right = people.length - 1 ;
        int count = 0 ;
        
        while(left <= right){

          int sum = people[left] + people[right] ;
          if(sum <= limit){
            count ++ ;
            
            left ++ ;
            right -- ;

          }else if(sum > limit){
            count ++ ;
            right -- ;

          }
        }
        return count ;
    }
}