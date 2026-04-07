"""Design two classes where one class represents a general Animal and other class dog that inherits from the Animal class and shows additional behavior specific to dogs."""
# Base Class (Parent)
class Animal:
    def __init__(self, name):
        self.name = name

    def eat(self):
        print(f"{self.name} is eating.")

    def sleep(self):
        print(f"{self.name} is sleeping.")


# Derived Class (Child)
class Dog(Animal):
    def __init__(self, name, breed):
        # Call parent class constructor
        super().__init__(name)
        self.breed = breed

    # Dog-specific behavior
    def bark(self):
        print(f"{self.name} is barking: Woof! Woof!")

    # Overriding a method (optional but good practice)
    def sleep(self):
        print(f"{self.name} is sleeping lightly like a dog.")


# Creating an object of Dog class
dog1 = Dog("Buddy", "Labrador")

# Accessing Animal class methods
dog1.eat()
dog1.sleep()

# Accessing Dog-specific method
dog1.bark()
