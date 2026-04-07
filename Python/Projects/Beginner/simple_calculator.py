# simple_calculator.py

"""
Concepts:
- if / elif / else
- arithmetic operators
- input casting
- simple error handling
"""

def calculate(a, b, op):
    if op == "+":
        return a + b
    elif op == "-":
        return a - b
    elif op == "*":
        return a * b
    elif op == "/":
        if b == 0:
            raise ZeroDivisionError("Cannot divide by zero.")
        return a / b
    else:
        raise ValueError("Unsupported operator.")


def main():
    print("=== Simple Calculator ===")
    try:
        a = float(input("Enter first number: "))
        b = float(input("Enter second number: "))
        op = input("Enter operator (+, -, *, /): ").strip()

        result = calculate(a, b, op)
        print(f"Result: {a} {op} {b} = {result}")
    except ValueError as ve:
        print(f"Input error: {ve}")
    except ZeroDivisionError as zde:
        print(f"Math error: {zde}")


if __name__ == "__main__":
    main()
