import java.util.*;
// Print the largest 3 Number

public class largest3num{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the threee number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c) {
            System.out.printf(a+" is a largest number");
        }
        else if (b>a && b>c) {
            System.out.printf(b+" is largest number");
        }
        else{
            System.out.printf(c+" is largest number");
        }
    }
}