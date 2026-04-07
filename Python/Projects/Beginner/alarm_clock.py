# alarm_clock.py

"""
Concepts:
- datetime and time modules
- while loop with sleep
- basic parsing of time strings
"""

from datetime import datetime
import time


def parse_time(timestr):
    return datetime.strptime(timestr, "%H:%M").time()


def main():
    print("Simple Alarm Clock")
    alarm_str = input("Set alarm time (24h format HH:MM): ").strip()

    try:
        alarm_time = parse_time(alarm_str)
    except ValueError:
        print("Invalid time format.")
        return

    print(f"Alarm set for {alarm_time.strftime('%H:%M')}. Waiting...")

    while True:
        now = datetime.now().time()
        if now.hour == alarm_time.hour and now.minute == alarm_time.minute:
            print("\n⏰ Wake up! Alarm ringing! ⏰")
            break
        time.sleep(10)  # check every 10 seconds


if __name__ == "__main__":
    main()
