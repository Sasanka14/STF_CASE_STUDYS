/* Q10. Will the following statement give any error in Java?
                          int $ = 24;
*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* Explanation of the problem:::::
The statement `int $ = 24;` will not give an error in Java because it follows the rules for variable declaration in Java.
Variable names can begin with a letter (a-z, A-Z), dollar sign `$`, or underscore `_`, followed by letters, digits, dollar signs, or
underscores. Therefore, `int $` is a valid variable declaration, and it will not result in a syntax error.
 */
public class JavaBasicProblemQuestion10 {
    public static void main(String[] args) {
        int $ = 24;
        System.out.println($);
    }
}
