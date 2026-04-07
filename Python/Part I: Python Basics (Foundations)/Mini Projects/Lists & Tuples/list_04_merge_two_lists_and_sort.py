# Concept: List concatenation and sorting

n1 = int(input("How many elements in first list? "))
list1 = []
for i in range(n1):
    val = int(input(f"Enter element {i+1} of first list: "))
    list1.append(val)

n2 = int(input("How many elements in second list? "))
list2 = []
for i in range(n2):
    val = int(input(f"Enter element {i+1} of second list: "))
    list2.append(val)

merged_list = list1 + list2
merged_list.sort()

print("Merged and sorted list:", merged_list)
