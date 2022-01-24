// import java.util.* ;
// import java.io.* ;

import java.util.* ;
import java.io.* ;

public class Main {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in) ;
        Integer arr[] = {3, 4, 3, 13, 21, 4, 27, 56, 54, 54, 13, 22, 89, 98, 101, -4, -12, -1, 0, -1, -2, 0, -4, -13, -11, -12, -12, 9, 0, -7} ;
        int n = arr.length ;

        //lambda function...(Sorting on the basis of absolute values)
        Arrays.sort(arr, (a, b) -> {
            return Math.abs(a) - Math.abs(b) ;
        }) ;
        // System.out.println(arr) ;

        HashMap<Integer, Integer> map = new HashMap<>() ;
        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0) + 1) ;
        }

        ArrayList<Integer> list = new ArrayList<>() ;
        for(int value : map.values()){
            list.add(value) ;
        }

        System.out.println(map) ;
        System.out.println(list) ;

        HashSet<Integer> set = new HashSet<>() ;
        for(int i = 0; i < n; i++){
            set.add(arr[i]) ;
        }

        for(int val : set){
            System.out.println(val) ;
        }
        System.out.println(set) ;




    }






}


