import java.util.Scanner;

abstract class Shape {
    abstract double RectangleArea(double length, double width);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}

class Area1 extends Shape {
    double RectangleArea(double length, double width) { return length * width; }
    double SquareArea(double side) { return side * side; }
    double CircleArea(double radius) { return 3.14 * radius * radius; }
}

class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area1 area = new Area1();
        System.out.print("Enter the length: ");
        double l = sc.nextDouble();
        System.out.print("Enter the width: ");
        double w = sc.nextDouble();
        System.out.println("The area of rectangle: " + area.RectangleArea(l, w));
        System.out.print("Enter the side: ");
        double s = sc.nextDouble();
        System.out.println("The area of Square: " + area.SquareArea(s));
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        System.out.println("The area of Circle: " + area.CircleArea(r));
    }
}