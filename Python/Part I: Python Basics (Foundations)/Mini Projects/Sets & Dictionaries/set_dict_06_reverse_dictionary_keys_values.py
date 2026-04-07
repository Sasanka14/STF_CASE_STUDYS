# Concept: Swapping keys and values in a dictionary

n = int(input("How many key-value pairs? "))
d = {}

for i in range(n):
    key = input(f"Enter key {i+1}: ")
    value = input(f"Enter value for '{key}': ")
    d[key] = value

print("Original dictionary:", d)

reversed_dict = {}
for key, value in d.items():
    reversed_dict[value] = key

print("Reversed dictionary (value as key):", reversed_dict)
