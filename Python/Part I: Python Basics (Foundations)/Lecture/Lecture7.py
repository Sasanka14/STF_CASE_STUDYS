# Functions in Python

# Simple Function Definition
def greet():
    print("Hello! I'm Sasanka S Kundu from Demis Hassabis!")

greet()


#  Function with Parameters
def square(num):
    print("The square is:", num * num)

square(5)


#  Function with Docstring
def add(a, b):
    """This function adds two numbers."""
    return a + b

print(add.__doc__)       # Prints the docstring
print("Sum =", add(10, 15))


#  Positional & Keyword Arguments
def student(name, age):
    print("Name:", name, "| Age:", age)

# Positional arguments
student("Panda", 19)

# Keyword arguments
student(age=22, name="Sasanka")


# Default Arguments
def power(base, exponent=2):
    """Raises base to the power of exponent (default = 2)."""
    return base ** exponent

print("3² =", power(3))
print("3⁴ =", power(3, 4))


# Variable-Length Arguments (*args)
def sum_all(*numbers):
    total = sum(numbers)
    print("Sum =", total)

sum_all(10, 20, 30)
sum_all(1, 2, 3, 4, 5)


#  Return Statement

# Single return value
def multiply(x, y):
    return x * y

result = multiply(4, 5)
print("Multiplication result =", result)


# Multiple return values
def arithmetic(a, b):
    return a + b, a - b, a * b

add_res, sub_res, mul_res = arithmetic(10, 4)
print("Sum =", add_res, "| Difference =", sub_res, "| Product =", mul_res)


# Return without value (implicit None)
def show():
    print("This function prints something but returns nothing.")

value = show()
print("Returned:", value)


# Local vs Global Variables
x = 10  # Global variable

def demo():
    x = 5  # Local variable (shadows the global one)
    print("Inside function:", x)

demo()
print("Outside function:", x)


# Using global Keyword
count = 100  # Global variable

def increment():
    global count
    count += 1

increment()
print("count =", count)


# Nested Functions & Enclosing Scope
def outer():
    msg = "Outer Message"

    def inner():
        print("Accessing from inner:", msg)

    inner()

outer()
