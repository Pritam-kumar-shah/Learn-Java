import java.util.*;
// Print positive or negative number

public class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number");
        int a = sc.nextInt();
        if (a >= 0) {
            System.out.println(a+" is positive number");
        }
        else{
            System.out.println(a+" is negative number");
        }
    }
}