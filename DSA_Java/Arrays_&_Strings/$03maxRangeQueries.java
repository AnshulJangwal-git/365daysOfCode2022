import java.util.* ;

public class $03maxRangeQueries {
    public static void main(String[] args){
        int length = 8 ;
        int[] a = new int[length] ;

        int[][] queries = {{1, 5}, {2, 7}, {0, 3}, {6, 7}} ;
        int k = 2 ;

        int[] arr = rangeAddition(a, queries) ;

        int[] kc = new int[length] ;
        int[] kp1c = new int[length] ;

        // if(arr[0] == k){
        //     kc[0] = 1 ;
        // }else{
        //     kc[0] = 0 ;
        // }

        kc[0] = arr[0] == k ? 1 : 0 ;

        // if(arr[0] == k + 1){
        //     kp1c[0] = 1 ;

        // }else{
        //     kp1c[0] = 0 ;

        // }

        kp1c[0] = arr[0] == k + 1 ? 1 : 0 ;
        
        for(int i = 1; i < length; i++){
            if(arr[i] == k){
                kc[i] = kc[i - 1] + 1 ;

            }else{
                kc[i] = kc[i - 1] ;
            }

            if(arr[i] == k + 1){
                kp1c[i] = kp1c[i - 1] + 1 ;

            }else{
                kp1c[i] = kp1c[i - 1] ;

            }
        }

        int[] ans = new int[2] ;
            int maxK = 0 ;
            int total = kc[length - 1] ;

            for(int q = 0; q < queries.length; q++){
                int si = queries[q][0] ;
                int ei = queries[q][1] ;

                int siToeik = kc[ei] - (si == 0 ? 0 : kc[si - 1]) ;
                int siToKp1 = kp1c[ei] - (si == 0 ? 0 : kp1c[si - 1]) ;

                int totalK = total - siToeik + siToKp1 ; // k's count bw L -> R

                if(maxK < totalK){
                    maxK = totalK ;
                    ans[0] = si ;
                    ans[1] = ei ;
                }
            }
            System.out.println("query " + ans[0] +  " -> " + ans[1]) ;
            System.out.println(maxK) ;
    }

    public static int[] rangeAddition(int[] a, int[][] updates){

        for(int i = 0; i < updates.length; i++){
            int si = updates[i][0] ;
            int ei = updates[i][1] ;
            int inc = 1 ;

            a[si] += inc ;
            if(ei + 1 < a.length){
                a[ei] += -inc ;
            }
        }

        int[] ps = new int[a.length] ;
        ps[0] = a[0] ;
        for(int i = 1; i < ps.length; i++){
            ps[i] = ps[i - 1] + a[i] ;
        }
        
        return ps ;
    }


}


