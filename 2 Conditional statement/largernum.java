import java.util.*;
// Print the largest of two number
public class largernum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the first number:");
        int a = sc.nextInt();
        System.out.printf("Enter the second number:");
        int b = sc.nextInt();
        if(a > b){
            System.out.printf("Largest number is:"+a);
        }
        else{
            System.out.printf("Largest number is:"+b);
        }
    }
}

