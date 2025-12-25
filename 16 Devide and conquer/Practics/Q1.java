import java.util.*;

public class Q1 {
    public static String[]mergeSort(String[] arr,int lo,int hi) {
        if(lo == hi) {
            String[] A= {arr[lo] }; 
            return A; 
        }
        int mid = lo+ (hi-lo) /2;
        String[] arr1= mergeSort(arr,lo,mid);
        String[] arr2=mergeSort(arr,mid+1,hi);
        String[] arr3=merge(arr1,arr2);
        return arr3;
    }
    static String[] merge(String[] arr1,String[] arr2){
        int m=arr1.length;
        int n=arr2.length;
        String[] arr3= new String[m+n];
        int idx=0;
        int i=0; int j=0;
        while(i<m&&j<n) {
            if(isAlphabeticallySmaller(arr1[i],arr2[j])){
                arr3[idx] =arr1[i];
                i++;
                idx++;
            }
            else{
                arr3[idx] =arr2[j];
                j++;
                idx++;
            }
        }

        while(i<m) {
            arr3[idx] =arr1[i];
            i++;
            idx++;
        }
        while(j<n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }
    // Return true if str1 appears before str2 in alphabetical order 
    static boolean isAlphabeticallySmaller(String str1,String str2) {
        if(str1.compareTo(str2) <0) {
            return true;
        }
        return false;
    }


    public static int majorityElement(int[]nums) {
        int majorityCount = nums.length/2;
        for(int i=0;i<nums.length;i++) {
            int count=0;
            for(int j=0;j<nums.length;j++) {
                if(nums[j] ==nums[i]) {
                    count+=1;
                }
            }
            if(count>majorityCount) {
                return nums[i];
            }
        }
        return-1;
    }

    // Q--->3
    public static int getInvCount(int arr[]) {
        int n=arr.length;
        int invCount=0;
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i] >arr[j]) {
                    invCount++;
                }
            }
        }
        return invCount;
    }
    
    
    public static void main(String[]args) {
        int arr[] = {1,20,6,4,5};
        System.out.println("Inversion Count = "+getInvCount(arr));


        // int nums[] = {2,2,1,1,1,2,2};
        // System.out.println(majorityElement(nums));


        // String[] arr= {"sun","earth","mars","mercury"};
        // String[] a=mergeSort(arr,0,arr.length-1);
        // for(int i=0;i<a.length;i++) {
        //     System.out.println(a[i]);
        // }
    }



}
// Solution 2:Approach 1- Brute Force ApproachIdea : Count the number of times each number occurs in the array & find the largest count.Time complexity - O(n^2)classSolution{publicstaticintmajorityElement(int[]nums) {intmajorityCount=nums.length/2;mrpritamraj21@gmail.com


