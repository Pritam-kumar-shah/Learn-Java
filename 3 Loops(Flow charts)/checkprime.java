import java.util.*;
// check if a number is prime or not..

public class checkprime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your number:");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
         if (n % i ==0) {
            isPrime=false;
         }

        }
        if ( isPrime == true) {
            System.out.println(n+ " is Prime number");
        }
        else{
            System.out.println(n+ " is not Prime number.");
        }
    }
}
