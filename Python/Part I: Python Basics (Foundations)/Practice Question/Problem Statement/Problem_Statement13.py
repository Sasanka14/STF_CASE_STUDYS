"""Create a class to store details of a mobile phone such as brand  and price,  and then create objects to display the information."""

class MobilePhone:
    def __init__(self, brand, price):
        self.brand = brand
        self.price = price

    def display_info(self):
        print(f"Brand: {self.brand}, Price: Rs{self.price}")

# Creating objects of MobilePhone class
phone1 = MobilePhone("Apple", 999)
phone2 = MobilePhone("Samsung", 799)
phone3 = MobilePhone("OnePlus", 699)

# Displaying information
phone1.display_info()
phone2.display_info()
phone3.display_info()

