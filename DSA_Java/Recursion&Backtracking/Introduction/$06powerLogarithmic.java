import java.io.*;
import java.util.*;

public class $06powerLogarithmic {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        int x = sc.nextInt() ;
        int n = sc.nextInt() ;
        
        int pn = power(x, n) ;
        System.out.println(pn) ;
        
    }

    public static int power(int x, int n){
        if(n == 0) return 1 ;
        
        int pnb2 = power(x, n / 2) ;
        int pn = 1 ;
        
        if(n % 2 == 0){
            pn = pnb2 * pnb2 ;
            
        }else{
            pn = pnb2 * pnb2 * x ;
        }
        
        return pn ;
    }

}