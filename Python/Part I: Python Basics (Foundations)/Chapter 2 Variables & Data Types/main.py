# Variables 
price = 100
tax = 18 
total_price = price + tax
print("Total Price:", total_price)

# Input / Output
name = input("Enter your name: ")
print("Welcome,", name)

x = input("Enter a number: ")
y = input("Enter another number: ")
total = int(x) + int(y)  # avoid overwriting built-in 'sum'
print("The sum is:", total)

# Data Types
# String
# Changing case
name = "Sasanka"
print(name.title())
print(name.upper())
print(name.lower())

# Using Variables in strings (f-strings)
first = "Sasanka"
middle = "Sekhar"
last = "Kundu"
age = 20
print(f"My name is {first} {middle} {last} and I am {age} years old.")

# Whitespaces 
text = "  Hello, Panda  "
print(text)
text = "Hello\tPanda"
print(text)
text = "Hello\nPanda"
print(text)

# Strip Unwanted Whitespaces
text = "             Sasanka        "
print(text.strip())
print(text.lstrip())
print(text.rstrip())

# Numbers
# Integers 
int_num = 10
print("Integer:", int_num)

# Floats
float_num = 10.5
print("Float:", float_num)

# Complex Numbers
complex_num = 2 + 3j
print("Complex Number:", complex_num)

# Booleans
is_active = True
is_admin = False
print("Is Active:", is_active)
print("Is Admin:", is_admin)

# None Type
data = None
print("Data:", data)

# Multiple Assignments
# Assigning different values to multiple variables
a, b, c = 5, 10.5, 15
print(a)
print(b)
print(c)

# Assigning same value to multiple variables
# Immutable types
x = y = z = "Python"
print(x)
print(y)
print(z)

# Mutable types
list1 = list2 = list3 = [1, 2, 3]
print(f"List1: {list1}, List2: {list2}, List3: {list3}")
list1[0] = 99
print(f"After modification -> List1: {list1}, List2: {list2}, List3: {list3}")

# Using for loops with multiple assignments
data = [(1, 'apple'), (2, 'banana'), (3, 'cherry')]
for number, fruit in data:
    print(f"Number: {number}, Fruit: {fruit}")

# Swapping variables
a = 5
b = 10
print("Before Swap: a =", a, ", b =", b)
a, b = b, a
print("After Swap: a =", a, ", b =", b)

# Conventions
# Implicit Type Conversion
num_int = 10
num_float = 5.5
result = num_int + num_float
print(result)
print(type(result))

# Explicit Type Conversion
num_str = "123"
num_int = int(num_str)
print(num_int)
print(type(num_int))

# Comments
# Single-line comment
print("This is a single-line comment example.")

# Multi-line comment
# using multiple single-line comments
# It explains a complex piece of code
print("This is a multi-line comment example.")

# Documentation string (docstring)
"""This module demonstrates various aspects of
variables and data types in Python."""
print("This is a docstring example.")

# Zen of Python
import this