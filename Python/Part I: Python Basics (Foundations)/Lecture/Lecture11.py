# Object and Class
class Student:
    def details(self):
        print("I am a student")
        
s1 = Student()
s1.details()


# Attributes 
# Instance Attributes
class Dog:
    def __init__(self, name, age):
        self.name = name  # Instance attribute
        self.age = age    # Instance attribute

dog1 = Dog("Buddy", 3)
dog2 = Dog("Lucy", 5)

print(dog1.name)  # Output: Buddy
print(dog2.age)   # Output: 5

# Class Attributes
class Dog:
    species = "Canis familiaris"  # Class attribute

    def __init__(self, name, age):
        self.name = name
        self.age = age

dog1 = Dog("Buddy", 3)
dog2 = Dog("Lucy", 5)

print(Dog.species)      # Output: Canis familiaris
print(dog1.species)     # Output: Canis familiaris (accessed via instance)

Dog.species = "Domestic Dog" # Modifying the class attribute
print(dog2.species)     # Output: Domestic Dog (reflects the change)

# Init Method


# Self Method
class Example:
    def show(self):
        print("This is an example method using self.")
        print("Address of self:" , self)
obj=Example()
obj.show()

# Inheritance
class Animal:
    def speak(self):
        print("Animal speaks")
class Dog(Animal):
    def bark(self):
        print("Dog barks")
class Puppy(Dog):
    def weep(self):
        print("Puppy weeps")
d = Dog() 
d.speak() 
d.bark()  
p = Puppy()
p.speak() 
p.bark()

class Cat:
    def Sound(self):
        print("Meow")

class Dog:
    def Sound(self):
        print("Bark")

for animal in (Cat(), Dog()):
    animal.Sound()
    
# Encapculation 
class Amount:
    def __init__(self):
        self.__balance = 1000
    def deposit(self, amount):
        self.__balance += amount
    def show_balance(self):
        print("Balance:", self.__balance)
    def withdraw(self, amount):
        if amount > self.__balance:
            print("Insufficient funds")
        else:
            self.__balance -= amount
        
a1 = Amount()
a1.deposit(500)
a1.withdraw(200)  
a1.show_balance()
# Trying to access the private attribute directly will raise an AttributeError


# Polymorphism



# Abstraction


# Super Function
class Parent:
    def __init__(self):
        print("Parent class constructor called")
class Child(Parent):
    def __init__(self):
        super().__init__()
        print("Child class constructor called")
c = Child()