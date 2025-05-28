
import java.util.*;

// Print leap year

public class Q4 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Year:");
        int year = sc.nextInt();
        boolean  x = (year % 4) == 0; 
        boolean  y = (year % 100) != 0;
        boolean  z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.printf(year+" is a leap year.");
        }
        else {
          System.out.printf(year+" is  not a leap year.");
        }
    }
}
