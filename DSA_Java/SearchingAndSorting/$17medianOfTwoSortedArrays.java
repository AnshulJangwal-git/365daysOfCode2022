//Leetcode 4 - https://leetcode.com/problems/median-of-two-sorted-arrays/
class $17medianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[] = new int[nums1.length + nums2.length] ;
        int length = merged.length ;
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                merged[k] = nums1[i] ;
                i ++ ;
                k ++ ;
                
            }else{
                merged[k] = nums2[j] ;
                j ++ ;
                k ++ ;
            }
        }
        
        while(i < nums1.length){
            merged[k] = nums1[i] ;
            i ++ ;
            k ++ ;
        }
        
        while(j < nums2.length){
            merged[k] = nums2[j] ;
            j ++ ;
            k ++ ;
        }
        double median = 0.0 ;
        int mid = length / 2 ;
        
        if(length % 2 == 1){
            median = merged[mid] ;
            
        }else{
            median = (merged[mid] + merged[mid - 1]) / 2.0 ;
            
        }
        return median ;
    }
}

//Optimized Approach..
// import java.util.* ;
// import java.io.* ;

// public class Main {

//     public static double find(int[]a,int[]b) {
//         if(a.length > b.length){
//             int temp[] = a ;
//             a = b ;
//             b = temp ;
//         }

//         int lo = 0 ;
//         int hi = a.length ;
//         int te = a.length + b.length ;

//         while(lo <= hi){
//             int aleft = (lo + hi) / 2 ;
//             int bleft = (te + 1) / 2 - aleft ;

//             int alm1 = (aleft == 0) ? Integer.MIN_VALUE : a[aleft - 1] ;
//             int al = (aleft == a.length) ? Integer.MAX_VALUE : a[aleft] ;
//             int blm1 = (bleft == 0) ? Integer.MIN_VALUE : b[bleft - 1] ;
//             int bl = (bleft == b.length) ? Integer.MAX_VALUE : b[bleft] ;

//             //check valid segregation...
//             if(alm1 <= bl && blm1 <= al){
//                 double median = 0.0 ;
                
//                 if(te % 2 == 0){
//                     int lmax = Math.max(alm1, blm1) ;
//                     int rmin = Math.min(al, bl) ;
//                     median = (lmax + rmin) / 2.0 ;
//                 }else{
//                     int lmax = Math.max(alm1, blm1) ;
//                     median = lmax ;
//                 }
//                 return median ;

//             }else if(alm1 > bl){
//                 hi = aleft - 1 ;

//             }else if(blm1 > al){
//                 lo = aleft + 1 ;

//             }
//         }
//         return 0 ;
//     }

//     public static void main(String[]args) {
//         Scanner scn = new Scanner(System.in);

//         //input work
//         int n1 = scn.nextInt();
//         int[]a = new int[n1];

//         for(int i=0;i < n1;i++){
//             a[i] = scn.nextInt();
//         }

//         int n2 = scn.nextInt();
//         int[]b = new int[n2];

//         for(int i=0; i < n2;i++) {
//             b[i] = scn.nextInt();
//         }

//         double median = find(a,b);
//         System.out.println(median);
//     }
// }







