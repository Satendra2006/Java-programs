public class AdditionCommandLine 
{
    public static void main(String[] args) 
    {
        if(args.length != 2) 
        {
            System.out.println("Error: Please provide exactly two numbers as arguments");
            return;
        }
        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println("Sum: " + sum);
    }
}