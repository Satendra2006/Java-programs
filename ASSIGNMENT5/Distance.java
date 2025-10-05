import java.util.Scanner;

class Point2D {
int x, y;

Point2D() {
this.x = 0;
        	this.y = 0;
}

Point2D(int x, int y) {
        	this.x = x;
        	this.y = y;
}

void display() {
        System.out.println("Point2D Coordinates: (" + x + ", " + y + ")");
}
}

class Point3D extends Point2D {
    	int z;

    	Point3D(int x, int y, int z) {
        		super(x, y);
        		this.z = z;
    	}

    	void show() {
        		System.out.println("Point3D Coordinates: (" + x + ", " + y + ", " + z + ")");
    	}
}

class Distance {
    	public static void main(String[] args) {
        		Scanner sc = new Scanner(System.in);

        		System.out.println("Enter coordinates for Point2D:");
        		System.out.print("x: ");
        		int x2d = sc.nextInt();
       		System.out.print("y: ");
        		int y2d = sc.nextInt();

        		Point2D p1 = new Point2D(x2d, y2d);

        		p1.display();

        		System.out.println("\nEnter coordinates for Point3D:");
        		System.out.print("x: ");
        		int x3d = sc.nextInt();
        		System.out.print("y: ");
        		int y3d = sc.nextInt();
       		System.out.print("z: ");
        		int z3d = sc.nextInt();

        		Point3D p2 = new Point3D(x3d, y3d, z3d);

        		p2.show();
    	}
}
