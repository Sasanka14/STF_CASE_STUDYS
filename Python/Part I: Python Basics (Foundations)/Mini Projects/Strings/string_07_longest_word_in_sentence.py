# Concept: Splitting a sentence and finding longest word

sentence = input("Enter a sentence: ")

words = sentence.split()

if len(words) == 0:
    print("No words found.")
else:
    longest = words[0]
    for w in words[1:]:
        if len(w) > len(longest):
            longest = w

    print("Longest word is:", longest)
    print("Length:", len(longest))
