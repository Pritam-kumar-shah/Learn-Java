import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( (i==j ||(i+j)%2==0) && i+j==j) {
                    System.out.print("1");
                 } else{
                   System.out.print("0");
                 }
            }
            System.out.println();
        }

    }
}