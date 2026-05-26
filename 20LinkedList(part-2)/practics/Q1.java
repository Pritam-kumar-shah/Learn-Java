import java.util.*;

public class Q1 {

    static class Node {   // ✅ static added
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node getIntersection(Node headA, Node headB) {
        Node a = headA;
        Node b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }

    public static void main(String[] args) {

        Node common = new Node(6);
        common.next = new Node(8);
        common.next.next = new Node(9);

        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = common;

        Node headB = new Node(4);
        headB.next = new Node(5);
        headB.next.next = common;

        Node ans = getIntersection(headA, headB);

        if (ans != null)
            System.out.println("Intersection at node: " + ans.data);
        else
            System.out.println("No intersection");
    }
}