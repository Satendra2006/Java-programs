import java.util.Scanner;
class sumi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        float a=sc.nextFloat();
        System.out.println("Enter the value of b:");
        float b=sc.nextFloat();
        float sum=a+b;
        System.out.println("Sum is:"+sum);
    }
}