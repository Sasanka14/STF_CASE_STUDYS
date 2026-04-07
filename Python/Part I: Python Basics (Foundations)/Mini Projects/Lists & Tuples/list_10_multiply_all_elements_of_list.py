# Concept: Iterative multiplication of list elements

n = int(input("How many numbers? "))
numbers = []

for i in range(n):
    val = float(input(f"Enter number {i+1}: "))
    numbers.append(val)

product = 1
for num in numbers:
    product *= num

print("Product of all elements:", product)
