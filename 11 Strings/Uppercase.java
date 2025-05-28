import java.util.*;
public class Uppercase {
   public static String toUppercase(String str) {
    StringBuilder sb = new StringBuilder();
    char ch= Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i=1; i<str.length(); i++){
        if (str.charAt(i)==' ' && i<str.length()-1) {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
   } 


//    Q2------>
public static String Compression(String str){
    String newstr="";
    for(int i=0; i<str.length(); i++){
        Integer count = 1;
        while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
            count++;
            i++;
        }
        newstr+=str.charAt(i);
        if (count>1) {
            newstr+= count.toString();
        }
    }
    return newstr;
}

   public static void main(String[] args) {
    String str="hi, i am pritam";
    // System.out.println( toUppercase(str));
    String newStr="aaabbcccdddee";
    System.out.println(Compression(newStr));
   }
}
