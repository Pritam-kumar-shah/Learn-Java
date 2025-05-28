import java.util.*;

public class lagatar {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        // for(int i=1; i<=5; i++){
        //  if (i==3) {
        //     continue;
        //  }
        //  System.out.print(i);
        // }


        do{  
            System.out.printf("Enter the number :");
            int n = sc.nextInt();
            if(n%10 == 0){
              continue;
            }
            System.out.println(n);
        } while(true);
    }
}
