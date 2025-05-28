import java.util.*;


public class revision  {


    // Average of Three number..
    public static Double Average(Double a, Double b, Double c){
        Double avg = (a+b+c)/3;
        return avg;
    }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Input the first number:");
//     Double a = sc.nextDouble();
//     System.out.print("Input the second number:");
//     Double b = sc.nextDouble();
    
//     System.out.print("Input the third number: ");
//     Double c = sc.nextDouble();
//     System.out.print("Average of all number:"+Average(a, b, c)+"\n");
// }

// Even or odd number
       public static boolean isEven(int num){
        if (num%2==0) {
            return true;
        }
        else{
            return false;
        }
       }

    //    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the integer:");
    //     int num = sc.nextInt();
    //     if (isEven(num)) {
    //         System.out.println("Number is even");
    //     }
    //     else{
    //         System.out.println("Number is odd");
    //     }
    //    }


    // Check Palindrome
    public static boolean isPalindrome(int num){
        int Palindrome = num;
        int rev = 0;
        while (Palindrome != 0) {
            int remainder = Palindrome %10;
            rev = rev*10+remainder;
            Palindrome = Palindrome/10;

        }
        if (num == rev) {
            return true;
        }
        else{
            return false;
        }
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the number:");
    //     int Palindrome = sc.nextInt();
    //     if (isPalindrome(Palindrome)) {
    //         System.out.println("Number " +Palindrome+ " is a palindrome");
    //     }
    //     else{
    //         System.out.print("Number " +Palindrome+ " is not a palindrome");
    //     }
    // }


    // Sum
    public static int Sum(int n){
        int sumofdigit = 0;
        while (n>0) {
            int lastdigit = n%10;
            sumofdigit+=lastdigit;
            n/=10;
        }
        return sumofdigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the number:");
        int digit = sc.nextInt();
        System.out.print("The sum is:"+ Sum(digit));

        }
 }

