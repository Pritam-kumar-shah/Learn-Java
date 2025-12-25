import java.util.*;

public class palindrome {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size ;
   public void addFirst(int data){
       Node newNode = new Node(data);
       size++;
       if(head == null){
        head = tail = newNode;
        return;
       }
     newNode.next = head;
     head = newNode; 
   }

   public void addLast(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;
   }


   public void print(){
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }

       Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
   }

   public Node findMid(Node head){
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
   }

   public boolean checkPalindrome(){
    if(head == null || head.next == null){
        return true;
    }

    // Step-1 findMid
    Node midNode = findMid(head);
    

    // Step-2 reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;
    while (curr!=null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    Node right = prev; // right half head
    Node left = head;

    // Step -3 Check left half & right half
    while (right!=null) {
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
   }


//    Floyd's CFA
   public static boolean isCycle(){
    Node slow = head;
    Node fast = head;
     while (fast != null && fast.next != null) {
        slow = slow.next; //+1
        fast = fast.next.next;//+2
        if(slow == fast){
            return true;//cycle exists
        }
        
     }
     return false;//cycle doesn't exists
   }


   public static boolean  removeCycle(){
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
          cycle = true;
          break;
        }
    }
    if(cycle == false){
        return false;
    }
    slow = head;
    Node prev = null;
    while ( slow != fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }
     prev.next = null;
     return false;
   }
   public static void main(String[] args) {
    //    palindrome ll = new palindrome();
    //    ll.addFirst(2);
    //     ll.addFirst(1);
    //     ll.addLast(2);
    //     // ll.addLast(1);
    //     ll.print();
    //     System.out.println(ll.checkPalindrome());
    head = new Node(1);
    Node temp = new Node(2);
    head.next = temp;
    head.next.next = new Node(3);
    head.next.next.next = temp;
    System.out.println(isCycle());
    removeCycle();
    System.out.println(isCycle());
   }
}
