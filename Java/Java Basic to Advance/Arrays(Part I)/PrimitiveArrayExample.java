/*Demonstrate how to creating an Array. */
public class PrimitiveArrayExample {
    public static void main(String[] args) {
        // Array of integers
        int[] intArray = {1, 2, 3, 4, 5};
        
        // Array of characters
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        
        // Array of floats
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        
        // Array of doubles
        double[] doubleArray = {1.11, 2.22, 3.33, 4.44, 5.55};
        
        // Array of booleans
        boolean[] booleanArray = {true, false, true, false, true};
        
        // Array of longs
        long[] longArray = {10000000001L, 10000000002L, 10000000003L, 10000000004L, 10000000005L};
        
        // Array of shorts
        short[] shortArray = {10, 20, 30, 40, 50};
        
        // Array of bytes
        byte[] byteArray = {1, 2, 3, 4, 5};
        
        // Print all array elements
        System.out.println("Integer Array:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Character Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        System.out.println("Float Array:");
        for (float f : floatArray) {
            System.out.print(f + " ");
        }
        System.out.println("\n");

        System.out.println("Double Array:");
        for (double d : doubleArray) {
            System.out.print(d + " ");
        }
        System.out.println("\n");

        System.out.println("Boolean Array:");
        for (boolean b : booleanArray) {
            System.out.print(b + " ");
        }
        System.out.println("\n");

        System.out.println("Long Array:");
        for (long l : longArray) {
            System.out.print(l + " ");
        }
        System.out.println("\n");

        System.out.println("Short Array:");
        for (short s : shortArray) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        System.out.println("Byte Array:");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
