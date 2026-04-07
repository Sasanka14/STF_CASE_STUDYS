# Concept: Collecting all values and using a set to find unique ones

n = int(input("How many key-value pairs? "))
d = {}

for i in range(n):
    key = input(f"Enter key {i+1}: ")
    value = input(f"Enter value for '{key}': ")
    d[key] = value

print("Dictionary:", d)

all_values = list(d.values())
unique_values = set(all_values)

print("Number of unique values:", len(unique_values))
print("Unique values:", unique_values)
