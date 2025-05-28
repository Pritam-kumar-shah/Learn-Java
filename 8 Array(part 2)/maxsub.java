import java.util.*;


// Maximum Sub Array
public class maxsub {
    public static void maxArray(int numbers[]){
        int currSum = 0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                 currSum =0;
                for( int k = start; k<=end; k++){ //Print Sub Array
                  currSum+=numbers[k];
                }
                System.out.println(currSum);
                if (maxSum<currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum ="+ maxSum);
    }


    // Time complexcity low

    public static void  maxsubArray(int numbers[]){
        int currSum = 0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];
        prefix[0]= numbers[0];

        // Calculate prefix array
        for(int i=1; i<prefix.length; i++){
              prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0? prefix[end] : prefix[end]-prefix[start-1];
                if (maxSum<currSum) {
                    maxSum = currSum;
                } 
            }
        }
        System.out.println("Max Sum ="+ maxSum);

    
    }


    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs+ numbers[i];
            if (cs<0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max sum is:"+ ms);
    }


    // Trapping Rain Water

    public static int traprain(int height[]){
        // Calculate Left max baundry - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], height[i-1]);
        }


        // Calculate Right  max baundry - array

        int rightMax[] =  new int[height.length];
        rightMax[height.length-1]= height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
          rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int Trappedwater =0;
        
        
        // Loop

        for(int i=0; i<height.length; i++){

         // Water Levels = min(Leftmax bound,rightmax bound)
         int waterlevel =Math.min(leftMax[i], rightMax[i]);

         // Trapped Water = Water Levels - Height[i]
         Trappedwater+= waterlevel - height[i];
        }
        return Trappedwater;
    }

    // Buy And Sell Stock 
    public static int buyandsellstock(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0; i<price.length; i++){
            if (buyPrice<price[i]) {// Profit
                int profit = price[i] - buyPrice;// Today profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
    //   Print Sub Array
    int price[] = {7,1,5,3,6,4} ;
         System.out.println(traprain(price));
    }

}
