"""Write a Python Program that displays the current date and time and calculate how many days are left until the New Year."""

from datetime import datetime
def days_until_new_year():
    # Get the current date and time
    now = datetime.now()
    print("Current date and time:", now.strftime("%Y-%m-%d %H:%M:%S"))
    
    # Create a date object for the next New Year
    next_new_year = datetime(now.year + 1, 1, 1)
    
    # Calculate the difference in days
    delta = next_new_year - now
    return delta.days
# Calculate days until New Year
days_left = days_until_new_year()
# Display result
print(f"Days left until New Year: {days_left} days")
