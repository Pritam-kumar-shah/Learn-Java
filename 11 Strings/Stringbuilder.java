import java.util.*;
public class Stringbuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char i='a'; i<='z'; i++){
            sb.append(i);
        }
        // abcdefghijklmnopq____
        // O(26)
        // O(n^2)
        System.out.println(sb.length());
    }
}