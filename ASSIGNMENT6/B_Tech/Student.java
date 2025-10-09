package B_Tech;

public class Student {
    private int rollNo;
    private String Name;
    private int sub1, sub2, sub3, sub4, sub5;

    public Student(String Name, int rollNo, int sub1, int sub2, int sub3, int sub4, int sub5) {
        this.rollNo = rollNo;
        this.Name = Name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
    }

    public int totalMarks() { return sub1 + sub2 + sub3 + sub4 + sub5; }

    public double percentage() { return totalMarks() / 5.0; }

    public void display() {
        System.out.println("The name is " + Name);
        System.out.println("The roll no is " + rollNo);
        System.out.println("The marks of subject 1: " + sub1);
        System.out.println("The marks of subject 2: " + sub2);
        System.out.println("The marks of subject 3: " + sub3);
        System.out.println("The marks of subject 4: " + sub4);
        System.out.println("The marks of subject 5: " + sub5);
        System.out.println("The total marks: " + totalMarks());
        System.out.println("The percentage: " + percentage());
    }
}