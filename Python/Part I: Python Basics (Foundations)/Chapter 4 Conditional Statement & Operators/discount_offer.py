# discount_offer.py
# Age-based discount using logical operators.

age = int(input("Enter your age: "))

if age < 18 or age > 60:
    print("🎉 You are eligible for a special discount!")
else:
    print("Sorry, no discount available.")
