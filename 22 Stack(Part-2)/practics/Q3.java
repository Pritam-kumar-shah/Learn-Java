import java.util.*;

public class Q3 {
    public static String decode(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        
        String currentString = "";
        int k = 0;

        for(char ch : s.toCharArray()) {
            
            if(Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            }
            else if(ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                k = 0;
                currentString = "";
            }
            else if(ch == ']') {
                int count = countStack.pop();
                String prev = stringStack.pop();
                
                StringBuilder temp = new StringBuilder(prev);
                for(int i = 0; i < count; i++) {
                    temp.append(currentString);
                }
                currentString = temp.toString();
            }
            else {
                currentString += ch;
            }
        }

        return currentString;
    }

    public static void main(String args[]){
        String s = "3[b2[ca]]";
        System.out.println(decode(s));  // bcacabcacabcaca
    }
}