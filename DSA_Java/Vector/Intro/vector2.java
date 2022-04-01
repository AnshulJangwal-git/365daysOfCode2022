import java.util.* ;

public class vector2 {
    public static void main(String[] args){
        Vector v = new Vector() ;

        //add(int index, object element)
        v.add(0, "Anshul Jangwal") ;
        v.add(1, 1) ;
        v.add(2, "B.tech") ;
        v.add(3, 2) ;
        System.out.println("Vector is -> " + v) ;
        // Vector is -> [Anshul Jangwal, 1, B.tech, 2] // size = 4

        v.add(1, "VIT") ;

        System.out.println("Vector is -> " + v) ;
        // Vector is -> [Anshul Jangwal, VIT, 1, B.tech, 2]  //size = 5
    }
}
