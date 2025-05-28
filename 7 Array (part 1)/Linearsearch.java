import java.util.*;

// Linear Search
public class Linearsearch {
    public static int linearSearch(int number[],int key){
        for(int i=0; i<number.length;  i++ ){
            if (number[i]==key) {
                return i;
            }
        }
        return -1;
    }


    // Find the largest Number

    public static int getlarge(int number[]){
        int large = Integer.MIN_VALUE;// -infinity
        int small = Integer.MAX_VALUE;// +infinity
        for(int i=0; i<number.length; i++){
            if (large < number[i]) {
                large = number[i];
            }
            if (small>number[i]) {
                small=number[i];
            }
        }
        System.out.println("Smallest number is:"+small);
        return large;
    }



    // Binary Search
    public static int binary(int nuber[], int key){
        int start=0,end=nuber.length-1;

        while (start<=end) {

            int mid = (start+end)/2;
            if(nuber[mid]==key){
                return mid;
            }
            if (nuber[mid]<key) {//Right
                start =mid+1;
            }
            else{//Left
                end = mid-1;
            }
        }
        return -1;
    }


    // Array reverse
    public static void reverse(int nuber[]){
        int start=0,end=nuber.length-1;
        while (start<=end) {
         int temp = nuber[end];
         nuber[end]=nuber[start];
         nuber[start]=temp;
          start++;
          end--;

    
        }

    }
        // Pairs in an Array
        public static void printsPairs(int number[]){
            int tp=0;
            for(int i=0; i<number.length; i++){
                int curr = number[i];
                for( int j=i+1; j<number.length; j++){
                    System.out.print("("+ curr+","+number[j]+") ");
                    tp++;
                }
                System.err.println();
            }
            System.err.println("Total Pairs is :"+tp);

        }


        // Print Subarrays
        // A continuous part of array

        public static void Array(int number[]){
            for(int i=0; i<number.length; i++){
                int start = i;
                for(int j=i; j<number.length; j++){
                    int end = j;
                    for( int k= start; k<= end; k++){
                        System.out.print(number[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
        
    
        public static  void main (String args[]){
            int number[] = {2,4,6,8,10,12,14,16};
            // int key = 10;
        //     int index = linearSearch(number, key);
        //     if (index == -1) {
        //         System.out.print("Not found");
        //     }else{
        //    System.out.println("Key is at index:"+index);
        // }
        // System.out.println("Largest number is:"+getlarge(number));


        // System.out.println("Index for key is:"+binary(number, key));


        // reverse(number);
        // for(int i=0; i<number.length; i++){
        //     System.out.print( number[i]+", ");
        // }
        // System.out.println();


    //  printsPairs(number);

        Array(number);
        }
    }

