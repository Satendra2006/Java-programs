import java.util.Scanner;
class roots
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coefficients a, b and c of the quadratic equation (ax^2 + bx + c = 0):");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double D=b*b-4*a*c;
        if(D>0)
        {
            double root1=(-b+Math.sqrt(D))/(2*a);
            double root2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1: "+root1);
            System.out.println("Root 2: "+root2);
        }
        else if(D==0)
        {
            double root=-b/(2*a);
            System.out.println("Roots are real and same.");
            System.out.println("Root: "+root);
        }
        else
        {
            double realPart=-b/(2*a);
            double imagPart=Math.sqrt(-D)/(2*a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1: "+realPart+" + "+imagPart+"i");
            System.out.println("Root 2: "+realPart+" - "+imagPart+"i");
        }
    }
}