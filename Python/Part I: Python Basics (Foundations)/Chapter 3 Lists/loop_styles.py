# loop_styles.py
# Demonstrate enumerate, zip, and comprehension.

items = ["a", "b", "c"]

# Using enumerate
for index, value in enumerate(items, start=1):
    print(f"Item {index}: {value}")

# Using zip
numbers = [1, 2, 3]
letters = ["x", "y", "z"]
for num, letter in zip(numbers, letters):
    print(num, "->", letter)

# List comprehension (squares of even numbers only)
squares = [n**2 for n in range(10) if n % 2 == 0]
print("Squares of even numbers:", squares)
