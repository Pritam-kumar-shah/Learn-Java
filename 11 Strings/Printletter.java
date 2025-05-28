import java.util.*;

public class Printletter {
    
    public static void printLetter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    // Check if string is palidrome
    public static void palidrome(String str){
        int n=str.length();
        for(int i=0; i<str.length()/2;i++){
            if (str.charAt(i)==str.charAt(n-i-1)) {
                System.out.print("This is palidrome");
                break;
            }
            else{
                System.out.print("This is  not palidrome");
            }
        }
        System.out.println();
    }


    // Q2----->
    public static float getPath(String path){
       int x=0, y=0;
       for(int i=0; i<path.length(); i++){
         char dir=path.charAt(i);
 
         // South
         if (dir=='S') {
            y--;
         } 

        // North
        else if (dir=='N') {
            y++;
        }

        // West
        else if (dir=='W') {
            x--;
        }

        // East
        else{
            x++;
        }
       }
       int X2=x*x;
       int Y2= y*y;
       return (float)Math.sqrt(X2+Y2);

    }

    // Substring
    public static String substring(String str, int si, int ei){
        String substr="";
        for(int i=si; i<ei; i++){
            substr+=str.charAt(i);
        }
        return substr;
    }

    // Main Function
    public static void main(String[] args) {
        // String str ="madam";
        // printLetter(str);
        // palidrome(str);
        String path="WNEENESENNN";
        // System.out.println(getPath(path));
        System.out.println(path.substring(0,5));
        // System.out.println(substring(path, 0, 5));

    } 
}
