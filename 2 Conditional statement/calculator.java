import java.lang.runtime.SwitchBootstraps;
import java.util.*;
// calculaor

public class calculator{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        char Operator =sc.next().charAt(0);
        int b =sc.nextInt();

        switch (Operator) {
            case '+': System.out.println(a+b);
                break;
            case '-': System.out.println(a-b);
            break;    
            case '*': System.out.println(a*b);    
            break;    
            case '/': System.out.println(a/b);    
            break;    
            case '%': System.out.println(a%b);    
            break;    
        
            default:
             System.out.println("Wrong operator");
                break;
        }
    }
}