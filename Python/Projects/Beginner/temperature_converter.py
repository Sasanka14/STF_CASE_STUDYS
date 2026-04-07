# temperature_converter.py

"""
Concepts:
- multiple functions
- dictionaries for mapping
- formatted output
"""

def c_to_f(c): return c * 9/5 + 32
def f_to_c(f): return (f - 32) * 5/9
def c_to_k(c): return c + 273.15
def k_to_c(k): return k - 273.15

def convert(value, from_unit, to_unit):
    from_unit = from_unit.upper()
    to_unit = to_unit.upper()

    if from_unit == to_unit:
        return value

    # Convert everything via Celsius
    if from_unit == "C":
        c = value
    elif from_unit == "F":
        c = f_to_c(value)
    elif from_unit == "K":
        c = k_to_c(value)
    else:
        raise ValueError("Unsupported from_unit.")

    if to_unit == "C":
        return c
    elif to_unit == "F":
        return c_to_f(c)
    elif to_unit == "K":
        return c_to_k(c)
    else:
        raise ValueError("Unsupported to_unit.")


def main():
    print("=== Temperature Converter (C, F, K) ===")
    try:
        value = float(input("Enter temperature value: "))
        from_unit = input("From unit (C/F/K): ")
        to_unit = input("To unit (C/F/K): ")

        result = convert(value, from_unit, to_unit)
        print(f"{value:.2f}{from_unit.upper()} = {result:.2f}{to_unit.upper()}")
    except ValueError as e:
        print("Error:", e)


if __name__ == "__main__":
    main()
