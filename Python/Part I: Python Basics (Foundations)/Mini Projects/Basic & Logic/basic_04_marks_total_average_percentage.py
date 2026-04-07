# Concept: List usage, arithmetic, basic statistics

marks = []
for i in range(1, 6):
    m = float(input(f"Enter marks of subject {i}: "))
    marks.append(m)

total = 0
for m in marks:
    total += m

average = total / 5
percentage = (total / (5 * 100)) * 100  # assuming each subject out of 100

print("Total:", total)
print("Average:", average)
print("Percentage:", percentage)
