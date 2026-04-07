# Concept: Index-based string access

s = input("Enter a string: ")

print("Characters at even index positions:")
for i in range(0, len(s), 2):
    print(f"Index {i}: {s[i]}")
