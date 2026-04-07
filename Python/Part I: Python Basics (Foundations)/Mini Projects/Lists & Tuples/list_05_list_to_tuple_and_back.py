# Concept: Type conversion between list and tuple

n = int(input("How many elements in list? "))
lst = []
for i in range(n):
    val = input(f"Enter element {i+1}: ")
    lst.append(val)

print("Original list:", lst)

tup = tuple(lst)
print("Converted to tuple:", tup)

lst_again = list(tup)
print("Converted back to list:", lst_again)
