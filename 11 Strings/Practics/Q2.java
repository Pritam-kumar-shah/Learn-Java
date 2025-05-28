import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        String str1 ="earth";
        String str2 ="heart";

        // Covert String to lowercase. why? so that we don't have to check seperately for lower & uppercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check if the length are same
        if (str1.length()==str2.length()) {
            // Covert String into char array
            
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // Sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str1charArray);

            // If the sorted char array are same or identical then the string are anagrams
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1+" and "+ str2+" are anagrams of each others.");
            }
            else{
                System.out.println(str1+" and "+ str2+" are not anagrams of each others.");
            }
        }
        else{
            // When lengths are not equal
            System.out.println(str1+" and "+ str2+" are not anagrams of each others.");
        }
    }
}
