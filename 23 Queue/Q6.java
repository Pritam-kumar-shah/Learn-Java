import java.util.*;

// reverse a queue


public class Q6 {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()) {
            s.push(q.remove());
        }

        while(!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=5; i++) {
            q.add(i);
        }
        System.out.println("Original Queue: " + q);
        reverse(q);
        System.out.println("Reversed Queue: " + q);
    }
}
