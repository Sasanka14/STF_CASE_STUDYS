"""Python Program to create a Student Marks Analyzer tht performs the following tasks:
1. Continuously ask the user to enter marks for different students (between 0 and 100)
2. The user can type -1 to stop entering marks.
3. The Program should: 
   a. Ignore any negative numbers (except -1) using continue
   b. Stop taking input when -1 is entered using break
4. After input is complete, display:
   a. Total number of  subjects entered
   b. Total marks obtained
   c. Average marks
   d. A grade based on the average marks using the following criteria:
      - A: 90-100
      - B: 80-89
      - C: 70-79
      - D: 60-69
      - F: Below 60
5. Finally, use a for loop and range function to display all possible grades from A to F. and their corresponding score ranges.
"""
total_marks = 0
subject_count = 0
print("Enter student marks between 0 and 100. Type -1 to finish.")
while True:
    try:
        marks = float(input("Enter marks: "))
        
        if marks == -1:
            break  # Stop input on -1
        elif marks < 0 or marks > 100:
            print("Invalid marks! Please enter a number between 0 and 100.")
            continue  # Ignore invalid marks
        
        total_marks += marks
        subject_count += 1
    except ValueError:
        print("Invalid input! Please enter a valid number.")

if subject_count > 0:
    average_marks = total_marks / subject_count
    print(f"\nTotal subjects entered: {subject_count}")
    print(f"Total marks obtained: {total_marks}")
    print(f"Average marks: {average_marks:.2f}")
    
    # Determine grade based on average marks
    if 90 <= average_marks <= 100:
        grade = 'A'
    elif 80 <= average_marks < 90:
        grade = 'B'
    elif 70 <= average_marks < 80:
        grade = 'C'
    elif 60 <= average_marks < 70:
        grade = 'D'
    else:
        grade = 'F'
    
    print(f"Grade: {grade}")
    
    # Display all possible grades and their score ranges
    print("\nPossible Grades and their Score Ranges:")
    grades_ranges = {
        'A': '90-100',
        'B': '80-89',
        'C': '70-79',
        'D': '60-69',
        'F': 'Below 60'
    }
    
    for g, r in grades_ranges.items():
        print(f"Grade {g}: {r}")
else:
    print("No valid marks were entered.")

