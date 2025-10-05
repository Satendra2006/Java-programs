import java.util.Scanner;
class Person {
    	String name;

    	Person(String name) {
        		this.name = name;
    	}

    	void display() {
        		System.out.println("Name : " + name);
    	}
}

class Employee extends Person {
    	private int empid;

    	Employee(String name, int empid) {
        		super(name);
        		this.empid = empid;
    	}

    	void display() {
        		super.display();
        		System.out.println("EmpID : " + empid);
    	}

    	int getEmpId() {
        		return empid;
    	}
}

class HourlyEmployee extends Employee {
    	private double hourlyRate;
    	private int hoursWorked;

    	HourlyEmployee(String name, int empid, double hourlyRate, int hoursWorked) {
       		super(name, empid);
        		this.hourlyRate = hourlyRate;
        		this.hoursWorked = hoursWorked;
    	}

    	double getGrossPay() {
        		return hourlyRate * hoursWorked;
    	}

    	void display() {
        		super.display();
        		System.out.println("Hourly Rate : " + hourlyRate);
        		System.out.println("Hours worked : " + hoursWorked);
        		System.out.println("Gross pay : " + getGrossPay());
    	}
}

class EmpRecord {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
        		String name = sc.nextLine();

        		System.out.print("Enter Employee ID: ");
        		int empid = sc.nextInt();

        		System.out.print("Enter Hourly Rate: ");
        		double hourlyRate = sc.nextDouble();

        		System.out.print("Enter Hours Worked: ");
        		int hoursWorked = sc.nextInt();

        		HourlyEmployee he = new HourlyEmployee(name, empid, hourlyRate, hoursWorked);
        		System.out.println("\n--- Employee Details ---");
        		he.display();
    	}
}
