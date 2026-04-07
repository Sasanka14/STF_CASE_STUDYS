import java.util.*;

public class gcd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        int n = sc.nextInt();
        int d = sc.nextInt();
        int r;

        while (d != 0) {
            r = n % d;
            n = d;
            d = r;
            }

        System.out.println("GCD is: " + n);
        sc.close();
     }
}
