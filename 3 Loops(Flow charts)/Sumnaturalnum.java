import java.util.*;
// Sum of N natural number..
public class Sumnaturalnum {
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.printf("Enter the number:");
   int n = sc.nextInt();
   int sum = 0;
   int i = 1;
    while (i <= n) {
        sum += i;
        i++;
    }
    System.out.printf("Sum of natural number is :"+ sum);
  }   
}
