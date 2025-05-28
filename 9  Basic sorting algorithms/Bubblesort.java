import java.util.Arrays;

public class Bubblesort {
    
    // Increasing order
    // Bubble sorted
    public static void bubble(int nums[]){
        int n = nums.length;
        for(int i=0; i<n-1; i++){// i == turns
           for(int j=0; j<n-1-i; j++){
            if (nums[j]<nums[j+1]) {
                int temp = nums[j];
                nums[j]=nums[j+1];
                nums[j+1]= temp;
            }
           }
        }
        
    }

    public static void printArr(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }


    // Selection Sorted
    public static void selectionSort(int nums[]){
        int n= nums.length;
        for(int i=0; i<n-1; i++){
            int mP = i; // mP= minimum Position
            for(int j=i+1; j<n; j++){
                if (nums[mP]>nums[j]) {
                    mP = j;
                }

            }
            // Swap
            int temp = nums[i];
            nums[i]= nums[mP];
            nums[mP]= temp;
        }
    }

    // Insertion Sorted
    public static void insertionSort(int nums[]){
        for(int i=0; i<nums.length; i++){
            int curr = nums[i];
            int prev = i-1;

            while (prev>=0 && nums[prev]>curr) {
                nums[prev+1]= nums[prev];
                prev--;
            }
            nums[prev+1]= curr;
        }
    }

    // Counting Sorted
    public static void CountingSort(int nums[]){

        int largest = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int [largest+1];
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }

        // Sorting 
        int j=0;
        for(int i=0; i<count.length;i++){
            while (count[i]>0) {
                nums[j]= i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={5,4,1,3,2,7};
        // insertionSort(nums);
        // Arrays.sort(nums);
        // Arrays.sort(nums,Collections.reverseOrder());
        bubble(nums);

        printArr(nums);
    }
}
