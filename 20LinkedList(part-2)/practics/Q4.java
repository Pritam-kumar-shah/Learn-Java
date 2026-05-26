public class Q4 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node evenOddLL(Node head){
    if(head == null) return null;

    Node evenHead = new Node(-1);
    Node oddHead = new Node(-1);

    Node even = evenHead;
    Node odd = oddHead;
    Node curr = head;

    while(curr != null){
        if(curr.data % 2 == 0){
            even.next = curr;
            even = even.next;
        } else {
            odd.next = curr;
            odd = odd.next;
        }
        curr = curr.next;
    }

    odd.next = null;

    even.next = oddHead.next;

    return evenHead.next;
}
static void print(Node node){
    while(node != null){
        System.out.print(node.data+ " ");
        node = node.next;
    }
}
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        System.out.println("Original List:");
        print(head);

        Node modifiedHead = evenOddLL(head);

        System.out.println("\nModified List:");
        print(modifiedHead);
    }
}
