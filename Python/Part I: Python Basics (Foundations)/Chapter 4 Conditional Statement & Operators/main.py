# Operators
# Arithmetic Operators
a = 15
b = 4
print("Addition:", a + b)          # 19
print("Subtraction:", a - b)       # 11
print("Multiplication:", a * b)    # 60
print("Division:", a / b)          # 3.75
print("Floor Division:", a // b)   # 3
print("Modulus:", a % b)           # 3
print("Exponentiation:", a ** b)   # 50625

# Assignment Operators
x = 20
x += 5   # x = x + 5
print("After += 5, x =", x)        # 25
x -= 10  # x = x - 10
print("After -= 10, x =", x)       # 15 
x *= 2   # x = x * 2
print("After *= 2, x =", x)        # 30
x /= 3   # x = x / 3
print("After /= 3, x =", x)        # 10.0   
x %= 4   # x = x % 4
print("After %= 4, x =", x)        # 2.0
x **= 3  # x = x ** 3
print("After **= 3, x =", x)       # 8.0

# Comparison / Relation  Operators
m = 12
n = 15
print("m == n:", m == n)           # False
print("m != n:", m != n)           # True
print("m > n:", m > n)             # False
print("m < n:", m < n)             # True
print("m >= n:", m >= n)           # False
print("m <= n:", m <= n)           # True

# Logical Operators
y = 8
print(y > 5 and y < 10)            # True
print(y > 10 or y == 8)            # True
print(not(y < 5))                  # True

# Membership Operators
text = "programming"
print("'g' in text:", 'g' in text)         # True
print("'z' not in text:", 'z' not in text) # True  

# Identity Operators
list1 = [4, 5, 6]
list2 = list1
list3 = [4, 5, 6]
print("list1 is list2:", list1 is list2)   # True
print("list1 is list3:", list1 is list3)   # False

# Conditional Statements
# If Statement
number = 10
if number > 0:
    print("The number is positive.")

# If-Else Statement
number = -5
if number >= 0:
    print("The number is non-negative.")
else:
    print("The number is negative.")   
    
# If-Elif-Else Statement
score = 85
if score >= 90:
    print("Grade: A")  
elif score >= 75:
    print("Grade: B")
elif score >= 60:
    print("Grade: C")
else:
    print("Grade: D")

# Nested If Statement
value = 20
if value > 0:
    if value % 2 == 0:
        print("The number is positive and even.")
    else:
        print("The number is positive and odd.")
    
# Nested If-Else Statement
value = -10
if value >= 0:
    if value == 0:
        print("The number is zero.")
    else:
        print("The number is positive.")
else:
    print("The number is negative.")
    
# Nested If-Elif-Else Statement
score = 72
if score >= 0 and score <= 100:
    if score >= 90:
        print("Grade: A")
    elif score >= 75:
        print("Grade: B")
    elif score >= 60:
        print("Grade: C")
    else:
        print("Grade: D")
else:
    print("Invalid score.")
    
# Multiple Conditions with Logical Operators
age = 25
income = 50000
if age > 18 and income > 30000:
    print("Eligible for loan.")
else:
    print("Not eligible for loan.")
    print("You are eligible for senior citizen benefits.")
if age >= 60:
    print("You are eligible for senior citizen benefits.")

# Checking Membership
fruits = ["apple", "banana", "cherry"]
if "banana" in fruits:
    print("Banana is available.")
else:
    print("Banana is not available.")
    
# Empty Structures Check
my_list = []
if not my_list:
    print("The list is empty.")
else:
    print("The list is not empty.")

# Boolean Variables
is_raining = True
if is_raining:
    print("Take an umbrella.")
else:
    print("No need for an umbrella.")

