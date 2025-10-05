import java.util.Scanner;
class Student {
    String name;
    int rollno;
    String branch;
    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        name = sc.nextLine();
        System.out.print("Enter the roll no of the student: ");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the branch of the student: ");
        branch = sc.nextLine();
    }
    void showDetails() {
        System.out.println("----Student Details----");
        System.out.println("Student name: " + name);
        System.out.println("Student roll no: " + rollno);
        System.out.println("Student Branch: " + branch);
    }
}
class StudentRecord {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.inputDetails();
        s1.showDetails();
    }
}