/*Q. Write a code that defines Java Function ----- Compare */
public class StringComparison{
    public static void main(String args[]){
        String Str1 = "Tony";
        String Str2 = "Tony";
        String Str3 = new String("Tony");
        
        if(Str1 == Str2){
            System.out.println("Strings are Equal.");
        }
        else{
            System.out.println("Strings are not Equal.");
        }
        if(Str2 == Str3){
            System.out.println("Strings are Equal.");
        }
        else{
            System.out.println("Strings are not Equal.");
        }
    }
}


/* Explanation:
    1. String literals (Str1 and Str2):
Str1 and Str2 are string literals, and in Java, string literals are stored in a special area called the String Constant Pool.
When two string literals have the same value (like "Tony"), they both point to the same object in the pool. That's why Str1 == Str2 returns true, as they reference the same object in memory.
    2.new String("Tony") (Str3):
Str3 is created using the new keyword, which explicitly creates a new object in the heap memory, even if the string value is the same as a literal.
So, Str1 == Str3 will return false because they are two different objects in memory, even though they have the same content. 
 */