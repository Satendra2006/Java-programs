import java.util.Scanner;
class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double distance(Point p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
class Distance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate of first point: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y coordinate of first point: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x coordinate of second point: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y coordinate of second point: ");
        int y2 = sc.nextInt();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        double dist = p1.distance(p2);
        System.out.println("The distance between two points: " + dist +"units");
    }
}