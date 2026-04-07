# multiples_of_three.py
# Multiples of 3 from 3–300 using comprehension.

multiples = [n for n in range(3, 301, 3)]

print("Length:", len(multiples))
print("Sample slice (first 10):", multiples[:10])