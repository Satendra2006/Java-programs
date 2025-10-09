import Org.Shapes.Square;
import Org.Shapes.Triangle;
import Org.Shapes.Circle;
import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape:");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter side of square: ");
                double side = sc.nextDouble();
                Square sq = new Square(side);
                System.out.println("Area: " + sq.area());
                System.out.println("Perimeter: " + sq.perimeter());
                break;
            case 2:
                System.out.print("Enter sides a, b, c of triangle: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                Triangle tri = new Triangle(a, b, c);
                System.out.println("Area: " + tri.area());
                System.out.println("Perimeter: " + tri.perimeter());
                break;
            case 3:
                System.out.print("Enter radius of circle: ");
                double r = sc.nextDouble();
                Circle cir = new Circle(r);
                System.out.println("Area: " + cir.area());
                System.out.println("Perimeter: " + cir.perimeter());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}