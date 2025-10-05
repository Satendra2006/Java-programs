public class EmployeeCommandLine 
{
    private int empId;
    private String empName;
    private int deptNo;
    private double salary;

    public EmployeeCommandLine(int empId, String empName, int deptNo, double salary) 
    {
        this.empId = empId;
        this.empName = empName;
        this.deptNo = deptNo;
        this.salary = salary;
    }

    public void display() 
    {
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department Number: " + deptNo);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) 
    {
        if(args.length != 4) 
        {
            System.out.println("Error: Please provide exactly four arguments (empId, empName, deptNo, salary)");
            return;
        }
        int empId = Integer.parseInt(args[0]);
        String empName = args[1];
        int deptNo = Integer.parseInt(args[2]);
        double salary = Double.parseDouble(args[3]);

        EmployeeCommandLine emp = new EmployeeCommandLine(empId, empName, deptNo, salary);
        emp.display();
    	}
}