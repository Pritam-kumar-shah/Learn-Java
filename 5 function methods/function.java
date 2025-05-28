import java.util.*;

public class function {
    public static  void printhello(){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    public static int  calculatesum(int num1, int num2) { // Parameter or formal parameter
        int sum = num1+num2;
        return sum;
    }
    // public static void main(String[] args) {
    //     Scanner sc =new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //      int sum=calculatesum (a,b); // argument or actual parameter
    //      System.out.println("Sum is:"+sum);
    // }
  

    // Product of A and B..

    
    public static int  product (int a,int b){
        //    int  a = sc.nextInt();
        //    int  b = sc.nextInt();
        int multiply = a*b;
        return multiply;
        
    }


    // Print factorial

    public static int factorial(int a){
        int f = 1;
        for(int i=1; i<=a; i++){
            f*=i;
        }
        return f;
    }


    // Print Binomial Coefficient


    public static int Binomial(int n, int r){
        int fact_n = factorial(n); 
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int Binomial = fact_n/(fact_r*fact_nmr);
       return Binomial;
    }


    // Check if a number is prime or not

    public static boolean prime (int n){
        
        
        if (n==2 ) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    // print all prime in a range

    public static void range(int n){
        for(int i=2;i<=n;i++){
            if (prime(i)) {
                System.out.print(i + " ");
            }

        }
        System.out.println(" ");
        return;
    }


      // Print Conver to binary number to decimal number
      
      public static void bintodec(int binNum){
        int myNum =binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum>0) {
            int lastdigit = binNum%10;
            decNum = decNum+ (lastdigit*(int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of "+myNum +"="+decNum);
      }
 
    
    // public static void main(String[] args) {
    //     // Scanner sc = new Scanner(System.in);
    //             // int  n = sc.nextInt();
    //            bintodec(10);

    // }



    // Convert Decimal to Binary number

    public static void dectobin(int decNum){
        int myNum = decNum;
         int pow =0;
         int binNum = 0;
         while(decNum>0){
            int lastdigit = decNum%2;
            binNum = binNum+(lastdigit*(int)Math.pow(10, pow));
            pow++; 
            decNum/=2;
         }
         System.out.println("Binary of " +myNum +"="+binNum);
    }
    public static void main(String[] args){
        dectobin(12);
    }
}
