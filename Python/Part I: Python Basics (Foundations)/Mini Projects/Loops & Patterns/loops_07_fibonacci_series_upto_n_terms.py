# Concept: Generating Fibonacci sequence using loop

n = int(input("Enter number of terms: "))

if n <= 0:
    print("Please enter a positive integer.")
else:
    a, b = 0, 1
    count = 0
    print("Fibonacci series:")

    while count < n:
        print(a)
        next_term = a + b
        a = b
        b = next_term
        count += 1
