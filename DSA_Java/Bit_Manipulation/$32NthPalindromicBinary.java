// https://nados.io/question/nth-palindromic-binary

import java.io.*;
import java.util.*;

public class $NthPalindromicBinary {
    static int getRev(int n){
        int rev = 0 ;
        while(n != 0){
            int lb = (n & 1) ;
            rev |= lb ;
            rev <<= 1 ;
            n >>= 1 ;
        }

        rev >>= 1 ;
        return rev ;
    }

    public static int NthPalindromicBinary(int n) {
        //write your code here
        int len = 1 ;
        int count = 1 ;

        while(count < n){
            len ++ ;
            int elementsForLen = (1 << (len - 1) / 2) ;
            count += elementsForLen ;
        }

        count = count - (1 << (len - 1)/2) ;
        int offset = n - count - 1 ;
        int ans = (1 << (len - 1)) ;

        ans |= (offset << (len / 2)) ;
        int valFR = (ans >> (len)/2) ;
        int rev = getRev(valFR) ;

        ans |= rev ;
        return ans ;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(NthPalindromicBinary(n));
    }

}