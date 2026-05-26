import java.util.Stack;

public class HeightInHistogram {
   public static void maxArea(int arr[]){
    int maxArea = 0;
     int n = arr.length;
     int nsl[] = new int[n];
     int nsr[] = new int[n];

    //  next smaller right
    Stack<Integer> s = new Stack<>();

        // 👉 Next Smaller Right
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            nsr[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }

        // 👉 stack clear
        s = new Stack<>();

        // 👉 Next Smaller Left
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            nsl[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        // 👉 Area calculate
        for (int i = 0; i < n; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("Max Area = " + maxArea);
   }
    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};
        maxArea(arr);
    }

}
