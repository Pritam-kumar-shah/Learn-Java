import java.util.*;
// If check pass aur fail student
 
public class result{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the student marks:");
        int marks = sc.nextInt();
        String reportcard = (marks>=33)? "Pass":"Fail";
        System.out.printf(reportcard);
    }
}