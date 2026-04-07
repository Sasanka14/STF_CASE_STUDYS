public class JavaBasicTypePromotion {
    public static void main(String[] args) {
        // Example 1: Promotion of byte, short, and char to int
        byte b = 42;
        char c = 'A';
        short s = 1024;
        int result1 = b + c + s;
        System.out.println("Result of byte + char + short (promoted to int): " + result1);

        // Example 2: Promotion of int to long
        int i = 50000;
        long l = 100000L;
        long result2 = i + l;
        System.out.println("Result of int + long (promoted to long): " + result2);

        // Example 3: Promotion of int to float
        float f = 5.67f;
        float result3 = i + f;
        System.out.println("Result of int + float (promoted to float): " + result3);

        // Example 4: Promotion of long to float
        float result4 = l + f;
        System.out.println("Result of long + float (promoted to float): " + result4);

        // Example 5: Promotion of float to double
        double d = 0.1234;
        double result5 = f + d;
        System.out.println("Result of float + double (promoted to double): " + result5);

        // Example 6: Complex expression promotion
        double complexResult = (b * s) + (i / c) - (d * l);
        System.out.println("Result of complex expression: " + complexResult);
    }
}
