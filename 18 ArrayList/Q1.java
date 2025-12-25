import java.util.*;

// Container with most water

public class Q1 {

    public static int storeWater(ArrayList<Integer> height){
       int maxWater = 0;
        // Brute force
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht*width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    // Q--->2
    // Pair sum -1
    public static boolean pairSum1(ArrayList<Integer> height, int target){
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                if(height.get(i)+height.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    // Two pointer approach
    public static boolean pairSum(ArrayList<Integer> height, int target){
        int lp = 0;
        int rp =height.size()-1;
        while(lp<rp){
            if(height.get(lp) + height.get(rp) == target){
                return true;
            }
            else if(height.get(lp) + height.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

    // Q-->3
    // pair sum 2
    public static boolean pairSum2(ArrayList<Integer> list , int target){
        int bp = -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = 1;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;
        while (lp != rp) {
             if(list.get(lp) + list.get(rp) ==  target){
                return true;
             }
             else  if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % list.size();
             }
             else{
                rp = (list.size()+rp-1)%list.size();
             }
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(11);
        // height.add(8);
        // height.add(6);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // System.out.println(storeWater(height));
        int target = 16;
        System.out.println(pairSum2(height, target));
    }
    
}
