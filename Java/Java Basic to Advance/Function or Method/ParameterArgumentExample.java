public class ParameterArgumentExample {

    // Parameter: 'name' is a parameter of the greet method
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        ParameterArgumentExample example = new ParameterArgumentExample();

        // Argument: "Sasanka" is an argument passed to the greet method
        example.greet("Sasanka");

        // Another argument example
        example.greet("Aditya");
    }
}
