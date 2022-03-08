//Link - https://nados.io/question/reduce-n-to-1
import java.io.*;
import java.util.*;

public class $12Reduce1ToN {

    public static int solution(long n) {
        int ans = 0 ;
        
        while(n != 1){
            if(n % 2 == 0){
                n = n / 2 ;
                
            }else if(n == 3){
                ans = 2 ;
                break;
                
            }else if((n & 3) == 1){
                n = n - 1 ;
                
            }else if((n & 3) == 3){
                n = n + 1 ;
                
            }
            ans ++ ;
        }
        return ans ;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        System.out.println(solution(n));
    }
	
	
}