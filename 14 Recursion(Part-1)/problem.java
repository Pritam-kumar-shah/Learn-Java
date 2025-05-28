import java.util.*;


public class problem {
    // problem--->1

    public static void printDec(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
       System.out.println(n+" ");
       printDec(n-1);
    }

    //Problem-->2
    public static void printInc(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        printInc(n-1);
       System.out.println(n+" ");
    }

    // Problem-->3
    public static int fact(int n){
        if (n==0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fnm1;
        return fn;
    }

    // problem--->4
    public static int naturalSum(int n){
       if (n==1) {
        return 1;
       }
       int Sonm1 = naturalSum(n-1);
       int SoN = n+ Sonm1;
       return SoN;
    }


    // Problem--->5
    public static int fibonacci(int n){
                if (n==0 || n==1) {
                    return n;
                }
                int fnm1 = fibonacci(n-1);
                int fnm2 = fibonacci(n-2);
                int fn = fnm1+fnm2;
                return fn;
    }


    // Problem---> 6
    public static boolean sorted(int arr[],int i){
         if (i==arr.length-1) {
            return true;
         }
         if (arr[i]>arr[i+1]) {
            return false;
         }
         return sorted(arr, i+1);
    }

    // problem--->7
    public static int firstOccur(int arr[], int key, int i){
       if (i==arr.length) {
         return -1;
       } 
       if (arr[i]==key) {
         return i;
       } 
       
       return firstOccur(arr, key, i+1);

    }

    // problem ---->8
    public static int lastOccur(int arr[], int key, int i){
        if (i==arr.length) {
            return -1;
        }
        int isFound = lastOccur(arr, key, i+1);
        if (isFound==-1  && arr[i]==key) {
          return i;
        } 

        return isFound;
        
 
     }

     //problem-->9
     public static int power(int x, int n){
        if (n==0) {
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x*xnm1;
        // return xn;

        return x*power(x, n-1);
     }

    //  problem ---->10
    public static int Evenpow(int x, int n){//Tc = O(logn)
        if (n==0) {
            return 1;
        }
        int halfpowerSq =Evenpow(x, n/2)*Evenpow(x, n/2);

        // n is odd
        if (n%2!=0) {
            halfpowerSq = x*halfpowerSq;
        }
        return halfpowerSq;
    }
    public static void main(String[] args) {
        // int arr[]= {5,5,5,5,5};
        // printInc(n);
        System.out.println(Evenpow(3, 5));
    }
}
