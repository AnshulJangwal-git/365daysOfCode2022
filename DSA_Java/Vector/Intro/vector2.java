import java.util.* ;
import java.lang.* ;


public class vector2 {
    public static void main(String[] args){
        Vector v = new Vector() ;

        //add(int index, object element)
        v.add(0, "Anshul Jangwal") ;
        v.add(1, 1) ;
        v.add(2, "B.tech") ;
        v.add(3, 2) ;
        // System.out.println("Vector is -> " + v) ;
        // Vector is -> [Anshul Jangwal, 1, B.tech, 2] // size = 4

        v.add(1, "VIT") ;

        // System.out.println("Vector is -> " + v) ;
        // Vector is -> [Anshul Jangwal, VIT, 1, B.tech, 2]  //size = 5

        // System.out.println("size is " + v.size()) ;

        // System.out.println(v.firstElement()) ;

        // System.out.println(v.get(1)) ;
        String s = v.toString() ;
        System.out.println(s) ;

        Object[] arr = v.toArray() ;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]) ;
        }

    }
}
