# -------------------------------
# Assignment No: 1
# -------------------------------

# Q1: Print your name, department, and favorite subject using print().
print("\nQ1 Solution:")
print("Name     : Sasanka Sekhar Kundu")
print("Department: Computer Science & Engineering")
print("Favorite Subject: Data Structures & Algorithms")

# Q2: Create two variables x = 7 and y = 4, then print their sum, difference, and product.
print("\nQ2 Solution:")
x = 7
y = 4
print("x + y =", x + y)
print("x - y =", x - y)
print("x * y =", x * y)

# Q3: Write a code snippet with both single-line and multi-line comments.
print("\nQ3 Solution:")
# This is a single-line comment
"""
This is a multi-line comment.
It is used to explain the code.
"""
print("Demonstration of comments in Python")

# Q4: Create variables for your roll number, marks, and result status (pass/fail). Display them.
print("\nQ4 Solution:")
roll_no = "CSE-2025-001"
marks = 86.5
is_pass = True
print("Roll No:", roll_no)
print("Marks  :", marks)
print("Result :", "Pass" if is_pass else "Fail")

# Q5: Declare variables of types int, float, bool, and str and print their types.
print("\nQ5 Solution:")
a_int = 42
b_float = 3.1415
c_bool = False
d_str = "ITM Skills University"
print(type(a_int), a_int)
print(type(b_float), b_float)
print(type(c_bool), c_bool)
print(type(d_str), d_str)

# Q6: Take two inputs from the user (name and age) and display a welcome message.
print("\nQ6 Solution:")
name = input("Enter your name: ")
age = input("Enter your age: ")
print(f"Welcome, {name}! Age recorded as {age}.")

# Q7: Convert a number entered as a string into an integer and print the result.
print("\nQ7 Solution:")
num_str = input("Enter a number (as text): ")
try:
    num_int = int(num_str.strip())
    print("Converted integer:", num_int)
except ValueError:
    print("Invalid input! Please enter digits only.")

# Q8: Use type() to show the data types of three different variables.
print("\nQ8 Solution:")
x = 10
y = 2.5
z = "AgriNext"
print(f"x={x} ->", type(x))
print(f"y={y} ->", type(y))
print(f"z='{z}' ->", type(z))

# Q9: Demonstrate dynamic typing by assigning different data types to the same variable.
print("\nQ9 Solution:")
v = 10
print(v, "->", type(v))
v = 10.0
print(v, "->", type(v))
v = "ten"
print(v, "->", type(v))
v = True
print(v, "->", type(v))

# Q10: Write a small program that reads two numbers, adds them, and displays both the result and its type.
print("\nQ10 Solution:")
try:
    a = float(input("Enter first number: "))
    b = float(input("Enter second number: "))
    result = a + b
    print("Sum:", result)
    print("Type of result:", type(result))
except ValueError:
    print("Please enter valid numbers.")

# Q11: Write a program that checks whether a number entered by the user is positive, negative, or zero.
print("\nQ11 Solution:")
try:
    n = float(input("Enter a number: "))
    if n > 0:
        print("Positive")
    elif n < 0:
        print("Negative")
    else:
        print("Zero")
except ValueError:
    print("Invalid input! Please enter a number.")