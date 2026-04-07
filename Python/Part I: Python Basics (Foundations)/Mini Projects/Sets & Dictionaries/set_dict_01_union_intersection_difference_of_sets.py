# Concept: Set operations - union, intersection, difference

set1 = set()
set2 = set()

n1 = int(input("How many elements in first set? "))
for i in range(n1):
    val = input(f"Enter element {i+1} of first set: ")
    set1.add(val)

n2 = int(input("How many elements in second set? "))
for i in range(n2):
    val = input(f"Enter element {i+1} of second set: ")
    set2.add(val)

print("Set 1:", set1)
print("Set 2:", set2)

print("Union:", set1.union(set2))
print("Intersection:", set1.intersection(set2))
print("Difference (Set1 - Set2):", set1.difference(set2))
