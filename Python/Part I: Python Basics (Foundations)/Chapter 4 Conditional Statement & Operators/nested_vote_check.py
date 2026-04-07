# nested_vote_check.py
# Nested if for age and citizenship.

age = int(input("Enter your age: "))
citizen = input("Are you an Indian citizen? (yes/no): ").strip().lower()

if age >= 18:
    if citizen == "yes":
        print("🗳️ You are eligible to vote.")
    else:
        print("❌ You must be an Indian citizen to vote.")
else:
    print("❌ You must be at least 18 years old to vote.")
