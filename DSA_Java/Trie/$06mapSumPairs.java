// Leetcode 677 - https://leetcode.com/problems/map-sum-pairs/
class MapSum {
    class Node{
        Node[] childs = new Node[26] ;
        int score ;
    }
    
    HashMap<String, Integer> map ;
    Node root ;
    public MapSum() {
        root = new Node() ;
        map = new HashMap<>() ;
    }
    
    public void insert(String key, int val) {
        int delta = val - map.getOrDefault(key, 0) ;
        map.put(key, val) ;
        Node curr = root ;
        
        for(int i = 0; i < key.length(); i++){
            char ch = key.charAt(i) ;
            if(curr.childs[ch - 'a'] == null){
                curr.childs[ch - 'a'] = new Node() ;
            }
            curr = curr.childs[ch - 'a'] ;
            curr.score += delta ;
        }
    }
    
    public int sum(String prefix) {
        Node curr = root ;
        for(int i = 0; i < prefix.length(); i++){
            char ch = prefix.charAt(i) ;
            if(curr.childs[ch - 'a'] == null){
                return 0 ;
            }
            curr = curr.childs[ch - 'a'] ;
        }
        return curr.score ;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */