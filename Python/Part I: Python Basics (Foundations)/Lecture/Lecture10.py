# Different ways to Import Modules

# Importing the entire module
import math
print("Square root of 25 using full module import:", math.sqrt(25))  # 5.0

# Importing specific functions from a module
from math import factorial, pow
print("Factorial of 6 using specific function import:", factorial(6))  # 720
print("2 raised to the power 8 using specific function import:", pow(2, 8))  # 256.0

# Importing a module with an alias
import random as rnd
print("Random integer between 1 and 100 using alias import:", rnd.randint(1, 100))  # Random integer between 1 and 100  

# Importing specific functions with aliases
from datetime import datetime as dt, timedelta as td
now = dt.now()
print("Current date and time using alias import:", now)
future_date = now + td(days=10)
print("Date and time after 10 days using alias import:", future_date)
date_diff = future_date - now
print("Difference in days from specific date to now:", date_diff.days, "days")

# Importing Multiple Modules in a Single Line
import os, sys

# Display current working directory (from os module)
print("Current Working Directory using multiple imports:", os.getcwd())

# Display Python version (from sys module)
print("Python version using multiple imports:", sys.version)

# Display system platform and executable path for extra clarity
print("System platform:", sys.platform)
print("Python executable path:", sys.executable)
