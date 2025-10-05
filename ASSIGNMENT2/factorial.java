import java.util.Scanner;
class factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a non-negative integer to compute its factorial:");
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else
        {
            long fact=1;
            for(int i=1;i<=n;i++)
            {
                fact*=i;
            }
            System.out.println("The factorial of "+n+" is: "+fact);
        }
    }
}