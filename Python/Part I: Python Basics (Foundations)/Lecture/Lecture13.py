
# File Handling

# NOTE: Update the file paths as per your system if needed.

# Reading the entire file content as a single string
with open("/Users/zoro/Developer/Python/Part I: Python Basics (Foundations)/Lecture/demo.txt", "r") as f:
    pdf = f.read()              # reads the whole file
    print("=== read() output ===")
    print(pdf)

# Reading only the first line of the file
with open("/Users/zoro/Developer/Python/Part I: Python Basics (Foundations)/Lecture/demo.txt", "r") as f:
    pdf = f.readline()          # reads a single line
    print("=== readline() output ===")
    print(pdf)

# Reading all lines of the file into a list
with open("/Users/zoro/Developer/Python/Part I: Python Basics (Foundations)/Lecture/demo.txt", "r") as f:
    pdf = f.readlines()         # returns a list of lines
    print("=== readlines() output ===")
    print(pdf)

# Reading a binary file (like a PDF)
with open("/Users/zoro/Developer/Python/Part I: Python Basics (Foundations)/Practice Question/Assignmnet 3/Python Keywords.pdf", "rb") as f:
    pdf = f.read()              # reads raw bytes
    print("=== Binary read() output (bytes) ===")
    print(pdf)


# Lambda Functions

# Simple lambda function (anonymous function)
# Currently it returns the same value; you can change to x**2 for a real square.
square = lambda x: x
print("=== Lambda square ===")
print(square(5))   # Output: 5

# Using lambda as a key function for sorting
students = [("Ram", 20), ("Sasanka", 20), ("Panda", 18)]

# Sort by age (the second element of each tuple)
students.sort(key=lambda x: x[1])
print("=== Sorted students by age ===")
print(students)


# Decorators – Basic Example

# A decorator that prints messages before and after the function call
def greet_decorator(func):
    def wrapper():
        print("Print Before System Call")
        func()
        print("Print After System Call")
    return wrapper

# Applying the decorator using @syntax
@greet_decorator
def say_hello():
    print("Hello I am Sasanka")

print("=== greet_decorator Demo ===")
say_hello()

print("Program finished.") 


# Decorators – Smart Divide Example

# A decorator to safely divide two numbers (checks division by zero)
def smart_divide(func):
    def wrapper(a, b):
        print(f"Dividing {a} by {b}")
        if b == 0:
            print("Cannot divide by zero")
            return
        return func(a, b)
    return wrapper

@smart_divide
def divide(a, b):
    print(a / b)

print("=== smart_divide Demo ===")
divide(10, 2)   # Valid division
divide(5, 0)    # Will trigger zero-division protection


# Generators

# A simple generator that yields numbers from 1 to n
def count_up_to(n):
    i = 1
    while i <= n:
        yield i
        i += 1

print("Generator count_up_to Demo")
for num in count_up_to(5):
    print(num)
