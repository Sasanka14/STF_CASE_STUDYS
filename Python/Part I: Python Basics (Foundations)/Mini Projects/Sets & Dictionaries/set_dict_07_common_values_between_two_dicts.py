# Concept: Comparing dictionary values and using sets for common values

n1 = int(input("How many pairs in first dictionary? "))
dict1 = {}
for i in range(n1):
    key = input(f"Enter key {i+1} for dict1: ")
    value = input(f"Enter value for '{key}': ")
    dict1[key] = value

n2 = int(input("How many pairs in second dictionary? "))
dict2 = {}
for i in range(n2):
    key = input(f"Enter key {i+1} for dict2: ")
    value = input(f"Enter value for '{key}': ")
    dict2[key] = value

values1 = set(dict1.values())
values2 = set(dict2.values())

common = values1.intersection(values2)

print("Common values between two dictionaries:", common)
