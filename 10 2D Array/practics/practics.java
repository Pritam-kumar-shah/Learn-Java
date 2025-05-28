
public class practics {
    
    // Q1--->
    public static void printNum(int matrix[][],int key){
        int countof7=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if (matrix[i][j]==key) {
                    countof7++;
                }
            }
        }
        System.out.println("Count of " +key+ "is:"+countof7);
    }

    // Q2---->
    public static void sumofRow(int matrix[][],int key){
        int sum=0; 

        //  Sum of Second row
        for(int i=0; i<matrix[0].length; i++){
            sum+=matrix[1][i];  
        }
        System.out.println("Sum is:"+sum);
    
    }

    // Q3--->
    public static void printmatrix(int matrix[][]){
        System.out.println(" The Matrix is:");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }

// Main function
    public static void main(String[] args) {
        int matrix[][]= {{2,3,7},{5,6,7}};
        int row=2,col=3;
        // int key = 0;
        // printNum(matrix,key);
        // sumofRow(matrix, key);
      
        // Display original matrix
        // printmatrix(matrix);

        // Transpose the matrix
        int transpose[][]= new int [col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        printmatrix(transpose);
    }
}
