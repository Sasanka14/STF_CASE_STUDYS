# seeing_the_world.py
# Use sorted(), reverse(), sort() on a travel list.

places = ["Tokyo", "Paris", "New York", "Maldives", "Switzerland"]

print("Original list:", places)

print("Sorted (temporary):", sorted(places))
print("Original after sorted():", places)

print("Reverse sorted (temporary):", sorted(places, reverse=True))

places.reverse()
print("Reversed list:", places)

places.reverse()
print("Back to original:", places)

places.sort()
print("Sorted (permanent):", places)

places.sort(reverse=True)
print("Reverse sorted (permanent):", places)
