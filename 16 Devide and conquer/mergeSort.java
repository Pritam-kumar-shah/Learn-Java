import java.util.*;

public class mergeSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void MergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //idx for 1st sorted part
        int j = mid+1; // idx for 2nd sorted part
        int k = 0; //idx for temp

        while(i<=mid && j<=ei){
            if (arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover element for 1st sorted part
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        // for leftover element for 2nd sorted part
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        // Copy temp to original array
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }


    // Q-->2
    // Quick Sort
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        // Last element
        int pIdx = partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make place for els smaller then pivot
        for(int j =si; j<ei; j++){
            if (arr[j] <= pivot) {
                i++;

                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]= arr[i];
        arr[i] = temp;
        return i;
    }


    //Search in rotated sorted array
    public static int search(int arr[],int tar, int si, int ei){
        if(si > ei){
            return -1;
        }
        // Work
        int mid = si + (ei-si)/2;

        // Case found 
        if (arr[mid] == tar) {
            return mid;
        }

        //mid on L1
        if (arr[si]<= arr[mid]) {
            // case a : left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid-1);
            }else{
                // Case b : Right
                return search(arr, tar, mid+1, ei);
            }
        }

        // mid on L2
        else{
            // Case C :Right
            if (arr[mid]<= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            }
            else{
                // Case D: Left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    // Main function
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length-1));
    
    }
}
