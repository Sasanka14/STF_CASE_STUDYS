# Concept: Nested loops and spacing for centered pyramid

rows = int(input("Enter number of rows: "))

for i in range(1, rows + 1):
    spaces = rows - i
    stars = 2 * i - 1
    print(" " * spaces + "*" * stars)
