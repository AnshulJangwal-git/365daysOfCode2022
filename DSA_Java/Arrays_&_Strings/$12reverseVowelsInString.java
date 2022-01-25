
import java.util.*;

public class $12reverseVowelsInString {
  public static String reverseVowels(String s) {
    char[] arr = s.toCharArray() ;
    StringBuilder sb = new StringBuilder() ;

    int left = 0 ;
    int right = arr.length - 1 ;

    while(left < right){
        while(left < right && isVowel(arr, left) == false){
            left ++ ;
        }

        while(left < right && isVowel(arr, right) == false){
            right -- ;
        }

        swap(arr, left, right) ;
        left ++ ;
        right -- ;
    }

    for(int i = 0; i < arr.length; i++){
        sb.append(arr[i]) ;
    }

    return sb.toString() ;
  }

  public static void swap(char[] arr, int left, int right){
      char temp = arr[left] ;
      arr[left] = arr[right] ;
      arr[right] = temp ;
  }

  public static boolean isVowel(char[] arr, int idx){
      char ch = arr[idx] ;
      if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
        ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true ;
        }

        return false ;
  }

  // ~~~~~~~~~~~~Input Management~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    String res = reverseVowels(str);
    System.out.println(res);
  }
}

