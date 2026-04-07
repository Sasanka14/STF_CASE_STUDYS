# Concept: Searching in tuple and handling not-found case

n = int(input("How many elements in tuple? "))
temp_list = []

for i in range(n):
    val = input(f"Enter element {i+1}: ")
    temp_list.append(val)

tup = tuple(temp_list)
print("Tuple:", tup)

target = input("Enter value to find index: ")

if target in tup:
    index = tup.index(target)
    print("Index of", target, "is", index)
else:
    print("Value not present in tuple.")
