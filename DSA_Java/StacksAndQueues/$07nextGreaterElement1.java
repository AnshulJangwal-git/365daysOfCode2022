// Link - https://leetcode.com/problems/next-greater-element-i/

class $07nextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>() ;
        int[] nge = nextGreaterRight(nums2) ;
        
        for(int i = 0; i < nums2.length; i++){
            map.put(nums2[i], nge[i]) ;
        }
        int[] ans = new int[nums1.length] ;
        for(int i = 0; i < nums1.length; i++){
            ans[i] = map.getOrDefault(nums1[i], -1) ;
        }
        return ans ;
    }
    
    public static int[] nextGreaterRight(int[] arr){
        int[] nge = new int[arr.length] ;
        Stack<Integer> st = new Stack<>() ;
        st.push(0) ;
        
        for(int i = 1; i < arr.length; i++){
            while(st.size() > 0 && arr[i] > arr[st.peek()]){
                int pos = st.peek() ;
                nge[pos] = arr[i] ;
                st.pop() ;
            }
            st.push(i) ;
        }
        while(st.size() > 0){
            int pos = st.peek() ;
            nge[pos] = -1 ;
            st.pop() ;
        }
        
        return nge ;
    }
}