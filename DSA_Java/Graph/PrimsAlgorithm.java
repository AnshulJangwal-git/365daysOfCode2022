import java.io.*;
import java.util.*;

public class PrimsAlgorithm {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }
      primsAlgorithm(graph) ;
   }

   public static void primsAlgorithm(ArrayList<Edge> graph[]){
    PriorityQueue<Pair> pq = new PriorityQueue<>() ;
    pq.add(new Pair(0, -1, 0)) ;

    boolean visited[] = new boolean[graph.length] ;
    while(pq.size() > 0){
        Pair rem = pq.remove() ;
        if(visited[rem.v] == true){
            continue ;
        }

        visited[rem.v] = true ;
        if(rem.av != -1){
            System.out.println("[" + rem.v + "-" + rem.av + "@" + rem.wsf + "]") ;
        }

        for(Edge e : graph[rem.v]){
            if(visited[e.nbr] == false){
                pq.add(new Pair(e.nbr, rem.v, e.wt)) ;
            }
        }
    }
   }

   static class Pair implements Comparable<Pair> {
       int v ;
       int av ;
       int wsf ;

       Pair(int v, int av, int wsf){
           this.v = v ;
           this.av = av ;
           this.wsf = wsf ;
       }

       public int compareTo(Pair o){
           return this.wsf - o.wsf ;
       }
   }

}
