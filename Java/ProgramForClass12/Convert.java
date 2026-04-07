/* Q. Design a class Convert to find the date and the monthly from a given day number for a particular year.
      Example:
              If day number is 64 and the year is 2020,then the coreesponding date would be :
                    March 4,2020 i.e., (31 + 29 + 4 = 64)
Some of the members of the class are given below:
Class Nmae                                       : Convert
Data Member / Instance variable :
n                                                : integer to store the day number
d                                                : integer to store the day of the month(date)
m                                                : integer to store the month
y                                                : integer to store the year
Methods / Member Functions:
Convert()                                        : constructor to intilialise the data members with legal initial values
void accept()                                    : to accept the day number and the year
void day_to_date()                               : converts the day number to its corresponding date for a particular year and stores the date in 'd' and the month in 'm'
void display()                                   : display the month name , date and year
Specify the class Convert giving details of thr constructor(), void accept(), void day_to date() and void display(). Define a main() function to create an object and call
 the functions accordingly to enable the task. */
 //----------------------------------------------------------------------SOLUTION-------------------------------------------------------------------------------------------
 import java.util.Scanner;

public class Convert {
    private int n;
    private int d;
    private int m;
    private int y;

    // Constructor to initialize data members with legal initial values
    public Convert() {
        n = 0;
        d = 0;
        m = 0;
        y = 0;
    }

    // Function to accept the day number and the year
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number: ");
        n = scanner.nextInt();
        System.out.print("Enter the year: ");
        y = scanner.nextInt();
    }

    // Function to convert the day number to its corresponding date for a particular year
    // and store the date in 'd' and the month in 'm'
    public void dayToDate() {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = 1;

        while (n > daysInMonth[month]) {
            n -= daysInMonth[month];
            month++;
        }

        m = month;
        d = n;
    }

    // Function to display the month name, date, and year
    public void display() {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("Date: " + monthNames[m] + " " + d + ", " + y);
    }

    public static void main(String[] args) {
        // Create an object of the Convert class
        Convert obj = new Convert();

        // Call the accept() method to input day number and year
        obj.accept();

        // Call the dayToDate() method to convert day number to date
        obj.dayToDate();

        // Call the display() method to display the result
        obj.display();
    }
}
