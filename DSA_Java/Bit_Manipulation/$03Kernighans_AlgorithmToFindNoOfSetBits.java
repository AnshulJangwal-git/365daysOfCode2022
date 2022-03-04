//Link - https://practice.geeksforgeeks.org/problems/set-bits0143/1/#
class $03Kernighans_AlgorithmToFindNoOfSetBits {
    static int setBits(int N) {
        // code here
        int counter = 0 ;
        
        while(N != 0){
            int rsbm = N & -N ;
            N -= rsbm ;
            counter ++ ;
        }
        return counter ;
    }
}
