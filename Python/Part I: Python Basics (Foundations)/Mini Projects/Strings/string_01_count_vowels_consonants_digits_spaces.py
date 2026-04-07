# Concept: String traversal and character classification

text = input("Enter a string: ")

vowels = "aeiouAEIOU"
vowel_count = 0
consonant_count = 0
digit_count = 0
space_count = 0

for ch in text:
    if ch in vowels:
        vowel_count += 1
    elif ch.isalpha():
        consonant_count += 1
    elif ch.isdigit():
        digit_count += 1
    elif ch.isspace():
        space_count += 1

print("Vowels:", vowel_count)
print("Consonants:", consonant_count)
print("Digits:", digit_count)
print("Spaces:", space_count)
