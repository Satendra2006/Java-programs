import java.util.Scanner;
class tax
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income:");
        double income=sc.nextInt();
        double tax=0;
        if(income<150000)
        {
            tax=0;
        }
        else if(income>150000 && income<=300000)
        {
            tax=0.1*(income-150000);
        }
        else if(income>300000 && income<=500000)
        {
            tax=15000+0.2*(income-200000);
        }
        else
        {
            tax=55000+0.3*(income-500000);
        }
        System.out.println("Your tax is: "+tax);
    }
}