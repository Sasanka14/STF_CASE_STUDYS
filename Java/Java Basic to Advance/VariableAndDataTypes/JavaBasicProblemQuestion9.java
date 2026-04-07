/* Q9. What will be the type of result in the following Java code
                  byte = 4;
                  char c = 'a';
                  short s = 512;
                  int i = 1000;
                  float f = 3.14f
                  double d = 99.9954;
                  result = (f * b) + (i % c) - (d - s);
        (Hint : Look at the largest data type among these)
 */

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* Explanation of the above problem::::::
 
1. **Expression Breakdown**:
    - **(f * b)**:
        - `f` is a `float` and `b` is a `byte`.
        - When a `byte` is involved in arithmetic with a `float`, the `byte` is promoted to a `float`.
        - Thus, `(f * b)` results in a `float`.

    - **(i % c)**:
        - `i` is an `int` and `c` is a `char`.
        - `char` is promoted to an `int` during arithmetic operations.
        - Thus, `(i % c)` results in an `int`.

    - **(d - s)**:
        - `d` is a `double` and `s` is a `short`.
        - `short` is promoted to a `double` during arithmetic operations.
        - Thus, `(d - s)` results in a `double`.

2. **Combining the Results**:
    - **((f * b) + (i % c))**:
        - `f * b` is a `float` and `i % c` is an `int`.
        - When a `float` is added to an `int`, the `int` is promoted to a `float`.
        - Thus, `((f * b) + (i % c))` results in a `float`.

    - **Final Result**:
        - We now have a `float` from `((f * b) + (i % c))` and a `double` from `(d - s)`.
        - When a `float` is involved in arithmetic with a `double`, the `float` is promoted to a `double`.
        - Thus, `((f * b) + (i % c)) - (d - s)` results in a `double`.

Conclusion
The type of `result` in the given expression will be `double`.

 */
public class JavaBasicProblemQuestion9 {
    public static void main(String args[]) {
        byte b = 4;
        char c = 'a'; // 'a' has an ASCII value of 97
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        
        // Perform the expression
        double result = (f * b) + (i % c) - (d - s);
        
        // Print the result
        System.out.println("The result of the expression is: " + result);
    }
}

