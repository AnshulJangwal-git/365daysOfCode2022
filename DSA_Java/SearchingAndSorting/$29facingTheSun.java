//Link - https://practice.geeksforgeeks.org/problems/buildings-receiving-sunlight3032/1/#
class $29facingTheSun {

    public static int longest(int arr[],int n)
    {
        int max = arr[0] ;
        int count = 1 ;
        
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] >= max){
                max = arr[i] ;
                count ++ ;
            }
        }
        return count ;
    }
}
