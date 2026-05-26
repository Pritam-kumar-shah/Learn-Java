import java.util.*;
// Maximum of all subarray of size k
public class Q5 {

    public static void maxOfSubarray(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for(int i=0; i<arr.length; i++){
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                dq.pollLast();
            }

            dq.offerLast(i);
            if(i >= k-1){
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 1,4, 5, 2,3,6};
        int k = 3;
        maxOfSubarray(arr, k);
    }
}
