"""Write a Python program to evaluate a students's results based on marks entered for five subjects. 
The program should calculate the total marks, percentage, and determine the grade based on the following criteria: 
- A: 90% and above 
- B: 80% to 89% 
- C: 70% to 79% 
- D: 60% to 69% 
- F: Below 60% 
and display a remark using operators such as arithmetic,comparison, membership , identity and logical operators."""

# Function to evaluate student's results
def evaluate_student_results(subjects, marks):
    # Arithmetic Operator: Calculate total marks
    total_marks = sum(marks)

    # Arithmetic Operator: Calculate percentage
    percentage = (total_marks / (len(marks) * 100)) * 100

    # Comparison & Logical Operators: Determine grade
    if percentage >= 90:
        grade = 'A'
    elif 80 <= percentage < 90:
        grade = 'B'
    elif 70 <= percentage < 80:
        grade = 'C'
    elif 60 <= percentage < 70:
        grade = 'D'
    else:
        grade = 'F'

    # Display results
    print("\n----- Student Result Summary -----")
    for i in range(len(subjects)):
        print(f"{subjects[i]}: {marks[i]}/100")

    print(f"\nTotal Marks: {total_marks}/500")
    print(f"Percentage: {percentage:.2f}%")
    print(f"Grade: {grade}")

    # Membership Operator: check if grade belongs to high-performance set
    if grade in ['A', 'B']:
        remark = "Excellent performance!"
    elif grade == 'C':
        remark = "Good effort, but there's room for improvement."
    elif grade == 'D':
        remark = "You passed, but consider studying harder."
    else:
        remark = "Unfortunately, you did not pass. Better luck next time."

    print(f"Remark: {remark}")

# Input Section

subjects = []
marks = []

print("Enter the names and marks of 5 subjects:\n")

for i in range(1, 6):
    subject = input(f"Enter name of subject {i}: ")
    subjects.append(subject)

    mark = float(input(f"Enter marks obtained in {subject} (out of 100): "))
    marks.append(mark)

# Logical Operator Example: Check if any mark is below 35 (fail condition)
if any(m < 35 for m in marks):
    print("\n⚠ Warning: One or more subjects have marks below 35. You may not pass overall.\n")

# Evaluate the student's results
evaluate_student_results(subjects, marks)
