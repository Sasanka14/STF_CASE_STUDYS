# Concept: Dictionary deletion using del

n = int(input("How many key-value pairs? "))
d = {}

for i in range(n):
    key = input(f"Enter key {i+1}: ")
    value = input(f"Enter value for '{key}': ")
    d[key] = value

print("Original dictionary:", d)

remove_key = input("Enter key to remove: ")

if remove_key in d:
    del d[remove_key]
    print("Updated dictionary:", d)
else:
    print("Key not found.")
