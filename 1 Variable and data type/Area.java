import java.util.*;
public class Area{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the radius:");
        float a = sc.nextFloat();
        double pi = 3.14;
        double area = pi*a*a;
        System.out.printf("Area:");
        System.out.println(area);

    }
}