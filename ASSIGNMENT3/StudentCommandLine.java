public class StudentCommandLine 
{
    public static void main(String[] args) 
    {
        if(args.length != 9) 
        {
            System.out.println("Error: Please provide exactly 9 arguments (SIC, name, branch, and 6 subject marks)");
            return;
        }
        String sic = args[0];
        String name = args[1];
        String branch = args[2];

        int[] marks = new int[6];
        int totalMarks = 0;
        for(int i = 0; i < 6; i++) 
        {
            marks[i] = Integer.parseInt(args[i + 3]);
   	        totalMarks += marks[i];
        }

            double average = (double) totalMarks / 6;

            System.out.println("Student Details:");
            System.out.println("SIC: " + sic);
            System.out.println("Name: " + name);
            System.out.println("Branch: " + branch);
            System.out.print("Marks: ");
            for(int i = 0; i < 6; i++) 
            {
				System.out.print(marks[i] + " ");
            }
            System.out.println();
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Marks: " + average);
    }
}