import java.util.Scanner;

abstract class Figure {
    	double dim1;
    	double dim2;

    	Figure(double dim1, double dim2) {
        		this.dim1 = dim1;
        		this.dim2 = dim2;
    	}

    	abstract double getArea();
}

class Rectangle extends Figure {
    	Rectangle(double length, double width) {
        		super(length, width);
    	}

    	double getArea() {
        		return dim1 * dim2;
    	}
}

class Triangle extends Figure {
    	Triangle(double base, double height) {
        		super(base, height);
    	}

    	double getArea() {
        		return 0.5 * dim1 * dim2;
    	}
}

class AbsFigArea {
    	public static void main(String args[]) {
        		Scanner sc = new Scanner(System.in);

        		Figure fig;
	
        	System.out.print("Enter the length: ");
        	double l = sc.nextDouble();
        	System.out.print("Enter the width: ");
       	double w = sc.nextDouble();
        	fig = new Rectangle(l, w);
        	System.out.println("The area of rectangle is: " + fig.getArea());

        	System.out.print("Enter the base: ");
        	double b = sc.nextDouble();
        	System.out.print("Enter the height: ");
        	double h = sc.nextDouble();
        	fig = new Triangle(b, h);
        	System.out.println("The area of triangle is: " + fig.getArea());
    	}
}

