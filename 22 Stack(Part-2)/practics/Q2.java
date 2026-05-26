import java.util.*;
// Simplify path

public class Q2 {
     public static String simplify(String path){
        Stack<String> s = new Stack<>();
        String[] str = path.split("/");

        for(String p : str){
            if(p.equals("") || p.equals(".")){
                continue;
            }else if(p.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else{
                s.push(p);
            }
        }

        StringBuilder sb = new StringBuilder(); 
        for(String dir : s){
            sb.append("/").append(dir);
        }

        return sb.length() == 0 ? "/" : sb.toString();
     }

     public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        System.out.println(simplify(path));
     }
}
