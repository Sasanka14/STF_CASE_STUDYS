// Design a C++ program to calculates the area of different shapes using inheritance and polymorphism.
#include <iostream>
#include <cmath>
using namespace std;
class Shape
{
public:
    virtual double area() const = 0;
};
class Circle : public Shape
{
private:
    double radius;

public:
    Circle(double r) : radius(r) {}
    double area() const override
    {
        return M_PI * radius * radius;
    }
};
class Rectangle : public Shape
{
private:
    double width, height;

public:
    Rectangle(double w, double h) : width(w), height(h) {}
    double area() const override
    {
        return width * height;
    }
};
class Triangle : public Shape
{
private:
    double base, height;

public:
    Triangle(double b, double h) : base(b), height(h) {}
    double area() const override
    {
        return 0.5 * base * height;
    }
};
class Square : public Shape
{
private:
    double side;

public:
    Square(double s) : side(s) {}
    double area() const override
    {
        return side * side;
    }
};
class Rhombus : public Shape
{
private:
    double diagonal1, diagonal2;

public:
    Rhombus(double d1, double d2) : diagonal1(d1), diagonal2(d2) {}
    double area() const override
    {
        return 0.5 * diagonal1 * diagonal2;
    }
};
int main()
{
    Circle circle(5.6);
    Rectangle rectangle(4.9, 6.0);
    Triangle triangle(4.0, 8.0);
    Square square(5.9);
    Rhombus rhombus(6.9, 8.0);
    cout << "Area of Circle: " << circle.area() << endl;
    cout << "Area of Rectangle: " << rectangle.area() << endl;
    cout << "Area of Triangle: " << triangle.area() << endl;
    cout << "Area of Square: " << square.area() << endl;
    cout << "Area of Rhombus: " << rhombus.area() << endl;
    return 0;
}
