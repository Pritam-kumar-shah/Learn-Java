import java.util.*;
// print odd and even number

public class oddeven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number:");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.printf(a+" is even number");
        }
        else{
            System.out.printf(a+" is odd number");
        }
    }
}