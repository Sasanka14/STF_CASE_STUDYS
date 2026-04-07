"""Write a Short Python Program that randomly generates 5 numbers, displays their total, highest and lowest values,and square root of each."""

import random
import math
def analyze_random_numbers(count=5, lower=1, upper=100):
    # Generate random numbers
    random_numbers = [random.randint(lower, upper) for _ in range(count)]
    
    # Calculate total, highest, and lowest values
    total = sum(random_numbers)
    highest = max(random_numbers)
    lowest = min(random_numbers)
    
    # Calculate square root of each number
    square_roots = [math.sqrt(num) for num in random_numbers]
    
    return random_numbers, total, highest, lowest, square_roots

# Analyze random numbers
numbers, total, highest, lowest, square_roots = analyze_random_numbers()

# Display results
print("Generated Random Numbers:", numbers)
print("Total of Numbers:", total)
print("Highest Number:", highest)
print("Lowest Number:", lowest)