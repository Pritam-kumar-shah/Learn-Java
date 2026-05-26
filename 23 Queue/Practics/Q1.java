import java.util.*;

// Generate binary Number 
public class Q1 {

    public static void  main(String args[]){
       Queue<String> q = new LinkedList<String>();
       q.add("1");
       int n = 10;
       while(n-- >0){
        String s1 = q.peek();
        q.remove();
        System.out.println(s1);
        String s2 = s1;
        q.add(s1 + "0");
        q.add(s2 + "1");
       }

       
    }

}
