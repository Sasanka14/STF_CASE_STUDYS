/*Scope of the Block. */
public class BlockScopeExample {

    public static void main(String[] args) {
        int outerVar = 10;  // outerVar is accessible throughout the main method

        // Start of a new block
        {
            int innerVar = 20;  // innerVar is only accessible within this block
            System.out.println("Inside block, innerVar = " + innerVar);
            System.out.println("Inside block, outerVar = " + outerVar);
        }
        // End of the block

        // The following line will cause a compilation error because innerVar is out of scope
        // System.out.println("Outside block, innerVar = " + innerVar);

        System.out.println("Outside block, outerVar = " + outerVar);
    }
}
