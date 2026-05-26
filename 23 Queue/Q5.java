import java.util.*;

// Interleave 2 halves of a queue(even length)
public class Q5 {
    

    public static void interleave(Queue<Integer> q){
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        for(int i=0; i<size/2; i++) {
            firstHalf.add(q.poll());
        }
        while(!firstHalf.isEmpty()) {
            q.add(firstHalf.poll());
            q.add(q.poll());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=10; i++) {
            q.add(i);
        }
        interleave(q);
        System.out.println(q);
    }
}
