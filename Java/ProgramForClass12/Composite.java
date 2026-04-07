/* Q. A class Composite contains a two-dimensional array of order [m x n]. The maximum 
values possible for both ‘m’ and ‘n’ is 20. Design a class Composite to fill the array with 
the first (m x n) composite numbers in column wise. 
[Composite numbers are those which have more than two factors.]
The details of the members of the class are given below:
Class name :
Composite
Data members/instance variables:
 arr[ ] [ ] :
integer array to store the composite numbers 
column wise
 m : integer to store the number of rows
 n : integer to store the number of columns
Member functions/methods:
Composite(int mm, int nn ) :
to initialize the size of the matrix, m=mm and 
n=nn
int isComposite( int p ) : to return 1 if the number is composite otherwise 
returns 0
void fill ( ) : to fill the elements of the array with the first 
(m × n) composite numbers in column wise
void display( ) :
to display the array in a matrix form
Specify the class Composite giving details of the constructor(int,int), 
int isComposite(int), void fill( ) and void display( ). Define a main( ) function to create an 
object and call all the functions accordingly to enable the task*/
//--------------------------------------------------------------------------SOLUTION------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Composite {
    private int[][] arr;
    private int m;
    private int n;

    public Composite(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    // Function to check if a number is composite
    private int isComposite(int p) {
        if (p < 4) {
            return 0;  // 1, 2, and 3 are not composite numbers
        }

        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return 1;  // Number has more than two factors, so it's composite
            }
        }
        return 0;  // Number is prime, not composite
    }

    // Function to fill the array with the first (m x n) composite numbers in column wise
    public void fill() {
        int num = 4;  // Start with the first composite number
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                while (isComposite(num) == 0) {
                    num++;
                }
                arr[i][j] = num;
                num++;
            }
        }
    }

    // Function to display the array in a matrix form
    public void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        Composite compositeObj = new Composite(rows, columns);
        compositeObj.fill();
        compositeObj.display();
    }
}
