import java.util.*;
// Input/Output in Array
public class Array {
    public static void main(String args[]){
        int marks[]= new int[50];

        Scanner sc = new Scanner(System.in);

        marks[0]=sc.nextInt();//Phy
        marks[1]=sc.nextInt();//Chem
        marks[2]=sc.nextInt();//Math
        System.out.println("Phy:"+marks[0]);
        System.out.println("Chem:"+marks[1]);
        System.out.println("Math:"+marks[2]);
    }
}
