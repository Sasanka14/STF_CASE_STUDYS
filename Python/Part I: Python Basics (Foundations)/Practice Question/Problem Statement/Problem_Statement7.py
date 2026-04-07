"""Write a Python Program for Fitness Tracker that performs the following tasks:
1. Continuously ask the user to enter their daily step count.
2. The user can type -1 to stop entering step counts.
3. The Program should:
   a. Ignore any negative numbers (except -1) using continue
   b. Stop taking input when -1 is entered using break
4. After input is complete, display:
   a. Total number of days step counts were entered
   b. Total steps taken
   c. Average daily steps
   d. A fitness level based on the average daily steps using the following criteria:
      - Excellent: 10000 steps or more
      - Good: 7000 to 9999 steps
      - Average: 4000 to 6999 steps
      - Poor: Below 4000 steps
5. Finally, use a for loop and range function to display all possible fitness levels and their corresponding step ranges.
"""

# 🏋️‍♂️ ADVANCED FITNESS TRACKER (AUTO WEEKLY PROMPT) 🏃‍♂️

print("══════════════════════════════════════════════════════")
print("🏃‍♂️ WELCOME TO THE ADVANCED FITNESS TRACKER 🏋️‍♀️")
print("══════════════════════════════════════════════════════")
print("Track your health week by week. Type -1 for steps to end.\n")

week_number = 1

while True:
    print(f"\n📅 --- WEEK {week_number} TRACKING STARTED ---")
    daily_data = []
    day = 1

    while True:
        try:
            steps = int(input(f"\nEnter Steps for Day {day}: "))

            # End input early if user types -1 before 7 days
            if steps == -1 and day <= 7:
                break

            # After exactly 7 days, stop and ask for continuation
            if day > 7:
                break

            if steps < 0:
                print("❌ Invalid steps! Please re-enter.")
                continue

            calories = float(input("Enter Calories Burned (kcal): "))
            water = float(input("Enter Water Intake (litres): "))
            sleep = float(input("Enter Sleep Hours: "))

            daily_data.append({
                "Day": day,
                "Steps": steps,
                "Calories": calories,
                "Water": water,
                "Sleep": sleep
            })

            print(f"✅ Data recorded for Day {day}.")
            day += 1

            # Automatically ask to continue after 7 days
            if day > 7:
                print("\n✅ You have completed 7 days of tracking.")
                break

        except ValueError:
            print("⚠️ Invalid input! Please enter numbers only.")
            continue

    # No data recorded
    if len(daily_data) == 0:
        print("\nNo data recorded. Exiting tracker.")
        break

    # ----------------------------------------------------------
    # 📋 DAILY SUMMARY (TABULAR)
    # ----------------------------------------------------------
    print(f"\n📋 --- WEEK {week_number} DAILY SUMMARY ---")
    print("══════════════════════════════════════════════════════")
    print(f"{'Day':<5}{'Steps':<10}{'Calories (kcal)':<18}{'Water (L)':<12}{'Sleep (hrs)':<12}")
    print("------------------------------------------------------")
    for entry in daily_data:
        print(f"{entry['Day']:<5}{entry['Steps']:<10}{entry['Calories']:<18}{entry['Water']:<12}{entry['Sleep']:<12}")

    # ----------------------------------------------------------
    # 📊 WEEKLY SUMMARY
    # ----------------------------------------------------------
    total_steps = sum(e['Steps'] for e in daily_data)
    total_calories = sum(e['Calories'] for e in daily_data)
    total_water = sum(e['Water'] for e in daily_data)
    total_sleep = sum(e['Sleep'] for e in daily_data)

    avg_steps = total_steps / len(daily_data)
    avg_calories = total_calories / len(daily_data)
    avg_water = total_water / len(daily_data)
    avg_sleep = total_sleep / len(daily_data)

    print("\n📈 --- WEEKLY SUMMARY ---")
    print("══════════════════════════════════════════════════════")
    print(f"Days Tracked: {len(daily_data)}")
    print(f"Total Steps: {total_steps}")
    print(f"Average Daily Steps: {avg_steps:.2f}")
    print(f"Total Calories Burned: {total_calories:.2f} kcal")
    print(f"Average Water Intake: {avg_water:.2f} L/day")
    print(f"Average Sleep Duration: {avg_sleep:.2f} hrs/day")

    # ----------------------------------------------------------
    # 🧠 FITNESS LEVEL
    # ----------------------------------------------------------
    if avg_steps >= 10000 and avg_sleep >= 7 and avg_water >= 2.5:
        fitness_level = "🏅 Excellent"
    elif avg_steps >= 7000 and avg_sleep >= 6:
        fitness_level = "💪 Good"
    elif avg_steps >= 4000:
        fitness_level = "🙂 Average"
    else:
        fitness_level = "⚠️ Poor"

    print("\n🩺 --- FITNESS STATUS ---")
    print(f"Your Overall Fitness Level for Week {week_number}: {fitness_level}")
    print("Keep improving every day — discipline is destiny. 💫")

    # ----------------------------------------------------------
    # 📘 FITNESS GUIDE
    # ----------------------------------------------------------
    print("\n📘 --- FITNESS LEVEL GUIDE ---")
    print("══════════════════════════════════════════════════════")
    levels = ["Excellent", "Good", "Average", "Poor"]
    ranges = [
        "Steps ≥ 10000, Sleep ≥ 7 hrs, Water ≥ 2.5L",
        "7000 ≤ Steps < 10000, Sleep ≥ 6 hrs",
        "4000 ≤ Steps < 7000",
        "Steps < 4000"
    ]
    for i in range(len(levels)):
        print(f"{levels[i]:<10} → {ranges[i]}")

    # ----------------------------------------------------------
    # ASK AFTER 7 DAYS
    # ----------------------------------------------------------
    if len(daily_data) >= 7:
        choice = input("\nDo you want to continue to the next week? (yes/no): ").strip().lower()
        if choice not in ["yes", "y"]:
            print("\n🏁 Tracking Completed. Stay disciplined and keep growing stronger! 💪")
            break
        else:
            week_number += 1
            print("\n🚀 Starting a new week... Stay consistent!\n")
    else:
        print("\n🏁 Tracking ended early. Stay consistent next week! 💪")
        break
