# Loops and control flow in Python
# This script demonstrates the use of loops and control flow statements in Python.
# For Loop Example
print("For Loop Example:")
for i in range(1, 11):
    square = i * i
    print(f"The square of {i} is {square}")
    
# While Loop Example
print("\nWhile Loop Example:")
count = 1
while count <= 5:
    print(f"Count is: {count}")
    count += 1
    
# Break Statement Example
print("\nBreak Statement Example:")
for i in range(1, 11):
    if i == 6:
        print("Breaking the loop at i =", i)
        break
    print(i)

# Continue Statement Example
print("\nContinue Statement Example:")
for i in range(1, 11):
    if i % 2 == 0:
        continue  # Skip even numbers
    print(i)

# Range Function Example
print("\nRange Function Example:")
for i in range(5, 16, 2):  # Start at 5, end before 16, step by 2
    print(i)
