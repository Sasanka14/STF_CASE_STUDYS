# Concept: List slicing to reverse

n = int(input("How many elements in list? "))
lst = []
for i in range(n):
    val = input(f"Enter element {i+1}: ")
    lst.append(val)

print("Original list:", lst)
reversed_list = lst[::-1]
print("Reversed list:", reversed_list)
