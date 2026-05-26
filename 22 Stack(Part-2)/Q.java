import java.util.*;

public class Q {
    public static void removeDuplicate(String str){
        Stack<Character> sc = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!sc.isEmpty() && sc.peek() == ch){
                sc.pop();
            }else{
                sc.push(ch);
            }
        }

        System.out.println(sc);
    }
    public static void main(String[] args) {
        String str = "abcxxxxcba";
        removeDuplicate(str);
    }
}
