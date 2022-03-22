// Leetcode 636 - https://leetcode.com/problems/exclusive-time-of-functions/
class $21exclusiveTimeOfFunction {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] timeF = new int[n] ;
        Stack<Pair> st = new Stack<>() ;
        
        for(int i = 0; i < logs.size(); i++){
            String[] log = logs.get(i).split(":") ;
            
            if(log[1].equals("start")){
                Pair p = new Pair() ;
                p.id = Integer.parseInt(log[0]) ;
                p.st = Integer.parseInt(log[2]) ;
                p.ct = 0 ;
                st.push(p) ;
                
            }else{
                Pair p = st.pop() ;
                int interval = Integer.parseInt(log[2]) - p.st + 1 ;
                int time = interval - p.ct ;
                timeF[p.id] += time ;
                
                if(st.size() > 0){
                    st.peek().ct += interval ;
                }
            }
        }
        
        return timeF ;
    }
    
    static class Pair{
        int id ;
        int st ; //startingTime
        int ct ; //childTime
    }
}