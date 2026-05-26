
import java.util.*;
public class Deq {
    class Stack{
        Deque<Integer> dq = new LinkedList<>();

        public void push(int data) {
            dq.addFirst(data);
        }

        public int pop() {
            if(dq.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.removeFirst();
        }

        public int peek() {
            if(dq.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.peekFirst();
        }
    }

    static class Queue {
        Deque<Integer> dq = new LinkedList<>();

        public void add(int data) {
            dq.addLast(data);
        }

        public int remove() {
            if(dq.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return dq.removeFirst();
        }

        public int peek() {
            if(dq.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return dq.peekFirst();
        }
    }            
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        System.out.println(dq);
        dq.addLast(2);
        System.out.println(dq);
    }
}
