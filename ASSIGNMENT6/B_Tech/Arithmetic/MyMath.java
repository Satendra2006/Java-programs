package B_Tech.Arithmetic;

public class MyMath {
    public int add(int a, int b) { return a + b; }
    public int sub(int a, int b) { return a - b; }
    public int mul(int a, int b) { return a * b; }
    public double div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero not allowed");
            return Double.NaN;
        }
        return (double)a / b;
    }
    public int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Modulus by zero not allowed");
            return a;
        }
        return a % b;
    }
}