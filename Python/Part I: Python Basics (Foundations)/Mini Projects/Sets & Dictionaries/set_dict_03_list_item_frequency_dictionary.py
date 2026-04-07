# Concept: Frequency counter using dictionary from list

n = int(input("How many items in list? "))
lst = []

for i in range(n):
    val = input(f"Enter item {i+1}: ")
    lst.append(val)

freq = {}
for item in lst:
    if item in freq:
        freq[item] += 1
    else:
        freq[item] = 1

print("Frequencies:")
for key, value in freq.items():
    print(key, "->", value)
