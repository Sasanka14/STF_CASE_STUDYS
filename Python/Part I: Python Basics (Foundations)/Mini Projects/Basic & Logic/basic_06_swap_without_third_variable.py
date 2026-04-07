# Concept: Swapping variables using arithmetic or tuple unpacking

a = input("Enter first value: ")
b = input("Enter second value: ")

print("Before swap: a =", a, ", b =", b)

# Using tuple unpacking (simple and pythonic)
a, b = b, a

print("After swap: a =", a, ", b =", b)
