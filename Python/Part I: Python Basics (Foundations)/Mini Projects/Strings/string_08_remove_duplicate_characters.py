# Concept: Building a new string while skipping duplicates

s = input("Enter a string: ")

result = ""
for ch in s:
    if ch not in result:
        result += ch

print("String after removing duplicate characters:", result)

