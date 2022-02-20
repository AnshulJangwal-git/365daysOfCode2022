//Leetcode 658 - https://leetcode.com/problems/find-k-closest-elements/
import java.util.* ;
class $07findKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>() ;
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        
        for(int i = 0; i < arr.length; i++){
            if(pq.size() < k){
                pq.add(new Pair(arr[i], Math.abs(arr[i] - x))) ;
                
            }else{
                if(pq.peek().gap > Math.abs(arr[i] - x)){
                    pq.remove() ;
                    pq.add(new Pair(arr[i], Math.abs(arr[i] - x))) ;
                }
            }
        }
        while(pq.size() > 0){
                Pair rem = pq.remove() ;
                list.add(rem.val) ;
            }
            Collections.sort(list) ;
            return list ;
    }
    public class Pair implements Comparable<Pair> {
        int val ;
        int gap ;
        
        Pair(){
            
        }
        
        Pair(int val, int gap){
            this.val = val ;
            this.gap = gap ;
        }
        
        public int compareTo(Pair o){
            if(this.gap == o.gap){
                return this.val - o.val ;
                
            }else{
                return this.gap - o.gap ;
                
            }
        }
    }

    //Optimised Approach using binarySearch
public static ArrayList<Integer> findClosest2(int[]arr,int k,int x) {
    int lo = 0 ;
    int hi = arr.length - 1 ;
    int mid = 0 ;
    
    while(lo <= hi){
        mid = (lo + hi) / 2 ;
        if(arr[mid] == x){
            break ;
            
        }else if(arr[mid] < x){
            lo = mid + 1 ;
            
        }else{
            hi = mid - 1 ;
            
        }
    }
    int left = mid - 1 ;
    int right = mid ;
    ArrayList<Integer> list = new ArrayList<>() ;
    
    while(left >= 0 && right < arr.length && k > 0){
        if(Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)){
            list.add(arr[left]) ;
            left -- ;
            
        }else{
            list.add(arr[right]) ;
            right ++ ;
            
        }
        k -- ;
    }
    while(k > 0 && left >= 0){
        list.add(arr[left]) ;
        left -- ;
        k -- ;
    }
    
    while(k > 0 && right < arr.length){
        list.add(arr[right]) ;
        right ++ ;
        k -- ;
    }
    
    Collections.sort(list) ;
    return list ;
}

}
