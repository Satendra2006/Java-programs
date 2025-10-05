public class GCDCommandLine 
{
    public static void main(String[] args) 
    {
        if(args.length != 2) 
        {
            System.out.println("Error: Please provide exactly two numbers as arguments");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

         int gcd = findGCD(num1, num2);

         System.out.println("Number 1: " + num1);       
         System.out.println("Number 2: " + num2);
         System.out.println("GCD: " + gcd);
    }

    public static int findGCD(int a, int b) 
    {
        if(b == 0) 
        {
            return a;
        }
        return findGCD(b, a % b);
    }
}