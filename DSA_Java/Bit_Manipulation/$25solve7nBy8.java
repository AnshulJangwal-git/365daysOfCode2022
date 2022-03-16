// Link - https://nados.io/question/solve-7n-by-8
public class $25solve7nBy8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //write your code here
        int val = (((n << 3) - n) >> 3) ;
        System.out.println(val) ;
    }
}
