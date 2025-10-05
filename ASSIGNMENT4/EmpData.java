import java.util.Scanner;
class Employee {
    int id;
    String name;
    String department;
    double salary;
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }
    void putData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
class EmpData {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee employees[] = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Details of Employee " + (i + 1));
            employees[i] = new Employee();
            employees[i].getData();
        }
        System.out.println("--- Employee Details ---");
        for (int i = 0; i < n; i++) {
            employees[i].putData();
        }
    }
}