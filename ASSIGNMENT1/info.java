import java.util.Scanner;
class info
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Enter the branch:");
        String branch=sc.next();
        System.out.println("Enter your roll number:");
        int roll=sc.nextInt();
        System.out.println("Enter ypur college name:");
        String college=sc.next();
        System.out.println("Name:"+name);
        System.out.println("Branch:"+branch);
        System.out.println("Roll number:"+roll);
        System.out.println("College name:"+college);
    }
}