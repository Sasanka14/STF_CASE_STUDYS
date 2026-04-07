# Concept: List creation from input and sorting

numbers = []

for i in range(10):
    n = float(input(f"Enter number {i+1}: "))
    numbers.append(n)

# Sort in descending order
sorted_numbers = sorted(numbers, reverse=True)

second_largest = sorted_numbers[1]

print("Second largest number is:", second_largest)
