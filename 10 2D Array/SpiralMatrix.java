import java.util.*;


// Spiral Matrix

public class SpiralMatrix{

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startcol = 0;
        int endRow =matrix.length-1;
        int endCol =matrix[0].length-1;

        while(startRow<=endRow && startcol<=endCol){
            // Top
            for(int j=startcol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            // right
            for(int i=startRow+1; i<=endRow; i++ ){
                System.out.print(matrix[i][endCol]+" ");
            }

            // Bottom
            for(int j=endCol-1; j>=startcol; j--){
                // if (startRow==endRow) {
                //     break;
                // }
                System.out.print(matrix[endRow][j]+" ");
            }

            // Left
            for(int i=endRow-1; i>=startRow+1; i--){
                // if (startcol==endCol) {
                //     break;
                // }
                System.out.print(matrix[i][startcol]+" ");
            }

            startRow++;
            startcol++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }


    // Diagonal Sum
    public static int diagonalSum(int matrix[][]){
        int sum = 0;//time complexcity O(n^2)
        for(int i=0; i<matrix.length; i++ ){
            for(int j=0; j<matrix[0].length; j++){
                if (i==j) {
                    sum+=matrix[i][j];
                }
                else if (i+j==matrix.length-1) {
                    sum+=matrix[i][j];
                }
            }
        }

        for(int i=0; i<matrix.length; i++){//O(n)
            // Pd
            sum+=matrix[i][i];
            // Sd
            if (i!=matrix.length-1-i) {
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }



    // Search in sorted array

    public static boolean staircaseSearch(int matrix[][], int key){
        int row=0, col=matrix[0].length-1;

        while (row<matrix.length && col>=0) {
            if (matrix[row][col]==key) {
              System.out.println("Found key at("+row+","+col+")");
              return true;
            }

            else if (key<matrix[row][col]) {
             col--;
            }

            else{
             row++;
            }
        }
     System.out.println("Key not found");
     return false;
    }
    // Main function

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
    //   printSpiral(matrix);
    int key = 14;
    System.out.print(staircaseSearch(matrix, key));
    }
}
