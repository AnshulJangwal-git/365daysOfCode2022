class $37punishTheStudents
{
    public static int shouldPunish (int roll[], int marks[], int n, double avg)
    {
        // your code here
        int countSwaps = 0 ;
        // int n = roll.length ;
    
        for(int i = 1; i <= n - 1; i++){
          for(int j = 0; j < n - i; j ++){
            if(roll[j + 1] < roll[j]){
              countSwaps += 2 ;
              int temp = roll[j] ;
              roll[j] = roll[j + 1] ;
              roll[j + 1] = temp ;
            }
          }
        }
        int oldMarksTotal = 0 ;
        for(int i = 0; i < marks.length; i++){
          oldMarksTotal += marks[i] ;
        }
        int nmarks = oldMarksTotal - countSwaps ;
        double navg = (nmarks*1d) / n ;
        
        if(navg >= avg){
            return 1 ;
            
        }else{
            return 0 ;
        }
    }
}