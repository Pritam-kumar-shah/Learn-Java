public class Array {
        public static void changeArray(int arr[], int i, int val){
            if(i == arr.length){
                printArr(arr);
                return;
            }

            arr[i] = val;
            changeArray(arr, i+1, val+1);
            arr[i] -= 2;
        }    

        public static void printArr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }


        public static void findSubsets(String str, int i, String ans){
            if(i == str.length()){
                if(ans.length() == 0){
                    System.out.println("null");
                }
                else{
                    System.out.println(ans);
                }
                return;
            }
            findSubsets(str, i+1, ans);
            findSubsets(str, i+1, ans+str.charAt(i));
        }

        public static void findPermutation(String str, String ans){
            if(str.length() == 0){
                System.out.println(ans);
                return;
            }
            for(int i=0; i<str.length(); i++){
                char curr = str.charAt(i);
                String newStr = str.substring(0,i) + str.substring(i+1);
                findPermutation(newStr, ans+curr);
            }
        }

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArray(arr, 0, 1);
        // printArr(arr);
        // findSubsets("ABC", 0, "");
        findPermutation("ABC", " ");
    }
}
