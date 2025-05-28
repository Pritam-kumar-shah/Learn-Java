import java.util.*;
// Print the number 1 to 10
public class accending {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int a = 1;
        while (a <= n) {
            System.out.println(a+" ");
            a++;
        }
        System.out.println();
    }
    
}
