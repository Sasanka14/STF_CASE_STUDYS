# Concept: Encapsulation using name-mangled private attribute and validation method

class User:
    def __init__(self, username, password):
        self.username = username
        self.__password = password  

    def validate_login(self, username, password):
        if self.username == username and self.__password == password:
            print("Login successful.")
        else:
            print("Invalid username or password.")


if __name__ == "__main__":
    uname = input("Set username: ")
    pwd = input("Set password: ")

    user = User(uname, pwd)

    print("\n--- Login ---")
    uname_try = input("Enter username: ")
    pwd_try = input("Enter password: ")

    user.validate_login(uname_try, pwd_try)
