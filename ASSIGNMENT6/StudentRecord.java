import B_Tech.Student;
import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the roll no: ");
        int rollNo = sc.nextInt();
        System.out.print("Enter the marks of subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter the marks of subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter the marks of subject 3: ");
        int m3 = sc.nextInt();
        System.out.print("Enter the marks of subject 4: ");
        int m4 = sc.nextInt();
        System.out.print("Enter the marks of subject 5: ");
        int m5 = sc.nextInt();
        System.out.println("-------Student Details-------");
        Student s = new Student(name, rollNo, m1, m2, m3, m4, m5);
        s.display();
    }
}