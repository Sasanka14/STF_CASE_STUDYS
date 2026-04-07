/* By the help of code try to understand Type Conversion. */
public class JavaBasicTypeConversion {
    public static void main(String args[]) {
        // Implicit Type Conversion (Widening Conversion)
        int intVal = 100;
        long longVal = intVal; // int to long
        float floatVal = longVal; // long to float

        System.out.println("Implicit Type Conversion:");
        System.out.println("int value: " + intVal);
        System.out.println("Converted to long: " + longVal);
        System.out.println("Converted to float: " + floatVal);

        // Explicit Type Conversion (Narrowing Conversion)
        double doubleVal = 100.04;
        long longVal2 = (long) doubleVal; // double to long
        int intVal2 = (int) longVal2; // long to int

        System.out.println("\nExplicit Type Conversion:");
        System.out.println("double value: " + doubleVal);
        System.out.println("Converted to long: " + longVal2);
        System.out.println("Converted to int: " + intVal2);
    }
}
