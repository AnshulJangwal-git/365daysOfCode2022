//Link - https://nados.io/question/best-meeting-point
import java.util.*;

public class $22BestMeetingPoint {

    // ~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~
    public static int minTotalDistance(int[][] arr) {
        ArrayList<Integer> xList = new ArrayList<>() ;
        for(int r = 0; r < arr.length; r ++){
            for(int c = 0; c < arr[0].length; c ++){
                if(arr[r][c] == 1){
                    xList.add(r) ;
                }
            }
        }

        ArrayList<Integer> yList = new ArrayList<>() ;
        for(int c = 0; c < arr[0].length; c++){
            for(int r = 0; r < arr.length; r ++){
                if(arr[r][c] == 1){
                    yList.add(c) ;
                }
            }
        }

        int x = xList.get(xList.size() / 2) ;
        int y = yList.get(yList.size() / 2) ;

        //calculate distance 
        int dist = 0 ;
        for(int xval : xList){
            dist += Math.abs(x - xval) ;
        }

        for(int yval : yList){
            dist += Math.abs(y - yval) ;
        }

        return dist ;
    }

    // ~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();


        int[][] grid = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                grid[i][j] = scn.nextInt();
            }
        }

        int dist = minTotalDistance(grid);
        System.out.println(dist);
    }
}