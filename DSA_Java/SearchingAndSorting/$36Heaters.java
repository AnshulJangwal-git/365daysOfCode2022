//Leetcode 475 - https://leetcode.com/problems/heaters/
class $36Heater {
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
