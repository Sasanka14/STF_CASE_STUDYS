import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int[] marks = new int[5];

    Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    double calculateAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total / 5.0;
    }

    char getGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }
}

public class StudentRecordManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            int[] marks = new int[5];
            System.out.println("Enter marks for 5 subjects:");
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }
            sc.nextLine(); // Consume newline
            students[i] = new Student(name, roll, marks);
        }

        System.out.println("\n--- Student Results ---");
        for (Student s : students) {
            System.out.println("Name: " + s.name);
            System.out.println("Average Marks: " + s.calculateAverage());
            System.out.println("Grade: " + s.getGrade());
            System.out.println("-----------------------");
        }

        sc.close();
    }
}
