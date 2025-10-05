import java.util.Scanner;
class Complex {
    int real, imag;
    void initialise(int r, int i) {
        real = r;
        imag = i;
    }
    void display() {
        System.out.println(real + "+" + imag + "i");
    }
    Complex add(Complex c) {
        Complex temp = new Complex();
        temp.real = this.real + c.real;
        temp.imag = this.imag + c.imag;
        return temp;
    }
}
class ComplexMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        System.out.print("Enter real part of first complex number: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part of first complex number: ");
        int i1 = sc.nextInt();
        c1.initialise(r1, i1);
        System.out.print("Enter real part of second complex number: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part of second complex number: ");
        int i2 = sc.nextInt();
        c2.initialise(r2, i2);

        System.out.print("First Complex Number: ");
        c1.display();
        System.out.print("Second Complex Number: ");
        c2.display();
        Complex sum = c1.add(c2);
        System.out.print("Sum of Complex Numbers: ");
        sum.display();
    }
}