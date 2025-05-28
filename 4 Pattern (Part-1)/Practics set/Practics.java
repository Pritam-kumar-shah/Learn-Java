import java.util.*;
// Print all Pattern..
public class Practics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //    PRINT HOLLOW RECTANGLE PATTERN

        // System.out.print("Enter the row: ");
        // int row = sc.nextInt();
        // System.out.print("Enter the column: ");
        // int col = sc.nextInt();
        // for(int i=1; i<=row; i++){
        //     for(int j=1; j<=col; j++){
        //         if (i==1 || i==row || j==1|| j==col) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // INVERTED & ROTATED HALF-PYRAMID PATTERN


       int n = sc.nextInt();
       for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if (j<=i) {
                
                System.out.print("*");
            }
            else{

                System.out.print(" ");
            }
        }
        System.out.println();
       }










    }
}