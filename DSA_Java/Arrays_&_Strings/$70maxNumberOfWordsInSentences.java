// Leetcode 2114 - https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
class $70maxNumberOfWordsInSentences {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE ;
        
        for(String sentence : sentences){
            String str[] = sentence.split(" ") ;
            int len = str.length ;
            max = Math.max(len, max) ;
        }
        
        return max ;
    }
}