import java.util.LinkedList;
public class LLCF {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    public static Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null){
            if (head1.data<=head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
               temp.next = head2;
                head2 = head2.next;
                temp = temp.next; 
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // Left && right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft,newRight);
    }

    public static void printLL(Node head){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}
    public static void main(String[] args) {
        // create 
    //    LinkedList<Integer> ll = new LinkedList<>();

    //     //add
    //    ll.addLast(1);
    //    ll.addLast(2);
    //    ll.addFirst(0);
    //    ll.addFirst(4);
    //    ll.addFirst(9);
    //    ll.addFirst(7);
       //0->1->2
       
        //remove
        // ll.remove(0);
        //  System.out.println(ll);
         Node head = new Node(4);
    head.next = new Node(2);
    head.next.next = new Node(1);
    head.next.next.next = new Node(3);
printLL(head);
    head = mergeSort(head);
    printLL(head);
    }
}
