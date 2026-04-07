# Concept: Class with attributes and method

class Student:
    def __init__(self, name, roll, marks):
        # marks is expected to be a list of numbers
        self.name = name
        self.roll = roll
        self.marks = marks

    def compute_average(self):
        total = 0
        for m in self.marks:
            total += m
        return total / len(self.marks)


# Demo usage
if __name__ == "__main__":
    name = input("Enter student name: ")
    roll = input("Enter roll number: ")
    n = int(input("How many subjects? "))

    marks = []
    for i in range(n):
        m = float(input(f"Enter marks of subject {i+1}: "))
        marks.append(m)

    s = Student(name, roll, marks)
    print("Average marks of", s.name, ":", s.compute_average())
