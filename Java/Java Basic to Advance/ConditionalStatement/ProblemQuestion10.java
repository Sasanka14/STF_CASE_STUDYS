/*Q10. What will be the value of x & y in the following program:
         public class ProblemQuestion10{
            public static void main(String args[]) {
                int a = 63;
                int b = 36;
                boolean x= (a < b) ? true : false;
                int y= (a > b) ? a : b;
            } 
        }*/
public class ProblemQuestion10 {
    public static void main(String args[]) {
        int a = 63;
        int b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;
        
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }
}
          