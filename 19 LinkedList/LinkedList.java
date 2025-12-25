import java.util.*;

public class LinkedList {
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

   public void add(int idx, int data){
    if(idx == 0){
        addFirst(data);
        return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i=0;
    while (i<idx-1) {
        temp = temp.next;
        i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
    
   }

   public int removeFirst()  
   {
    if(size == 0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size == 1){
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
   }

   public int removeLast(){
    if (size == 0) {
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size == 1){
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }

    Node prev = head;
    for(int i=0; i<size-2; i++){
        prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;

   }

   public int itrSearch(int key){
    Node temp = head;
    int i=0;
    while (temp!=null) {
        if (temp.data == key) {
            return i;
        }
        temp=temp.next;
        i++;
    }
    return -1;
   }

   public int helper(Node head, int key){
     if(head == null){
        return -1;
     }
     if (head.data == key) {
        return 0;
     }
     int idx = helper(head.next, key);
     if(idx == -1){
        return -1;
     }
     return idx+1;
   }
   public int recSearch(int key){
    return helper(head, key);
   }

   public void reverse(){
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head=prev;
   }
   public void deleteNthFromEnd(int n){
    int sz = 0;
    Node temp = head;
    while (temp != null) {
        temp = temp.next;
        sz++;
    }

    if(n == sz){
        head = head.next;
    }
    int i=1;
    int iToFind = sz-n;
    Node prev = head;
    while (i<iToFind) {
        prev = prev.next;
        i++;
    }
    prev.next = prev.next.next;
    return;
   }

   public static boolean removeCycle(){
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
       while (slow != fast) {
           slow = slow.next;
           fast = fast.next;
       }
       // Now slow is at the start of the cycle
       Node temp = head;
       while (temp.next != slow) {
           temp = temp.next;
       }
       temp.next = null;
       return true;
     }

   public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.add(2, 9);
        ll.addLast(4);
        ll.print();
        ll.reverse();
        ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        ll.deleteNthFromEnd(3);
        ll.print();
        ll.deleteNthFromEnd(1);
        ll.print();
        
        // System.out.println(ll.recSearch(9));
        // System.out.println(ll.itrSearch(5));
        // System.out.println(ll.size);
    }
}
