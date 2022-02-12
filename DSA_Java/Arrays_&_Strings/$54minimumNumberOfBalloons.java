import java.util.* ;
class $54minimumNumberOfBalloons {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0){
            return 0 ;
            
        }else if(points.length == 1){
            return 1 ;
        }
        
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1])) ;
        int arrows = 1 ;
        int ep = points[0][1] ;
        
        for(int i = 0; i < points.length; i++){
            if(points[i][0] > ep){
                arrows ++ ;
                ep = points[i][1] ;
                
            }
        }
        return arrows ;
    }
}