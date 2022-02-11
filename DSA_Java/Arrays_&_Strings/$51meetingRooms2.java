//Link - https://pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/meeting_room_two_official/ojquestion
import java.util.*;

public class $51meetingRooms2 {
  public static int meetingRooms(int intervals[][]) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])) ;
    PriorityQueue<Integer> pq = new PriorityQueue<>() ;
    
    for(int[] interval : intervals){
        if(pq.size() == 0){
            pq.add(interval[1]) ;
            
        }else{
            if(pq.peek() > interval[0]){
                pq.add(interval[1]) ;
                
            }else{
                pq.remove() ;
                pq.add(interval[1]) ;
            }
        }
    }
    return pq.size() ;
  }
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);

    // Input Format
    int n = scn.nextInt();
    int input[][] = new int[n][2];

    for (int i = 0 ; i <  n ; i++) {
      int sp = scn.nextInt();
      int ep = scn.nextInt();

      input[i][0] = sp;
      input[i][1] = ep;
    }

    // Output Format
    System.out.println(meetingRooms(input));
  }
}

//Method2(Cronological Order)

// import java.util.*;

// public class Main {
//   public static int meetingRooms(int intervals[][]) {
//     int[] sp = new int[intervals.length] ;
//     int[] ep = new int[intervals.length] ;
    
//     for(int i = 0; i < intervals.length; i++){
//         sp[i] = intervals[i][0] ;
//         ep[i] = intervals[i][1] ;
//     }
    
//     Arrays.sort(sp) ;
//     Arrays.sort(ep) ;
    
//     int i = 0 ;
//     int j = 0 ;
//     int roomCount = 0 ;
    
//     while(i < sp.length){
//         if(sp[i] < ep[j]){
//             roomCount ++ ;
//             i ++ ;
            
//         }else{
//             i ++ ;
//             j ++ ;
//         }
//     }
//     return roomCount ;
//   }
//   public static void main(String args[]) {
//     Scanner scn = new Scanner(System.in);

//     // Input Format
//     int n = scn.nextInt();
//     int input[][] = new int[n][2];

//     for (int i = 0 ; i <  n ; i++) {
//       int sp = scn.nextInt();
//       int ep = scn.nextInt();

//       input[i][0] = sp;
//       input[i][1] = ep;
//     }

//     // Output Format
//     System.out.println(meetingRooms(input));
//   }
// }