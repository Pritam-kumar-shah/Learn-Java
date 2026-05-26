import java.util.*;

// indian coins
public class Q5 {
    public static void main(String[] args) {
       int coins[] = {1,2,5,10,20,50,100,200,500,2000};
       int amount = 560;
       int count = 0;
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i = coins.length-1; i>=0; i--){
         if(coins[i] <= amount){
            while(coins[i] <= amount){
                count++;
                amount -= coins[i];
                ans.add(coins[i]);
            }
         }
       }


       System.out.println("Minimum number of coins required: " + count);
         System.out.println("Coins used: " + ans);
    }
}