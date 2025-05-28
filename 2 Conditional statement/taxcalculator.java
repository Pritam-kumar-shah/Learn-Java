// Income Tax Calculator

import java.util.*;

public class taxcalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.printf("Enter your income:");
        int income = sc.nextInt();
     
        // Your income is Less than 5Lakh
        if(income < 500000 ){
            int tax = (0*income);
            System.out.printf("Your tax is 00. ");
        }
        // Your income between 5 - 10 Lakh youpay 20% tax
        else if (income >= 500000 && income < 1000000) {
            float tax = (float)(0.20*income);
            System.out.printf("Your tax is:"+tax);
        }
        // Your income is greter than 10Lakh you pay tax 30% tax on your income
         else {
            float tax = (float)(0.30*income);
            System.out.printf("Your tax is:"+tax);
         }
    }
}