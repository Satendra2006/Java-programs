class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }

    void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing Triangle");
    }

    void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }

    void erase() {
        System.out.println("Erasing Square");
    }
}
public class DrawShape {

    public static void main(String[] args) {

        Shape shape;

        shape = new Circle();
        shape.draw();
        shape.erase();

        shape = new Triangle();
        shape.draw();
        shape.erase();

        shape = new Square();
        shape.draw();
        shape.erase();
    }
}