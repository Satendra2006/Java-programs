import java.util.Scanner;
class marks
{
    public static void main(String args[])
    {   
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks of 3 subjects:");
    float sum=0;
    for(int i=0;i<3;i++)
    {
        System.out.println("Subject"+(i+1)+"=");
        sum=sum+sc.nextFloat();
    }
    System.out.println("Average="+sum/3);
    }
}