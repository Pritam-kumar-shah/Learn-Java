public class practics {

    public static int printPower(int a, int n){
        if(n==0){
            return 1;
        }
        if(n ==  1){
            return a;
        }
        int smaller = printPower(a, n/2);
        if(n%2 == 0){
            return smaller*smaller;
        }else{
            return a*smaller*smaller;
        }
    }

    //Q-->1
    public static void printIdx(int arr[] , int n, int key, int Idx){
     if (Idx == n) {
        return ;
     }
     if (arr[Idx] ==  key) {
        System.out.print(Idx+ " ");
     }
     printIdx(arr, n, key, Idx+1);
     return;
    }

    // Q---->2
    // Tower of Honoi Problem
    public static void TOH(int n, char a, char b, char c){
        if(n==0){
            return ;
        }
        TOH(n-1, a, c, b);
        System.out.println(a + " to " + c);
        TOH(n-1, b, a, c);
        
    }


    //Q-->3
    public static String digit[] ={"Zero", "One", "Two","Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static void printNumtoLetter(int n){
          if (n ==0 ) {
            return;
          }
          int lastDigit = n%10;
          printNumtoLetter(n/10);
          System.out.print(digit[lastDigit]+ " ");
    }
    public static void main(String[] args) {
        // System.out.println(printPower(2, 5));
        // TOH(3, 'A', 'B', 'C');
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // printIdx(arr, arr.length, 2, 0);
        printNumtoLetter(01);
    }
}
