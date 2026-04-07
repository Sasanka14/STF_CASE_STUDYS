# safe_remove.py
# Remove all even numbers safely.

items = [1, 2, 3, 4, 5, 6]

# Method 1: Iterate over a copy
for x in items[:]:
    if x % 2 == 0:
        items.remove(x)
print("After Method 1:", items)

# Reset list
items = [1, 2, 3, 4, 5, 6]

# Method 2: Build a new list
items = [x for x in items if x % 2 != 0]
print("After Method 2:", items)

