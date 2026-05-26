// check if a linkedlist is palidrome or not
import java.util.*;
public class Q1 {
    static class Node{
        int data;
        Node next;
         Node(int data){
            this.data = data;
            this.next = null;
         }
    }

    public static boolean isPalidrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        // find mid
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse second half
        Node prev = null;
        Node curr = slow;
        while( curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // Compare both values
        Node right = prev;
        Node left = head;
        while(right != null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;

    }

    // stack
    public static boolean palidrome(Node head){
        Stack<Integer> s = new Stack<>();
        Node temp = head;

        // push all element in stack
        while(temp != null){
            s.push(temp.data);
            temp = temp.next;
        }

        // comapre all elemeny in stack
        while(head != null){
            int i = s.pop();
            if(head.data != i){
                return false;
            }
            head = head.next;
        }
       return true;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        System.out.println(palidrome(head));
    }
}
