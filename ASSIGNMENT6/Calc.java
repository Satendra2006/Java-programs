import B_Tech.Arithmetic.MyMath;
import java.util.Scanner;

public class Calc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMath math = new MyMath();
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Addition: " + math.add(a, b));
        System.out.println("Subtraction: " + math.sub(a, b));
        System.out.println("Multiplication: " + math.mul(a, b));
        System.out.println("Division: " + math.div(a, b));
        System.out.println("Modulus: " + math.mod(a, b));
    }
}