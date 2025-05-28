import java.util.*;
// Bill of a item
public class Q3{
     public static void main (String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.printf("Enter the cost of Pen:");
      float pen = sc.nextFloat();
      System.out.printf("Enter the cost of pencil:");
      float pencil = sc.nextFloat();
      System.out.printf("Enter the cost of eraser:");
      float eraser = sc.nextFloat();
      float total = pen+pencil+eraser;
      System.out.println("Bill is:"+total);

     //   Add on with -18% tax
      float newtotal = total+ (0.18f*total);
      System.out.println("Bill with 18% Tax:"+newtotal);

    }
}