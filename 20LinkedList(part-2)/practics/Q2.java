 public class Q2 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
  public static void deleteNAfterM(Node head, int m, int n){
    Node curr = head;

    while(curr != null){

        // 🔹 Skip M nodes
        for(int i = 1; i < m && curr != null; i++){
            curr = curr.next;
        }

        if(curr == null) return;

        // 🔹 Start deleting N nodes
        Node temp = curr.next;

        for(int i = 1; i <= n && temp != null; i++){
            temp = temp.next;
        }

        // 🔹 Link after deleting
        curr.next = temp;

        // 🔹 Move forward
        curr = temp;
    }
}
    public static void print(Node node){
        while(node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next.next = new Node(10);
        
        print(head);
        deleteNAfterM(head, 3, 2);
        System.out.println();
        print(head);
    }


}
