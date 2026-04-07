# Concept: Removing duplicates manually using a new list

numbers = []

n = int(input("How many numbers? "))
for i in range(n):
    val = input(f"Enter value {i+1}: ")
    numbers.append(val)

unique_list = []
for item in numbers:
    if item not in unique_list:
        unique_list.append(item)

print("Original list:", numbers)
print("List without duplicates:", unique_list)
