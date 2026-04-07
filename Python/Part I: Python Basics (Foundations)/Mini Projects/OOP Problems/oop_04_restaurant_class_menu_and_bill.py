# Concept: Using dictionary inside a class to store menu and calculate bill

class Restaurant:
    def __init__(self, name):
        self.name = name
        # menu: item -> price
        self.menu = {}

    def add_item(self, item, price):
        self.menu[item] = price

    def print_menu(self):
        print(f"Menu of {self.name}:")
        for item, price in self.menu.items():
            print(item, "->", price)

    def print_bill(self, order_dict):
        # order_dict: item -> quantity
        total = 0
        print("Bill details:")
        for item, qty in order_dict.items():
            if item in self.menu:
                cost = self.menu[item] * qty
                total += cost
                print(f"{item} x {qty} = {cost}")
            else:
                print(f"{item} not found in menu.")
        print("Total bill amount:", total)


if __name__ == "__main__":
    r = Restaurant("MyCafe")

    n = int(input("How many items to add in menu? "))
    for i in range(n):
        item = input(f"Enter name of item {i+1}: ")
        price = float(input(f"Enter price of {item}: "))
        r.add_item(item, price)

    r.print_menu()

    order = {}
    m = int(input("How many different items are ordered? "))
    for i in range(m):
        item = input(f"Enter ordered item {i+1}: ")
        qty = int(input(f"Enter quantity of {item}: "))
        order[item] = qty

    r.print_bill(order)
