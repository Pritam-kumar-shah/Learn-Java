import java.util.*;

public class Q4 {
    public static Queue<Integer> reverseK(Queue<Integer> q, int k){
        if(q == null || k>q.size() || k<= 0){
            return q;
        }

        Stack<Integer> s = new Stack<>();

        for(int i=0; i<k; i++){
            s.push(q.poll());
        }

        while(!s.isEmpty()){
            q.offer(s.pop());
        }

        int size = q.size();

        for(int i=0; i<size-k; i++){
            q.offer(q.poll());
        }
        return q;

    }
    public static void main(String[] args) {
       int arr[] = {10,20,30,40,50,60,70,80,90,100};
       int k = 5;
       Queue<Integer> q = new LinkedList<>();

       for(int num : arr){
        q.offer(num);
       }

       q = reverseK(q, k);
       System.out.println("Reversed Queue: " + q);
    }
}
