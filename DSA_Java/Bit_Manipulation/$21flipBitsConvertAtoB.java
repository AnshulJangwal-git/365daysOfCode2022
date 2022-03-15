//Link - https://nados.io/question/flip-bits-to-convert-a-to-b
import java.io.*;
import java.util.*;

public class $21flipBitsConvertAtoB  {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();

    //write your code here
    int flipped = a ^ b ;
    int count = 0 ;

    while(flipped != 0){
        int rsb = flipped & -flipped ;
        flipped -= rsb ;
        count += 1 ;
    }
    System.out.println(count) ;
  }


}
