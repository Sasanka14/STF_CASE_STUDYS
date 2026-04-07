# Concept: Iteration over tuple and conditional check

n = int(input("How many numbers in tuple? "))
temp_list = []

for i in range(n):
    val = float(input(f"Enter number {i+1}: "))
    temp_list.append(val)

tup = tuple(temp_list)
print("Original tuple:", tup)

print("Numbers greater than 50:")
for num in tup:
    if num > 50:
        print(num)
