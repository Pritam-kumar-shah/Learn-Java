import java.util.*;
public class Practics {
    
// Question 1
public static boolean nums(int numbers[]){
    for(int i=0; i<numbers.length-1; i++){
        for(int j=i+1; j<numbers.length; j++){
            if (numbers[i]==numbers[j]) {
                return true;
            }
        }
    }
    return false;
}


// Question 2

public int minSearch(int nums[]){
    int left = 0;
    int right = nums.length-1;
    while (left<right) {
        int mid = left+(right - left)/2;
        if (mid>0 && nums[mid-1]>nums[mid]) {
            return mid;
        }else if (nums[left]<= nums[mid]&& nums[mid]>nums[right]) {
            left = mid+1;
        }
        else{
            right = mid-1;
        }
    }
    return left;
}

public int search(int[] nums,int left,int right, int target){
    int l = left;
    int r = right;
    while (l<=r) {
        int mid = l + (r-l)/2;
        if (nums[mid]== target) {
            
            return mid;
        }else if(nums[mid]>target){
            r= mid-1;
        }
        else{
            l = mid+1;
        }

    }
    return -1;
}
public static int search(int nums[],int target){
    int min = minSearch(nums);
    if (nums[min]<=target && target <=nums[nums.length-1]) {
        return search(nums, min,nums.length-1,target);
    }
    else{
        search(nums,0, min, target);
    }
}



public static void main(String[] args) {
    int numbers[] = {1,2,3,2};
   System.out.println(search(numbers) );
}

}
