/*Java Math Methods. */
public class MathMethodsDemo {

    public static void main(String[] args) {
        double a = 16.0;
        double b = 2.5;
        int x = -10;
        int y = 7;

        // Math.abs() - Returns the absolute value
        System.out.println("Math.abs(" + x + ") = " + Math.abs(x));

        // Math.acos() - Returns the arc cosine of a value
        System.out.println("Math.acos(1.0) = " + Math.acos(1.0));

        // Math.asin() - Returns the arc sine of a value
        System.out.println("Math.asin(1.0) = " + Math.asin(1.0));

        // Math.atan() - Returns the arc tangent of a value
        System.out.println("Math.atan(1.0) = " + Math.atan(1.0));

        // Math.cbrt() - Returns the cube root of a value
        System.out.println("Math.cbrt(" + a + ") = " + Math.cbrt(a));

        // Math.ceil() - Returns the smallest integer greater than or equal to the argument
        System.out.println("Math.ceil(" + b + ") = " + Math.ceil(b));

        // Math.cos() - Returns the cosine of a value
        System.out.println("Math.cos(0) = " + Math.cos(0));

        // Math.cosh() - Returns the hyperbolic cosine of a value
        System.out.println("Math.cosh(1.0) = " + Math.cosh(1.0));

        // Math.exp() - Returns Euler's number e raised to the power of a value
        System.out.println("Math.exp(1.0) = " + Math.exp(1.0));

        // Math.expm1() - Returns e raised to the power of a value minus 1
        System.out.println("Math.expm1(1.0) = " + Math.expm1(1.0));

        // Math.floor() - Returns the largest integer less than or equal to the argument
        System.out.println("Math.floor(" + b + ") = " + Math.floor(b));

        // Math.hypot() - Returns sqrt(x^2 + y^2) without intermediate overflow or underflow
        System.out.println("Math.hypot(3, 4) = " + Math.hypot(3, 4));

        // Math.log() - Returns the natural logarithm (base e) of a value
        System.out.println("Math.log(" + a + ") = " + Math.log(a));

        // Math.log10() - Returns the base 10 logarithm of a value
        System.out.println("Math.log10(" + a + ") = " + Math.log10(a));

        // Math.max() - Returns the greater of two values
        System.out.println("Math.max(" + x + ", " + y + ") = " + Math.max(x, y));

        // Math.min() - Returns the smaller of two values
        System.out.println("Math.min(" + x + ", " + y + ") = " + Math.min(x, y));

        // Math.pow() - Returns the value of the first argument raised to the power of the second argument
        System.out.println("Math.pow(" + a + ", " + b + ") = " + Math.pow(a, b));

        // Math.random() - Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
        System.out.println("Math.random() = " + Math.random());

        // Math.round() - Returns the closest long or int, rounding half up
        System.out.println("Math.round(" + b + ") = " + Math.round(b));

        // Math.signum() - Returns the signum function of the argument; zero if the argument is zero, 1.0 if the argument is greater than zero, -1.0 if the argument is less than zero
        System.out.println("Math.signum(" + x + ") = " + Math.signum(x));

        // Math.sin() - Returns the sine of a value
        System.out.println("Math.sin(0) = " + Math.sin(0));

        // Math.sinh() - Returns the hyperbolic sine of a value
        System.out.println("Math.sinh(1.0) = " + Math.sinh(1.0));

        // Math.sqrt() - Returns the correctly rounded positive square root of a value
        System.out.println("Math.sqrt(" + a + ") = " + Math.sqrt(a));

        // Math.tan() - Returns the tangent of a value
        System.out.println("Math.tan(0) = " + Math.tan(0));

        // Math.tanh() - Returns the hyperbolic tangent of a value
        System.out.println("Math.tanh(1.0) = " + Math.tanh(1.0));

        // Math.toDegrees() - Converts an angle measured in radians to an approximately equivalent angle measured in degrees
        System.out.println("Math.toDegrees(Math.PI) = " + Math.toDegrees(Math.PI));

        // Math.toRadians() - Converts an angle measured in degrees to an approximately equivalent angle measured in radians
        System.out.println("Math.toRadians(180) = " + Math.toRadians(180));

        // Math.ulp() - Returns the size of an ulp of the argument
        System.out.println("Math.ulp(1.0) = " + Math.ulp(1.0));
    }
}
