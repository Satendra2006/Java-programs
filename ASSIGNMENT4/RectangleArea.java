import java.util.Scanner;
class Area {
    int length, breadth;
    void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    int getArea() {
        return this.length * this.breadth;
    }
}
class RectangleArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle (in m): ");
        int l = sc.nextInt();
        System.out.print("Enter breadth of rectangle (in m): ");
        int b = sc.nextInt();
        Area rect = new Area();
        rect.setDim(l, b);
        System.out.println("Area of rectangle: " + rect.getArea() + " m^2");
    }
}