import java.util.ArrayList;

public class classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);// Add element O(1)
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(9);

        // reverse an array list
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();


        // find max number 
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(max<list.get(i)){
                max =  list.get(i);
            }
        }
        System.out.println("Max number:- " + max);

        // list.add(1,9);
        // System.out.println(list);
        // System.out.println(list.size());

        // Get operation
        // int element =list.get(6);
        // System.out.println(element);

        // // remove element
        // list.remove(2);
        // System.out.println(list);

        // // Set element at index
        // list.set(2,10);
        // System.out.println(list);

        // // Coontains element
        // System.out.println(list.contains(10));
        // System.out.println(list.contains(7));

    }
}
