public class Q3 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

   public static Node swapping(Node head, int x, int y){
    if(x == y) return head;

    Node prevX = null, currX = head;
    while(currX != null && currX.data != x){
        prevX = currX;
        currX = currX.next;
    }

    Node prevY = null, currY = head;
    while(currY != null && currY.data != y){
        prevY = currY;
        currY = currY.next;
    }

    if(currX == null || currY == null) return head;

    if(prevX != null){
        prevX.next = currY;
    } else {
        head = currY;
    }

    if(prevY != null){
        prevY.next = currX;
    } else {
        head = currX;
    }

    Node temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;

    return head;
}

    public static void print(Node node){
        while(node != null){
            System.out.print(node.data + " ");
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
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.next = new Node(10);
        // print(head);

        swapping(head, 2, 5);
        print(head);
    }
}
