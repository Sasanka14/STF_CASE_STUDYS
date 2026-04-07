# cubes.py
# Create cubes of numbers 1–10 using loop and comprehension.

# Using loop
cubes_loop = []
for n in range(1, 11):
    cubes_loop.append(n ** 3)

# Using comprehension
cubes_comp = [n ** 3 for n in range(1, 11)]

print("Cubes with loop:", cubes_loop)
print("Cubes with comprehension:", cubes_comp)
