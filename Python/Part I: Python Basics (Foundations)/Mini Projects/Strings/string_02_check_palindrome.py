# Concept: String reversal and comparison

s = input("Enter a string: ")

# Convert to lowercase for case-insensitive comparison
cleaned = s.lower()

if cleaned == cleaned[::-1]:
    print("Palindrome")
else:
    print("Not a palindrome")
