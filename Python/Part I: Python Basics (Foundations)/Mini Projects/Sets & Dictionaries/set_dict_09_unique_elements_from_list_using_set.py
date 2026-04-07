# Concept: Using set to remove duplicates from a list

n = int(input("How many elements in list? "))
lst = []

for i in range(n):
    val = input(f"Enter element {i+1}: ")
    lst.append(val)

print("Original list:", lst)

unique_set = set(lst)
print("Unique elements (using set):", unique_set)
