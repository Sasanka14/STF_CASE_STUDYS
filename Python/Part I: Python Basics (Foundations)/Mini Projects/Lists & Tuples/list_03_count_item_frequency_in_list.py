# Concept: Frequency count using nested loops or dictionary

items = []

n = int(input("How many items? "))
for i in range(n):
    val = input(f"Enter item {i+1}: ")
    items.append(val)

freq = {}
for item in items:
    if item in freq:
        freq[item] += 1
    else:
        freq[item] = 1

print("Item frequencies:")
for key, value in freq.items():
    print(key, "->", value)
