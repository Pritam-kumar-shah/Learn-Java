import java.util.*;

// Print sum of even and odd number.. 

public class Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0, odd = 0;
        for(int i = 1; i<=n; i++){
            int x = sc.nextInt();
            // Even
            if (x%2==0) {
                even+=x;
            }
            // Odd
            else{
                odd+=x;
            }

        }
        System.out.println("Sum of Even elements: "+even);
        System.out.println("Sum of odd elements: "+odd);
    }
    
}
