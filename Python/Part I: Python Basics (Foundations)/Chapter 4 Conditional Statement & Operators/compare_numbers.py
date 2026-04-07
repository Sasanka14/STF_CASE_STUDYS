# compare_numbers.py
# Take two numbers; print which is greater or equal.

a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

if a > b:
    print(f"{a} is greater than {b}.")
elif a < b:
    print(f"{b} is greater than {a}.")
else:
    print(f"Both numbers are equal.")
