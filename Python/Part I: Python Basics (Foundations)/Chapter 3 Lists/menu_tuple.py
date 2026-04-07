# menu_tuple.py
# Tuple menu of 5 items; attempt to change → error.

menu = ("Rice", "Dal", "Paneer", "Soup", "Salad")

print("Original menu:")
for item in menu:
    print("-", item)

# menu[0] = "Chicken"   # ❌ TypeError: 'tuple' object does not support item assignment

menu = ("Rice", "Dal", "Chicken", "Fish", "Dessert")
print("\nUpdated menu:")
for item in menu:
    print("-", item)
