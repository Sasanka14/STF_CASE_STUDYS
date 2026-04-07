"""Write a Python Program to calculate the area of a circular garden and the costing of a fencing it. 
The radius should be taken as variable in the code."""
import math

def calculate_garden_area_and_fencing_cost(radius, cost_per_meter):
    # Calculate area of the circular garden
    area = math.pi * (radius ** 2)
    
    # Calculate circumference for fencing
    circumference = 2 * math.pi * radius
    
    # Calculate total cost of fencing
    total_cost = circumference * cost_per_meter
    
    return area, total_cost

# Input Section

print("=== Circular Garden Area and Fencing Cost Calculator ===")
while True: 
    try:
        radius = float(input("Enter the radius of the circular garden (in meters): "))
        if radius <= 0:
            print("Radius must be a positive number.")
            continue
        break
    except ValueError:
        print("Please enter a valid number for radius.")
while True:
    try:
        cost_per_meter = float(input("Enter the cost of fencing per meter: "))
        if cost_per_meter < 0:
            print("Cost per meter cannot be negative.")
            continue
        break
    except ValueError:
        print("Please enter a valid number for cost per meter.")
        
# Calculate area and fencing cost
area, total_cost = calculate_garden_area_and_fencing_cost(radius, cost_per_meter)
# Display results

print(f"Area of the circular garden: {area:.2f} square meters")
print(f"Total cost of fencing: Rs{total_cost:.2f}")