//Leetcode 475 - https://leetcode.com/problems/heaters/
import java.util.* ;
class $36Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        int maxRadii = 0 ;
        
       for(int i = 0; i < houses.length; i++){
           int house = houses[i] ;
           int radii = closerHeater(house, heaters) ;
           
           if(radii > maxRadii){
               maxRadii = radii ;
           }
       }
        return maxRadii ;
    }
    public int closerHeater(int house, int[] heaters){
        int minRadii = Integer.MAX_VALUE ;
        
        for(int val : heaters){
            int diff = Math.abs(val - house) ;
            if(minRadii > diff){
                minRadii = diff ;
            }    
        }
        return minRadii ;
    }
}

//Method2
//Using Binary Search
// class Solution {
//     public Pair binarySearch(int hp, int[] heaters){
//         int lo = 0 ;
//         int hi = heaters.length - 1 ;
//         Pair p = new Pair() ;
        
//         while(lo <= hi){
//             int mid = (lo + hi) / 2 ;
//             if(heaters[mid] == hp){
//                 p.js = heaters[mid] ;
//                 p.jl = heaters[mid] ;
//                 break ;
//             }else if(heaters[mid] < hp){
//                 p.js = heaters[mid] ;
//                 lo = mid + 1 ;
                
//             }else{
//                 p.jl  = heaters[mid] ;
//                 hi = mid - 1 ;
//             }
//         }
//         return p ;
//     }
    
//     public int findRadius(int[] houses, int[] heaters) {
//         Arrays.sort(heaters) ;
//         int ans = 0 ;
//         for(int i = 0; i < houses.length; i++){
//             int hp = houses[i] ;
//             Pair p = binarySearch(hp, heaters) ;
            
//             int d1 = (p.js == -1) ? Integer.MAX_VALUE : hp - p.js ;
//             int d2 = (p.jl == -1) ? Integer.MAX_VALUE : p.jl - hp ;
            
//             int dis = Math.min(d1, d2) ;
//             if(dis > ans){
//                 ans = dis ;
//             }
//         }
//         return ans ;
//     }
//     class Pair{
//         int js = -1 ; //just smaller
//         int jl = -1 ; //just larger
        
//         Pair(){
            
//         }
        
//         Pair(int js, int jl){
//             this.js = js ;
//             this.jl = jl ;
//         }
//     }
// }