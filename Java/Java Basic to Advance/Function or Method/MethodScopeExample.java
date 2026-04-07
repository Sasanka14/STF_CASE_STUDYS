/*Scope of the Method.  */
public class MethodScopeExample {

    public void exampleMethod() {
        int localVar = 10;  // localVar is a local variable with method scope
        System.out.println("Inside method, localVar = " + localVar);
    }

    public static void main(String[] args) {
        MethodScopeExample example = new MethodScopeExample();
        example.exampleMethod();
        
        // Uncommenting the following line will cause a compilation error
        // System.out.println("Outside method, localVar = " + localVar);
    }
}
