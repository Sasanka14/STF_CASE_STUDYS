"""Write a Python Program to analyze student's scores in a quiz. The program should:
1. Print how many students took the quiz.
2. Calculate and print the average score, highest score, lowest score.
3. Identify and print the highest and lowest scores.
4. Print the Total Score of all students."""

import math

def analyze_scores(scores):
    # Step 1: Number of students
    total_students = len(scores)
    print(f"Total students who took the quiz: {total_students}")

    # Step 2: Calculate stats
    total_score = sum(scores)
    avg_score = math.floor(total_score / total_students) if total_students else 0
    highest_score = max(scores)
    lowest_score = min(scores)

    # Step 3: Print results
    print(f"Total Score of all students: {total_score}")
    print(f"Average Score: {avg_score}")
    print(f"Highest Score: {highest_score}")
    print(f"Lowest Score: {lowest_score}")

    # Step 4: Identify top and low scorers
    """
    for i, score in enumerate(scores):
        if score == highest_score:
            print(f"Student {i + 1} has the highest score: {highest_score}")
        if score == lowest_score:
            print(f"Student {i + 1} has the lowest score: {lowest_score}")
    """     
    
    top_students = [i + 1 for i, score in enumerate(scores) if score == highest_score]
    low_students = [i + 1 for i, score in enumerate(scores) if score == lowest_score]

    print(f"Student(s) with highest score ({highest_score}): {top_students}")
    print(f"Student(s) with lowest score ({lowest_score}): {low_students}")


#  Input Section
print("=== Quiz Score Analyzer ===")
while True:
    try:
        num_students = int(input("Enter the number of students: "))
        if num_students <= 0:
            print("Number of students must be positive.")
            continue
        break
    except ValueError:
        print("Please enter a valid number.")

scores = []

for i in range(num_students):
    while True:
        try:
            score = float(input(f"Enter score of student {i+1}: "))
            if 0 <= score <= 100:
                scores.append(score)
                break
            else:
                print("Score must be between 0 and 100.")
        except ValueError:
            print("Please enter a valid numeric score.")

# Call 
analyze_scores(scores)