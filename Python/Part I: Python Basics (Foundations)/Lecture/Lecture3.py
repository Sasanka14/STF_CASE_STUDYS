# Arithmetic Operations
# Given two numbers, perform and print the results of various arithmetic operations.
a = 10
b = 3
print("Given a =", a, "and b =", b)
# Addition
print("Addition:", a + b)
# Subtraction
print("Subtraction:", a - b)
# Multiplication
print("Multiplication:", a * b)
# Division
print("Division:", a / b)
# Floor Division
print("Floor Division:", a // b)
# Modulus
print("Modulus:", a % b)
# Exponentiation
print("Exponentiation:", a ** b)

# Assignment Operations
# Start with a variable and modify it using different assignment operations.
x = 10 
x += 5  # x = x + 5
print("After += 5, x =", x)
x *=2  # x = x * 2
print("After *= 2, x =", x)

# Comparison Operations
# Compare two numbers using various comparison operators and print the results.
m = 10
n = 20
print("Given m =", m, "and n =", n)
print("m == n:", m == n)
print("m != n:", m != n)
print("m > n:", m > n)
print("m < n:", m < n)
print("m >= n:", m >= n)
print("m <= n:", m <= n)

# Logical Operations
# Use logical operators to combine boolean expressions and print the results.
x = 7
print(x > 5 and x < 10)  # True
print(x > 10 or x == 7)  # True
print(not(x < 5))  # True

# Membership Operations
# Check for membership of elements in a list and print the results.
word = "python"
print("'y' in word:", 'y' in word)  # True
print("'z' not in word:", 'z' not in word)  # True

# Identity Operations
# Compare two variables to check if they refer to the same object.
a = [1, 2, 3]
b = a
c = [1, 2, 3]
print("a is b:", a is b)  # True
print("a is c:", a is c)  # False
print("a is not c:", a is not c)  # True

# Control Flow 
#If Statements
num = 5
if num > 0:
    print("The number is positive.")

#If-Else Statements
num = 7
if num % 2 == 0:
    print("The number is even.")
else:
    print("The number is odd.")

#If-Elif-Else Statements
marks = 17
if marks >= 90:
    print("Grade : A+")
elif marks >= 75:
    print("Grade : A")
elif marks >= 60:
    print("Grade : B")
else:
    print("Grade : C")

# Nested If Statements
num = 15
if num > 0:
    if num % 2 == 0:
        print("The number is positive and even.")
    else:
        print("The number is positive and odd.")

# Nested If-Else Statements
num = -8
if num >= 0:
    if num == 0:
        print("The number is zero.")
    else:
        print("The number is positive.")
else:
    print("The number is negative.")

# Nested If-Elif-Else Statements
marks = 85
if marks >= 0 and marks <= 100:
    if marks >= 90:
        print("Grade : A+")
    elif marks >= 75:
        print("Grade : A")
    elif marks >= 60:
        print("Grade : B")
    else:
        print("Grade : C")
else:
    print("Invalid marks entered.")

# Combined Logical Flow Example
age = int(input("Enter your age: "))
if age >= 18 and age < 65:
    print("You are eligible to work.")
    if age >= 60:
        print("You are eligible for senior citizen benefits.")
    else:
        print("You are not eligible for senior citizen benefits.")
else:
    if age < 18:
        print("You are not eligible to work.")
    else:
        print("You are retired.")