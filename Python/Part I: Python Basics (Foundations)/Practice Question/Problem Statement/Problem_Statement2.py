"""Build a basic calculator that performs addition, subtraction, multiplication, and division using functions for each operation.
The program should prompt the user to enter two numbers and the desired operation, then display the result.With the help of operators such as arithmetic,comparison, membership , identity and logical operators."""

# Define functions for arithmetic operations
def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    # Prevent division by zero
    if b == 0:
        return "Error! Division by zero is not allowed."
    return a / b


# --- Main Program ---
print("Welcome to Basic Calculator")
print("Operations: +  -  *  /")

# Take user input
num1 = float(input("Enter first number: "))
num2 = float(input("Enter second number: "))
operation = input("Enter operation (+, -, *, /): ")

# Arithmetic Operations
if operation == '+':
    result = add(num1, num2)
elif operation == '-':
    result = subtract(num1, num2)
elif operation == '*':
    result = multiply(num1, num2)
elif operation == '/':
    result = divide(num1, num2)
else:
    result = "Invalid operation!"

# Display result
print(f"Result: {result}")

# --- Comparison Operators ---
if isinstance(result, (int, float)):  # Identity operator (checks type)
    if result > 0:
        print(" The result is positive.")
    elif result < 0:
        print("The result is negative.")
    else:
        print("The result is zero.")

