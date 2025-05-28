import java.util.*;
// print reverse the number
public class Reverse {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number:");
        int num = sc.nextInt();
        while (num>0) {
            int lastdigit = num%10; //rev = (rev*10)+lastdigit;
            System.out.print(lastdigit);
            num /=10;
        }
    }
}
