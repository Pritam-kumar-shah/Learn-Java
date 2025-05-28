import java.util.*;
// Check tempreture

public class Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tempreture");
        int temp = sc.nextInt();
        if (temp > 100) {
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You  don't have a fever");

        }
    }
    
}
