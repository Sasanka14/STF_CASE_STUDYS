# buffet.py
# Create a tuple of 5 foods, try to modify → error, then redefine tuple.

foods = ("Rice", "Dal", "Paneer", "Salad", "Soup")

print("Original menu:")
for food in foods:
    print("-", food)

# Trying to modify (will cause error if uncommented)
# foods[0] = "Chicken"   # ❌ TypeError: 'tuple' object does not support item assignment

# Redefine tuple (allowed)
foods = ("Rice", "Dal", "Chicken", "Fish", "Dessert")

print("\nUpdated menu:")
for food in foods:
    print("-", food)
