# Concept: Iterative factorial calculation using for loop

n = int(input("Enter a non-negative integer: "))

factorial = 1

if n < 0:
    print("Factorial not defined for negative numbers.")
else:
    for i in range(1, n + 1):
        factorial *= i
    print(f"Factorial of {n} is {factorial}")
