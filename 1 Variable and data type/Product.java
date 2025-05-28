import java.util.*;
public class Product {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter the number A:");
    int a =sc.nextInt();
    System.out.printf("Enter the number B:");
    int b =sc.nextInt();
    int pro = a*b;
    System.out.printf("Product of A and B:");
    System.out.println(pro);

  }
}