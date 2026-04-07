# Concept: Dictionary to store key-value pairs and find max value

students = {}

for i in range(5):
    name = input(f"Enter name of student {i+1}: ")
    marks = float(input(f"Enter marks of {name}: "))
    students[name] = marks

topper_name = None
topper_marks = -1

for name, marks in students.items():
    if marks > topper_marks:
        topper_marks = marks
        topper_name = name

print("Topper:", topper_name, "with marks", topper_marks)
