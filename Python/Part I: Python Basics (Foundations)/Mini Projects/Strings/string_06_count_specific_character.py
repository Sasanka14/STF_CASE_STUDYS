# Concept: Counting occurrences of a particular character

s = input("Enter a string: ")
ch = input("Enter a character to count: ")

count = 0
for c in s:
    if c == ch:
        count += 1

print(f"Character '{ch}' occurs {count} time(s).")
