# hello_world.py

"""
Concepts:
- print()
- input()
- f-strings
"""

def main():
    print("=== Hello World Program ===")
    name = input("Enter your name: ").strip()
    if name:
        print(f"Hello, {name}! Welcome to Python.")
    else:
        print("Hello, world!")

if __name__ == "__main__":
    main()
