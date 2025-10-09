import java.util.Scanner;

interface Calc {
    double add(double a, double b);
    double sub(double a, double b);
    double mul(double a, double b);
    double div(double a, double b);
}

class DemoCalculator implements Calc {
    public double add(double a, double b) { return a + b; }
    public double sub(double a, double b) { return a - b; }
    public double mul(double a, double b) { return a * b; }
    public double div(double a, double b) {
        if(b == 0) {
            System.out.println("MathError: Can't be divided by zero");
            return 0;
        } else {
            return a / b;
        }
    }
}

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first operand: ");
        double op1 = sc.nextDouble();
        System.out.print("Enter the second operand: ");
        double op2 = sc.nextDouble();
        System.out.print("Enter the operator: ");
        char optr = sc.next().charAt(0);

        DemoCalculator calc = new DemoCalculator();
        double res = 0;
        switch(optr) {
            case '+': res = calc.add(op1, op2); break;
            case '-': res = calc.sub(op1, op2); break;
            case '*': res = calc.mul(op1, op2); break;
            case '/': res = calc.div(op1, op2); break;
            default: System.out.println("Enter a valid operator!"); return;
        }
        System.out.println("The result is: " + res);
    }
}