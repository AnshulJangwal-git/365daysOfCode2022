
import java.io.*;
import java.util.*;

public class $05powerLinear {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in) ;
        int x = sc.nextInt() ;
        int n = sc.nextInt() ;
        
        int pn = power(x, n) ;
        System.out.println(pn) ;
    }

    public static int power(int x, int n){
        if(n == 0) return 1 ;
        
        int pn1 = power(x, n - 1) ;
        int pn = x * pn1 ;
        return pn ;
    }

}
