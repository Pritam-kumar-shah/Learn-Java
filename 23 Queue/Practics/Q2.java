import java.util.*;
// connect n ropes with minimum cost
public class Q2 {

    static int minCost(int arr[], int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            pq.add(arr[i]);
        }

        int res = 0;
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            res += sum;
            pq.add(sum);
        }
        return res;
    }
  public static void main(String args[]){
    int arr[] = {4, 3, 2, 6};
    int n = arr.length;
    System.out.println("Minimum cost: " + minCost(arr, n));
  }   
}
