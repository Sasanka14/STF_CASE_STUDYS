/* Q. Design a class TransArrya of order (m*n). The maximum value for both 'm' and 'n' is 20. Find the transpose of the given matrix.*/
//--------------------------------------------------------SOLUTION--------------------------------------------------------------------
import java.io.IOException;
import java.util.Scanner;
public class TransposeArray {
    // Data Member 
    private int[][] matrix;
    private int rows;
    private int columns;

    // Paramatrized Constructor
    public TransposeArray( int rows , int columns) {
        this.rows   = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
    }
    // Member Meathod 
    public void inputMatrix() {                              // Method to input matrix elements
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Matrix Elements ::");
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < columns; j++) {
                    matrix[i][j] = in.nextInt() ;
                }
            }
    }
    public void displayTheOriginalMatrix()  {               // Method to display the original matrix
       System.out.println("Original Matrix :: ");
           for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                  System.out.print(matrix[i][j] + " ");
            }
            System.out.println();                            //  Move to the next row
           }
}
    public void displayTransposeMatrix() {                // Method to find and display the transpose of the matrix
        System.out.println("Transpose MAtrix :: ");
            for(int j = 0; j < columns; j++) {
                for(int i = 0; i < rows; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();                    //  Move to the next row
            }
    }
    public static void main(String[] args)throws IOException {
        Scanner in = new Scanner(System.in);
        // Input Matrix 
        System.out.println("Enter the number of Rows:");
        int rows = in.nextInt();
        System.out.println("Enter the number of Columns:");
        int columns = in.nextInt();
        // Creating a object of a class TransposeArray
       TransposeArray Trans = new TransposeArray(rows, columns);
        // Input matrix elements using the member method
        Trans.inputMatrix();
        // Display the original matrix using the member method
        Trans.displayTheOriginalMatrix();
        // Display the transpose of the matrix using the member method
        Trans.displayTransposeMatrix();

        in.close();
    }
}