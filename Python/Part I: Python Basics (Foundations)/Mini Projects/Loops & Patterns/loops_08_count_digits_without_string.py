# Concept: Counting digits using while loop and integer division

num = int(input("Enter a number: "))

if num == 0:
    count = 1
else:
    count = 0
    temp = abs(num)  # handle negative numbers
    while temp > 0:
        temp = temp // 10
        count += 1

print("Number of digits:", count)
