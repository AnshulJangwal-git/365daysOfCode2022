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







