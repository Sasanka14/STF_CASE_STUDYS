# copy_lists.py
# Copy a list of foods correctly with [:].

foods = ["Pizza", "Burger", "Pasta"]
friend_foods = foods[:]   # correct copy

foods.append("Sandwich")
friend_foods.append("Salad")

print("My favorite foods:", foods)
print("My friend's favorite foods:", friend_foods)

