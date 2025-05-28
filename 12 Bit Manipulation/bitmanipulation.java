import java.util.*;

public class bitmanipulation {
    public static void oddOreven(int n){
        int bitMask =1;
        if ((n & bitMask)==0) {
            // Even number
            System.out.println("Even number");
        }
        else{
            
            System.out.println("odd number");
        }
    }


    // Get ith bit
    public static int getIthbit(int n, int i){
        int bitmask = 1<<i;
        if ((n&bitmask)==0) {
            return 0;
        }
        else{
            return 1;
        }
    }

    // Set ith bit
    public static int setIthbit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    // Clear ith bit 
    public static int clearIthbit(int n, int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    // Update Ith bit
    public static int updateithbit(int n,int i, int newbit){
        // if (newbit==0) {
        //     return clearIthbit(n, i);
        // }else{
        //     return setIthbit(n, i);
        // }

        // Second method
        n = clearIthbit(n,i);
        int bitMask =newbit<<i;
        return n|bitMask;
    }

    // Clear last i bits
    public static int clearIbits(int n, int i){
        int bitMask = (~0)<<i;
        return n& bitMask;
    }

    // Clear Range of bits
    public static int clearIthbits(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }

    
    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        // oddOreven(n);
        System.out.println(clearIthbits(10, 2,4));
    }
}
