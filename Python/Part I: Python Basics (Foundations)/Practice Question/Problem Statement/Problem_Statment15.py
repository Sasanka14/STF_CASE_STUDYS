"""Create a class that uses a constructor to initialize a student's name, age and marks, and a method to display the student's details."""
class Student:
    def __init__(self, name, age):
        # Constructor attributes
        self.name = name
        self.age = age
        self.marks = None 

    def mark_details(self, marks):
        # Method to set marks for the student
        self.marks = marks

    def display_details(self):
        # Method to display student information
        print(f"Student Name: {self.name}, Age: {self.age}, Marks: {self.marks}")
        

# Creating objects
s1 = Student("Sasanka", 19)
s2 = Student("Panda", 18)

# Setting marks
s1.mark_details(95)
s2.mark_details(90)

# Displaying information
s1.display_details()
s2.display_details()

