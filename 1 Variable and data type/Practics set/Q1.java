// Average the number
import java.util.*;
public class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number A:");
        int a =sc.nextInt();
        System.out.printf("Enter number B:");
        int b =sc.nextInt();
        System.out.printf("Enter number C:");
        int c = sc.nextInt();
        float average = (a+b+c)/3;
        System.out.println("Average:"+ average);
    }
}