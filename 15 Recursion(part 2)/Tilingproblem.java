import java.util.*;
public  class Tilingproblem {
public static int tilingProblem(int n){ // Flore size 2*n

    // base case 
    if(n==0 || n==1){
        return 1;
    }

    // Vertical choice
    int vertically = tilingProblem(n-1);

    // Horizontal choice
    int horizonantally = tilingProblem(n-2);
 
    // totalways
    int totalways = vertically + horizonantally;
    return totalways;

}


// Problem 12
// Remove dublicate in a String
public static void removeDublicate(String str, int idx, StringBuilder newStr, boolean map[]){
    // base case
    if(idx == str.length()){
        System.out.println(newStr);
        return;
    }

    char currentChar = str.charAt(idx);
    // check if already present
    if(map[currentChar - 'a'] == true){
        // already present
        removeDublicate(str, idx+1, newStr, map);
    }else{
        // not present
        map[currentChar - 'a'] = true;
        removeDublicate(str, idx+1, newStr.append(currentChar), map);
    }
}


// Problem 13
// Friends pairing Problem

public static int frindsPairing(int n){
    if(n==1||n==2){
        return n;
    }

    return frindsPairing(n-1) + (n-1) * frindsPairing(n-2);
}

// problem 14
// Binary string Problem

public static void printBinString(int n, int LP,String str){
    if(n == 0){
        System.out.println(str);
        return;
    }
    printBinString(n-1, 0, str+"0");
    if(LP==0){
       printBinString(n-1, 1, str + "1");
    }
}

public static void main(String[] args){
    // System.out.println(tilingProblem(3));
    // String str = "appnnacollege";
    // removeDublicate(str, 0, new StringBuilder(""), new boolean[26]);
    // System.out.println(frindsPairing(3));
    printBinString(3, 0, "");
}
}