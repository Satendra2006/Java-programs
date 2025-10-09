import java.util.Scanner;

interface Add { double add(double a, double b); }
interface Sub { double sub(double a, double b); }
interface Mul { double mul(double a, double b); }
interface Div { double div(double a, double b); }
interface Power { double pow(double base, double exp); }

class Calculator implements Add, Sub, Mul, Div, Power {
    public double add(double a, double b) { return a + b; }
    public double sub(double a, double b) { return a - b; }
    public double mul(double a, double b) { return a * b; }
    public double div(double a, double b) {
        if(b == 0) {
            System.out.println("MathError: Can't be divided by 0!");
            return -1;
        } else {
            return a / b;
        }
    }
    public double pow(double base, double exp) { return Math.pow(base, exp); }
    double quadratic(double x) { return add(pow(x, 2), add(mul(2, x), 1)); }
}

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first operand: ");
        double op1 = sc.nextDouble();
        System.out.print("Enter the second operand: ");
        double op2 = sc.nextDouble();
        System.out.print("Enter the operator: ");
        char optr = sc.next().charAt(0);

        Calculator calc = new Calculator();
        double res = 0;
        switch(optr) {
            case '+': res = calc.add(op1, op2); break;
            case '-': res = calc.sub(op1, op2); break;
            case '*': res = calc.mul(op1, op2); break;
            case '/': res = calc.div(op1, op2); break;
            case '^': res = calc.pow(op1, op2); break;
            case 'q': res = calc.quadratic(op1); break;
            default: System.out.println("Enter a valid operator!"); return;
        }
        System.out.println("The result is: " + res);
    }
}