// Leetcode 946 - https://leetcode.com/problems/validate-stack-sequences/
class $14validateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>() ;
        int j = 0 ;
        for(int val : pushed){
            st.push(val) ;
            // int j = 0 ;
            while(st.size() != 0 && st.peek() == popped[j]){
                st.pop() ;
                j ++ ;
            }
        }
        return j == popped.length ;
    }
}
