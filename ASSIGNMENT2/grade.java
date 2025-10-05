import java.util.Scanner;
class grade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks:");
        double sum=0;
        for(int i=0;i<4;i++)
        {
            System.out.println("SUBJECT "+(i+1)+":");
            double marks=sc.nextDouble();
            sum+=marks;
        }
        double avg=sum/4;
        System.out.println("Your average marks is: "+avg);
        char grade;
        if(avg>=90)
        {
            grade='O';
        }
        else if(avg>=80 && avg<90)
        {
            grade='E';
        }
        else if(avg>=70 && avg<80)
        {
            grade='A';
        }
        else if(avg>=60 && avg<70)
        {
            grade='B';
        }
        else if(avg>=50 && avg<60)
        {
            grade='C';
        }
        else
        {
            grade='F';
        }
        System.out.println("Your grade is: "+grade);
    }
}