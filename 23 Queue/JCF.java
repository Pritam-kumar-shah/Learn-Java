import java.util.*;

public class JCF {

    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);  // [1, 2, 3, 4, 5]

        System.out.println(q.remove());  // 1
        System.out.println(q);  // [2, 3, 4, 5]

        System.out.println(q.peek());  // 2
        System.out.println(q);  // [2, 3, 4, 5]
    }
}