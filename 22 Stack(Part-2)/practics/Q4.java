import java.util.*;

public class Q4 {
    public static int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int water = 0;

        for(int i = 0; i < height.length; i++) {
            
            while(!stack.isEmpty() && height[i] > height[stack.peek()]) {
                
                int mid = stack.pop(); // valley
                
                if(stack.isEmpty()) break;
                
                int left = stack.peek();
                
                int width = i - left - 1;
                int h = Math.min(height[i], height[left]) - height[mid];
                
                System.out.println("i=" + i + " left=" + left + " mid=" + mid +
" width=" + width + " height=" + h + " water=" + (width*h));
water += width*h;
            }
            
            stack.push(i);
        }
        
        return water;
    }

    public static void main(String[] args) {
        int arr[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 6};
        System.out.println(trap(arr));  // 25
    }
}