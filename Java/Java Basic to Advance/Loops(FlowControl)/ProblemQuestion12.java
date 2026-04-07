/*Q12. What is wrong in the following program?
  public class ProblemQuestion12 {
    public static void main(String args[]) {
        for(int i = 0; i <= 5; i++ ) {
            System.out.println("i = " + i);
        }
        System.out.println("i after the loop = " + i);
    }
}
*/

/*
The issue in this program is with the scope of the variable `i`. 
The variable `i` is declared within the for loop, so it is not accessible outside the loop. 
The statement `System.out.println("i after the loop = " + i);` will cause a compilation error because `i` is out of scope.

Here's the corrected code:
*/

public class ProblemQuestion12 {
    public static void main(String args[]) {
        int i;
        for(i = 0; i <= 5; i++ ) {
            System.out.println("i = " + i);
        }
        System.out.println("i after the loop = " + i);
    }
}
