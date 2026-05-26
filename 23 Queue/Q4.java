import java.util.*;

// first non-repeating character in a stream of characters
public class Q4 {
    public static void firstNonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;


            while(!q.isEmpty() && freq[q.peek() -'a'] >1){
                q.remove();
            }
            if(freq[ch - 'a'] == 1) {
                q.add(ch);
            }



            if (!q.isEmpty()) {
                System.out.print(q.peek() + " ");
            } else {
                System.out.print("-1 ");
            }
        }
   System.out.println();
            
    }
    
    
    public static void main(String[] args) {
        String str = "aabccxb";
        firstNonRepeating(str);
    }
}
