# Python Built-in Functions & Modules
# Common Built-in Function

numbers = [5, 2, 9, 1, 5, 6]

print("Length of numbers list:", len(numbers))          # 6
print("Maximum number:", max(numbers))                  # 9
print("Minimum number:", min(numbers))                  # 1
print("Sum of all numbers:", sum(numbers))              # 28
print("Sorted numbers:", sorted(numbers))               # [1, 2, 5, 5, 6, 9]
print("Round 3.14159 to 2 decimal places:", round(3.14159, 2))  # 3.14

# Importing and Using math Module
import math

print("\n--- Math Module Examples ---")
print("Square root of 16:", math.sqrt(16))              # 4.0
print("Cube root of 27:", math.pow(27, 1/3))            # 3.0
print("Value of Pi:", math.pi)                           # 3.141592653589793
print("Power of 2^5:", math.pow(2, 5))                  # 32.0
print("Ceiling of 4.2:", math.ceil(4.2))                # 5
print("Floor of 4.7:", math.floor(4.7))                 # 4
print("Factorial of 5:", math.factorial(5))             # 120

# Importing and Using random Module
import random

print("\n--- Random Module Examples ---")
print("Random float between 0.0 to 1.0:", random.random())
print("Random integer between 1 and 10:", random.randint(1, 10))
print("Random choice from the list:", random.choice(['apple', 'banana', 'cherry']))
print("List of 5 unique random numbers (0–99):", random.sample(range(100), 5))

# Shuffle a list
numbers = list(range(1, 31))
random.shuffle(numbers)
print("Shuffled numbers list:", numbers)

# Importing and Using datetime Modul
import datetime

print("\n--- Datetime Module Examples ---")
now = datetime.datetime.now()

print("Current date and time:", now)
print("Current year:", now.year)
print("Current month:", now.month)
print("Current day:", now.day)
print("Current hour:", now.hour)
print("Current minute:", now.minute)
print("Current second:", now.second)

# Formatting date and time
formatted_date = now.strftime("%Y-%m-%d %H:%M:%S")
print("Formatted date and time:", formatted_date)

# Creating a specific date
specific_date = datetime.datetime(2023, 1, 1, 0, 0, 0)
print("Specific date:", specific_date)

# Calculating difference in days
date_diff = now - specific_date
print("Days since specific date:", date_diff.days)
