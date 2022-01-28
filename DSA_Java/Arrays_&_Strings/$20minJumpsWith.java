//Ques Link - https://nados.io/question/min-jumps-with-i-i-moves
import java.util.*;

public class $20minJumpsWith {
    // ~~~~~~~~~~~~User Section~~~~~~~~~~~
    public static int minJumps(int x) {
        int jump = 1 ;
        int sum = 0 ;

        while(sum < x){
            sum += jump ;
            jump ++ ;
        }

        int dis = sum - x ;
        if(dis % 2 == 0){ //even
            return jump - 1 ;

        }else if((sum + jump - x) % 2 == 0){ //take extra jump and if then is also even..
            return jump ;

        }else{ //if odd..
            return jump + 1 ;

        }
    }

    //~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int jumps = minJumps(x);
        System.out.println(jumps);
    }
}