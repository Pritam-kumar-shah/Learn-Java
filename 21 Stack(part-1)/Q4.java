import java.util.*;
// Stock span problem
public class Q4 {
    public static void stockSpan(int stock[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1; i<stock.length; i++){
            while(!s.isEmpty() && stock[s.peek()]< stock[i]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHeight = s.peek();
                span[i] = i-prevHeight;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stock[] = {100, 80, 60, 70, 60, 75, 85};
        int span[] = new int[stock.length];
        stockSpan(stock, span);
        System.out.println("Stock Span: " + Arrays.toString(span));
    }
}
