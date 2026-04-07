# Concept: Creating dictionary from two separate lists

n = int(input("How many key-value pairs? "))

keys = []
values = []

for i in range(n):
    k = input(f"Enter key {i+1}: ")
    keys.append(k)

for i in range(n):
    v = input(f"Enter value for key '{keys[i]}': ")
    values.append(v)

d = {}
for i in range(n):
    d[keys[i]] = values[i]

print("Constructed dictionary:", d)
