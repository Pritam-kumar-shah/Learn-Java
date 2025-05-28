import java.util.*;

public class Question {
    
    // Descending Order all Question

    // Q1 ------> Bubble sort
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if (arr[j]<arr[j+1]) {
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    public static void PrintSortig(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i]+" ");
        }
        System.out.println();
    }



    // Q2-----> Selection Sort

    public static void selectioSort(int arr[]){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int mP=i;
            for(int j=i+1; j<n; j++){
                if (arr[mP]<arr[j]) {
                    mP=j;
                }
            }
            // Swap
            int temp=arr[mP];
            arr[mP]= arr[i];
            arr[i]= temp;
        }
    } 

    // Q3----->Insertion sort

    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            int curr =arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev]<curr) {
                arr[prev+1]= arr[prev];
                prev--;
            }
            // Insertion
            arr[prev+1] = curr;
        }
    } 


    // Q4------> Counting Sort
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        int n=arr.length;


        for(int i=0; i<n; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];

        for(int i=0; i<n; i++){
           count[arr[i]]++;
        }

        //  Sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while (count[i]<0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }

    // Main Function
    public static void main(String args[]){
        int arr[] ={3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectioSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        PrintSortig(arr);
    }
}
