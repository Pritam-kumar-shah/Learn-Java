import java.util.*;

public class pattern {
    

    // Print hollo rectangle pattern
    public static void rectangle(int row, int col){
        // outer loop
        for(int i=1; i<=row; i++){
            // inner loop
            for(int j=1; j<=col; j++){
                if (i==1||i==row||j==1||j==col) {
                    System.out.print("*");
                }
                else{

                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    // Inverted & Rotated Half Pyramid
    
    public static void pyramid(int row,int col){
        // outer loop
        for(int i=1; i<=row; i++){
            // inner loop 
            // Spaces
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //   Inverted Half - Pyramid with number..

    public static void number(int n){
        // outer loop
        for(int i=1; i<=n;i++){
            // inner loop
            for(int j=1; j<=n-i+1;j++){
                System.out.print(j+" ");
            } 
            System.out.println();
        }
    }

    // Floyd's Triangle..

    public static void triangle(int n){
        int cout=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(cout+" ");
                cout++;
            }
            System.out.println();
        }
    }

    // 0 - 1 Triangle..

    public static void tri(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                if ((i+j)%2==0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    // Butterfly Pattern

    public static void butterfly(int n){

        // First half

        for(int i=1; i<=n; i++){
            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces - 2(n-i)
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //Second Half
        for(int i=n; i>=1; i--){
            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces - 2(n-i)
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    // Solid Rhombus Pattern


    public static void rhombus(int n){
        for(int i=1; i<= n;i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 

    // Hollo Rhombus pattern

    public static void hollo(int n){
        for(int i=1; i<=n; i++){
           for(int j=1; j<=n-i; j++){
            System.out.print(" ");
           }

           for(int j=1; j<=n; j++){
            if (i==1|| i==n|| j==1 ||j==n) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

           }
           System.out.println();
        }
    }

    // Diamond Pattern

    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( int i=n; i>=1; i--){
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // rectangle(4, 4);
        // pyramid(4, 4);
        // number(5);
        // triangle(8);
        // tri(4, 4);
        // butterfly(10);
        // rhombus(4);
        // hollo(5);
        diamond(4);
    }
}
