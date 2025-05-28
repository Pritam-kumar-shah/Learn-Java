import java.util.*;

// Print Pattern
public class Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        
        // int n = sc.nextInt();

        // for( int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }




        // Print Inverted Star Pattern

        // int n = sc.nextInt();
        // for( int i=1; i<=n; i++){
        //     for( int j=1; j<=n-i+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // Print Half-Pyramid patter..

        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for( int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Print Character Pattern

         int n = sc.nextInt();
         char ch = 'A';
         for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
         }
    }
}
